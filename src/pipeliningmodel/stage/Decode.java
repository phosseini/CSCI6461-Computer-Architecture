package pipeliningmodel.stage;

import java.util.concurrent.SynchronousQueue;

public class Decode implements Runnable {

    SynchronousQueue<Integer> IF_ID;
    SynchronousQueue<Integer> ID_EX;

    public Decode(SynchronousQueue<Integer> IF_ID, SynchronousQueue<Integer> ID_EX) {
        this.IF_ID = IF_ID;
        this.ID_EX = ID_EX;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

        System.out.println("Thread Id: " + Thread.currentThread().getId() + " - decode start");
        try {
            int data = this.IF_ID.take();
            System.out.println("Thread Id: " + Thread.currentThread().getId() + " - get data: " + data);
            data = data - 2;
            this.ID_EX.put(data - 2);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Thread Id: " + Thread.currentThread().getId() + " - decode end");

    }

}
