package ALU;

import java.math.BigInteger;

public class instructions {

	// converting a binary value to a decimal value
	public int bin2dec(int binary) {
		return new BigInteger(String.valueOf(binary), 2).intValue();

	}

	// executing instructions
	public void execute(String inst, registers.Registers registers, memory.MCU mcu) {

		int address = Integer.valueOf(inst.substring(11, 16));
		int i = Integer.valueOf(inst.substring(10, 11));
		int ix = Integer.valueOf(inst.substring(8, 10));
		int r = Integer.valueOf(inst.substring(6, 8));
		int opcode = Integer.valueOf(inst.substring(0, 6));
		ALU.instruction objInst = new instruction();
		objInst.address = address;
		objInst.i = i;
		objInst.ix = ix;
		objInst.r = r;
		objInst.opcode = opcode;

		int effectiveAddress = EA(objInst, mcu, registers);

		// reading Opcode to see which instruction we should execute
		switch (opcode) {
		case 10: {
			// 02:STR -> Store Register to Memory
			
			// reading the content of selected register using [R] in the instruction
			registers.setMAR(effectiveAddress);
			registers.setMBR(registers.getRnByNum(r));
			mcu.storeIntoMemory(registers.getMAR(), registers.getMBR());
			
			break;
		}

		case 101010: {
			// 42: STX -> Store Index Register to Memory
			
			registers.setMAR(effectiveAddress);
			registers.setMBR(registers.getXnByNum(ix));
			mcu.storeIntoMemory(registers.getMAR(), registers.getMBR());
			
			break;
		}

		case 1: {
			// 01: LDR -> Load Register From Memory
			
			// we read the content of effective address and load to the register
			registers.setMAR(effectiveAddress);
			registers.setMBR(mcu.fetchFromMemory(registers.getMAR()));
			registers.setRnByNum(bin2dec(r), registers.getMBR());

			break;
		}

		case 11: {
			// 03: LDA -> Load Register with Address
			registers.setRnByNum(bin2dec(r), effectiveAddress);
			;
			break;
		}

		case 101001: {
			// 41: LDX -> Load Index Register from Memory
			
			// first, we read the content of selected Index Register using [IX]
			registers.setMAR(effectiveAddress);
			registers.setMBR(mcu.fetchFromMemory(registers.getMAR()));
			registers.setXnByNum(bin2dec(ix), registers.getMBR());
			
			break;
		}
		}
	}

	// calculating the effective address
	private int EA(ALU.instruction objInst, memory.MCU mcu, registers.Registers registers) {

		if (objInst.getI() == 0) {
			// NO indirect addressing
			if (objInst.getIX() == 0) {
				return bin2dec(objInst.getAddress());
			} else {
				return bin2dec(objInst.getAddress()) + registers.getXnByNum(bin2dec(objInst.getIX()));
			}

		} else if (objInst.getI() == 1) {
			// indirect addressing, but NO indexing
			if (objInst.getIX() == 0) {
				return mcu.fetchFromMemory(bin2dec(objInst.getAddress()));
			} else {
				return mcu.fetchFromMemory(bin2dec(objInst.getAddress()) + registers.getXnByNum(bin2dec(objInst.getIX())));
			}
		}
		return 0;
	}

}
