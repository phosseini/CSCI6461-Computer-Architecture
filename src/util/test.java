package util;

import memory.MCU;
import registers.IR;
import registers.MAR;
import registers.MBR;
import registers.PC;

public class test {

	public static void main(String[] args) {
		MCU mcu = new MCU();
		PC pc = new PC();
		MAR mar = new MAR();
		MBR mbr = new MBR();
		IR ir = new IR();
		// The Program Counter (PC) contains the address of the next instruction
		// to be executed
		pc.setPc(32);
		// Transfer the address in PC to MAR, takes one cycle
		mar.setMar(pc.getPc());
		// MCU use the address in MAR to fetch a word, then put the word into
		// MBR, takes one cycle
		mbr.setMbr(mcu.fetchAWordFromMemory(mar));
		// contents of the MBR moved to the IR, takes one cycle
		ir.setIr(mbr.getMbr());
		
		
	}
}
