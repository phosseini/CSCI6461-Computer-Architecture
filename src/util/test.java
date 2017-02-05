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
		mcu.loadFromROM();
		// The Program Counter (PC) contains the address of the next instruction
		// to be executed
		pc.setPc(Const.Instruction.Start.value);
		do {
			// Transfer the address in PC to MAR
			mar.setMar(pc.getPc());
			// MCU use the address in MAR to fetch a word
			// then put the word into MBR
			mbr.setMbr(mcu.fetchAWordFromMemory(mar));
			// contents of the MBR moved to the IR
			ir.setIr(mbr.getMbr());
			System.out.println(ir.getBinaryStringIr());
			//then do the instruction
			pc.pcIncrease();
		} while (pc.getPc() <= Const.Instruction.End.value);





	}
}
