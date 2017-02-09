package util;

import memory.MCU;

import registers.IR;
import registers.MAR;
import registers.MBR;
import registers.MFR;
import registers.PC;
import registers.Xs;
public class Test {
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
			String opCode = instruction.substring(0, 6);
			String R = instruction.substring(6, 8);
			String IX = instruction.substring(8, 10);
			String I = instruction.substring(10,11);
			String Address = instruction.substring(11, 16);
			int addr=Integer.parseInt(Address);
			int ix=Integer.parseInt(IX);;    
			if (I.equals("0")){
			// identify I no indirect addressing
				if (IX.equals("00")){
					mar.setMar(addr);
					mbr.setMbr(mcu.fetchFromMemory(mar.getMar()));
				}
				else if (IX.equals("01")||IX.equals("10")||IX.equals("11")){
					mar.setMar(addr + getXByNum(ix));
					mbr.setMbr(mcu.fetchFromMemory(mar.getMar()));
				}
			else if (I.equals("1")){
				if (IX.equals("00")){
					mar.setMar(addr);
					mbr.setMbr(mcu.fetchFromMemory(mar.getMar()));
				}
				else if (IX.equals("01")||IX.equals("10")||IX.equals("11")){
					mar.setMar(mcu.fetchFromMemory(addr + getXByNum(ix)));
					mbr.setMbr(mcu.fetchFromMemory(mar.getMar()));
					
					//mar.setMar(i);
				}
			}
			}
			
			
			System.out.println(R.equals("10"));  
			System.out.println(R);
			// chose different kind of instructions or machine fault occurs
			// ...
			// ...
			// pc auto increment
			pc.pcIncrease();
		} while (pc.getPc() <= Const.Instruction.End.value);
	}

	private static int getXByNum(int ix) {
		// TODO Auto-generated method stub
		return 0;
	}
}
