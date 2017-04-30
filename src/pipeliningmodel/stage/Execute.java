package pipeliningmodel.stage;

import java.util.concurrent.SynchronousQueue;

public class Execute implements Runnable{

    SynchronousQueue<Integer> ID_EX;
    SynchronousQueue<Integer> EX_MEM;
    
    public Execute(SynchronousQueue<Integer> ID_EX, SynchronousQueue<Integer> EX_MEM){
        this.ID_EX = ID_EX;
        this.EX_MEM = EX_MEM;
    }
    
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Thread Id: " + Thread.currentThread().getId() + " - execute start");
        try {
            int data = this.ID_EX.take();
            System.out.println("Thread Id: " + Thread.currentThread().getId() + " - get data: " + data);
            data = data - 2;
            this.EX_MEM.put(data);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Thread Id: " + Thread.currentThread().getId() + " - execute end");
    }

}
