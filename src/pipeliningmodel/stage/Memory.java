package pipeliningmodel.stage;

import java.util.concurrent.SynchronousQueue;

public class Memory implements Runnable{

    SynchronousQueue<Integer> EX_MEM;
    SynchronousQueue<Integer> MEM_WB;
    
    public Memory(SynchronousQueue<Integer> EX_MEM, SynchronousQueue<Integer> MEM_WB){
        this.EX_MEM = EX_MEM;
        this.MEM_WB = MEM_WB;
    }
    
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Thread Id: " + Thread.currentThread().getId() + " - memory start");
        
        try {
            int data = this.EX_MEM.take();
            System.out.println("Thread Id: " + Thread.currentThread().getId() + " - get data: " + data);
            data = data - 2;
            this.MEM_WB.put(data);
            
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println("Thread Id: " + Thread.currentThread().getId() + " - memory end");
    }
}
