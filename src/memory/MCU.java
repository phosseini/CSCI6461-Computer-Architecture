package memory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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



    ArrayList<Integer> memory;


    /**
     * initialize the MCU, all memories set to 0
     */
    public MCU() {
        this.memory = new ArrayList<Integer>(Const.MEMORY_WORDS_BOUND);
        for (int i = 0; i < Const.MEMORY_WORDS_BOUND; i++) {
            this.memory.add(0);
        }
        System.out.println("MCU init with a size of " + this.memory.size());
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
    public int getCurrentSize() {
        if (this.memory != null) {
            return this.memory.size();
        }
        return 0;
    }

    /**
     * 
     * Using the address to fetch a word from memory.
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
     * Store into memory using address and value.
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
     * Load from ROM and store the instructions after octal 10
     */
    public void loadFromROM() {
        HashMap<String, Integer> rom = Const.ROM;
        System.out.println("read from the ROM");
        if (rom != null) {
            for (Map.Entry<String, Integer> entry : rom.entrySet()) {
                int address = Integer.parseInt(entry.getKey());
                int value = entry.getValue();
                if (address > this.memory.size() || address <= Const.MEMORY_RESERVE_LOCATION || value > 0xffff) {
                    continue; // ignore this entry
                }
                this.memory.set(address, value);
            }
        }
    }

}
