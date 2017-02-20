package memory;

import java.util.ArrayList;

import util.Const;

public class Cache {

    class CacheLine {
        /**
         * valid bit, indicate whether an entry contains a valid address.</br>
         * 1 bit
         */
        int v;
        /**
         * contain the upper portion of the address.</br>
         * 7 bits
         */
        int tag;
        /**
         * data in cache.</br>
         * 16 bits
         */
        int data;

        public CacheLine() {
            this.v = 0;
            this.tag = 0;
            this.data = 0;
        }

        public int getV() {
            return v;
        }

        public void setV(int v) {
            this.v = v;
        }

        public int getTag() {
            return tag;
        }

        public void setTag(int tag) {
            this.tag = tag;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
        
        public boolean isValid(){
            return this.v == 0 ? false : true;
        }
    }

    ArrayList<CacheLine> cacheLines;

    public Cache() {
        this.cacheLines = new ArrayList<CacheLine>(Const.CACHE_LINES);
        for (int i = 0; i < Const.CACHE_LINES; i++) {
            this.cacheLines.add(new CacheLine());
        }
        System.out.println("Cache init complete");
    }
    
    public ArrayList<CacheLine> getCacheLines() {
        return cacheLines;
    }
    
    public CacheLine get(int index){
        return this.cacheLines.get(index);
    }
    
    

}
