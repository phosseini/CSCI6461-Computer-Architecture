package memory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import registers.MAR;
import registers.MBR;
import util.Const;

public class MCU {
	// Memory Control Unit

	int words = 2048;
	int wordsExpanded = 4096;
	ArrayList<Integer> memory;
	// Reserved Locations Of Memory:
	// 0 - Reserved for the Trap instruction for Part III.
	// 1 - Reserved for a machine fault
	// 2 - Store PC for Trap
	// 3 - NU
	// 4 - Store PC for Machine Fault
	// 5 - NU

	public MCU() {
		// initialize the MCU, all memories set to 0
		this.memory = new ArrayList<Integer>(this.words);
		for (int i = 0; i < this.words; i++) {
			this.memory.add(0);
		}
		System.out.println("MCU init with a size of " + this.memory.size());
	}

	public void expandMemorySize() {
		if (this.memory != null && this.memory.size() > 0) {
			this.memory.ensureCapacity(this.wordsExpanded);
			for (int currentSize = memory.size(); currentSize < this.wordsExpanded; currentSize++) {
				this.memory.add(0);
			}
		}
		System.out.println("current size of memory: " + memory.size());
	}
	
	public int getCurrentSize(){
		if(this.memory != null){
			return this.memory.size();
		}
		return 0;
	}


	//using the address to fetch a word from memory
	public int fetchFromMemory(int address){
		return this.memory.get(address);
	}
	
	//store into memory using address and value
	public void storeIntoMemory(int address, int value){
		if(this.memory != null){
			this.memory.set(address, value);
		}
	}

	// Load from ROM and store every value into memory with specific address
	public void loadFromROM() {
		HashMap<String, Integer> rom = Const.ROM;
		if (rom != null) {
			for (Map.Entry<String, Integer> entry : rom.entrySet()) {
				int address = Integer.parseInt(entry.getKey());
				int value = entry.getValue();
				if (address > this.memory.size() || address <= 5 || value > 65535) { // 2^16-1=65535
					continue; // ignore this entry
				}
				this.memory.set(address, value);
			}
		}
	}

	// only for test purpose
	public void setMemory(int address, int value) {
		if (address <= this.memory.size() && value <= 65535) {
			this.memory.set(address, value);
		}
	}


}
