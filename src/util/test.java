package util;

import memory.MCU;
import registers.IR;
import registers.MAR;
import registers.MBR;
import registers.MFR;
import registers.PC;

public class test {

	public static void main(String[] args) {
		MCU mcu = new MCU();
		PC pc = new PC();
		MAR mar = new MAR();
		MBR mbr = new MBR();
		IR ir = new IR();
		MFR mfr = new MFR();
		mcu.loadFromROM();
		// The Program Counter (PC) contains the address of the next instruction
		// to be executed
		pc.setPc(Const.Instruction.Start.value);
		do {
			// Transfer the address in PC to MAR
			mar.setMar(pc.getPc());
			if (mar.getMar() > mcu.getCurrentSize()) {
				// machine fault occurs
				// Illegal Memory Address beyond 2048 (memory installed)
				mfr.setMfr(Const.MachineFault.ILL_MEM_BYD.value);
				break;
			}
			if (mar.getMar() <= Const.MEMORY_RESERVE_LOCATION) {
				// machine fault occurs
				// Illegal Memory Address to Reserved Locations
				mfr.setMfr(Const.MachineFault.ILL_MEM_RSV.value);
				break;
			}
			// MCU use the address in MAR to fetch a word
			int word = mcu.fetchFromMemory(mar.getMar());
			// then put the word into MBR
			mbr.setMbr(word);
			// contents of the MBR moved to the IR
			ir.setIr(mbr.getMbr());
			// then do the instruction
			String instruction = ir.getBinaryStringIr();
			System.out.println("instruction: " + instruction);
			String opCode = instruction.substring(0, 5);
			// chose different kind of instructions or machine fault occurs
			// ...
			// ...
			// pc auto increment
			pc.pcIncrease();
		} while (pc.getPc() <= Const.Instruction.End.value);
	}

}
