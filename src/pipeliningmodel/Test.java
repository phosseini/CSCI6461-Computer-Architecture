package pipeliningmodel;

import java.util.concurrent.SynchronousQueue;

import pipeliningmodel.stage.Decode;
import pipeliningmodel.stage.Execute;
import pipeliningmodel.stage.Fetch;
import pipeliningmodel.stage.Memory;
import pipeliningmodel.stage.WriteBack;

public class Test {

    public static void main(String[] args) {
        SynchronousQueue<Integer> IF_ID = new SynchronousQueue<Integer>(true);
        SynchronousQueue<Integer> ID_EX = new SynchronousQueue<Integer>(true);
        SynchronousQueue<Integer> EX_MEM = new  SynchronousQueue<Integer>(true);
        SynchronousQueue<Integer> MEM_WB = new  SynchronousQueue<Integer>(true);
        
        Fetch fetch = new Fetch(IF_ID);
        Decode decode = new Decode(IF_ID, ID_EX);
        Execute execute = new Execute(ID_EX, EX_MEM);
        Memory memory = new Memory(EX_MEM, MEM_WB);
        WriteBack writeback = new WriteBack(MEM_WB);
        
        Thread t1 = new Thread(fetch);
        Thread t2 = new Thread(decode);
        Thread t3 = new Thread(execute);
        Thread t4 = new Thread(memory);
        Thread t5 = new Thread(writeback);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    }

}
