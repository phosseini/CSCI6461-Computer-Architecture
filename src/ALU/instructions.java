package ALU;

import java.math.BigInteger;

import memory.MCU;
import registers.Registers;

public class instructions {

	registers.Registers objReg = new Registers();
	memory.MCU objMem = new MCU();

	// converting a binary value to a decimal value
	public int bin2dec(int binary) {
		return new BigInteger(String.valueOf(binary), 2).intValue();

	}

	// executing instructions
	public void execute(ALU.instruction inst) {
		int effectiveAddress = EA(inst);
		int reg = 0; // selected general purpose register
		int IXreg = 0; // selected Index register

		// reading the content of selected register using [R] in the instruction
		switch (inst.getR()) {
		case 0: {
			reg = objReg.getR0();
		}
		case 1: {
			reg = objReg.getR1();
		}
		case 10: {
			reg = objReg.getR2();
		}
		case 11: {
			reg = objReg.getR3();
		}
		}

		// reading Opcode to see which instruction we should execute
		switch (inst.getOpcode()) {
		case 10: {
			// 02:STR -> Store Register to Memory
			objMem.storeIntoMemory(bin2dec(effectiveAddress), bin2dec(reg));
		}
		case 101010: {
			// 42: STX -> Store Index Register to Memory

			// first, we read the content of selected Index Register using [IX]
			// in instruction
			switch (inst.getIX()) {
			case 0: {
				IXreg = objReg.getX1();
			}
			case 1: {
				IXreg = objReg.getX2();
			}
			case 10: {
				IXreg = objReg.getX3();
			}
			}

			// now, we store the content of Index register into the memory
			objMem.storeIntoMemory(bin2dec(effectiveAddress), bin2dec(IXreg));
		}
		}

	}

	// Using this method, we calculate the effective address
	private int EA(ALU.instruction inst) {

		if (inst.getI() == 0) {
			// NO indirect addressing
			if (inst.getIX() == 0) {
				return inst.getAddress();
			} else {
				return inst.getAddress() + inst.getIX();
			}

		} else if (inst.getI() == 1) {
			// indirect addressing, but NO indexing
			if (inst.getIX() == 0) {
				return objMem.fetchFromMemory(bin2dec(inst.getAddress()));
			} else {
				return objMem.fetchFromMemory(bin2dec(inst.getAddress() + objMem.fetchFromMemory(bin2dec(inst.getIX()))));
			}
		}
		return 0;
	}
}
