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

	// Using the address in the MAR to fetch a word from memory
	// The word fetched from memory is placed in the MBR
	public int fetchAWordFromMemory(MAR mar) {
		int address = mar.getMar();
		if (address <= this.memory.size()) {
			return this.memory.get(address);
		}
		return 0;
	}

	// store into memory using address in MAR and value in MBR
	public void storeIntoMemory(MAR mar, MBR mbr) {
		int address = mar.getMar();
		if (this.memory != null && address <= this.memory.size()) {
			this.memory.set(address, mbr.getMbr());
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

	// only for test purpose
	public int getMemory(int address) {
		return this.memory.get(address);
	}

}
