package memory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import memory.Cache.CacheLine;
import util.Const;

/**
 * Memory Control Unit<br/>
 * Reserved Locations Of Memory:<br/>
 * 0 - Reserved for the Trap instruction for Part III.<br/>
 * 1 - Reserved for a machine fault<br/>
 * 2 - Store PC for Trap<br/>
 * 3 - NU<br/>
 * 4 - Store PC for Machine Fault<br/>
 * 5 - NU<br/>
 */
public class MCU {

    /**
     * 16 bit words
     */
    ArrayList<Integer> memory;

    /**
     * 16 block fully associative, unified cache
     */
    Cache cache;

    String printerBuffer;
    String keyboardBuffer;

    public String getPrinterBuffer() {
        return printerBuffer;
    }

    public void setPrinterBuffer(String printerBuffer) {
        this.printerBuffer = printerBuffer;
    }

    public String getKeyboardBuffer() {
        return keyboardBuffer;
    }

    public void setKeyboardBuffer(String keyboardBuffer) {
        this.keyboardBuffer = keyboardBuffer;
    }

    public Cache getCache() {
        return cache;
    }

    /**
     * initialize the MCU, all memories set to 0, memories size 2048.
     */
    public MCU() {
        this.memory = new ArrayList<Integer>(Const.MEMORY_WORDS_BOUND);
        for (int i = 0; i < Const.MEMORY_WORDS_BOUND; i++) {
            this.memory.add(0);
        }
        this.cache = new Cache();
        // System.out.println("MCU init with a size of " + this.memory.size());
    }

    /**
     * expand the memory size to 4096
     */
    public void expandMemorySize() {
        if (this.memory != null && this.memory.size() > 0) {
            this.memory.ensureCapacity(Const.MEMORY_WORDS_BOUND_EXPANDED);
            for (int currentSize = memory.size(); currentSize < Const.MEMORY_WORDS_BOUND_EXPANDED; currentSize++) {
                this.memory.add(0);
            }
        }
        System.out.println("memory size has been expanded to " + memory.size());
    }
    


    /**
     * @return current size of the memory
     */
    public int getCurrentMemorySize() {
        if (this.memory != null) {
            return this.memory.size();
        }
        return 0;
    }

    /**
     * 
     * Using the address to fetch a word directly from memory.
     * 
     * @param address
     * @return a word from memory
     * 
     */
    public int fetchFromMemory(int address) {
        return this.memory.get(address);
    }

    /**
     * 
     * Store directly into memory using address and value.
     * 
     * @param address
     * @param value
     */
    public void storeIntoMemory(int address, int value) {
        if (this.memory != null) {
            this.memory.set(address, value);
        }
    }

    /**
     * 
     * fetch a word from cache. If the word is not in cache, fetch it from
     * memory, then store it into cache.
     * 
     * @param address
     * @return
     */
    public int fetchFromCache(int address) {
        for (CacheLine line : cache.getCacheLines()) { // check every block
                                                       // whether the tag is
                                                       // already exist
            if (address == line.getTag()) {
                return line.getData(); // tag exist, return the data of the
                                       // block
            }
        }
        // tag not exist
        int value = fetchFromMemory(address);
        cache.add(address, value);
        return value;
    }

    /**
     * 
     * store into cache with replacement. Also store into memory simultaneously.
     * 
     * @param address
     * @param value
     */
    public void storeIntoCache(int address, int value) {
        storeIntoMemory(address, value);
        for (CacheLine line : cache.getCacheLines()) { // check every block the
                                                       // tag is already exist
            if (address == line.getTag()) {
                line.setData(value); // replace the block
                return;
            }
        }
        // tag not exist
        cache.add(address, value);
    }

    /**
     * Load from ROM and store the instructions after octal 10
     */
    public void loadMemoryFromROM() {
        HashMap<String, Integer> rom = Const.ROM;
        // System.out.println("read from the ROM");
        if (rom != null) {
            for (Map.Entry<String, Integer> entry : rom.entrySet()) {
                int address = Integer.parseInt(entry.getKey());
                int value = entry.getValue();
                storeIntoCache(address, value);
            }
        }
    }
    
    public void loadProgram(HashMap<String, Integer> program){
        if(program != null){
            for (Map.Entry<String, Integer> entry : program.entrySet()) {
                int address = Integer.parseInt(entry.getKey());
                int value = entry.getValue();
                storeIntoCache(address, value);
            }
        }
    }

}
