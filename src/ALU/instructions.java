package ALU;

import java.math.BigInteger;

public class instructions {

	// converting a binary value to a decimal value
	public int bin2dec(int binary) {
		return new BigInteger(String.valueOf(binary), 2).intValue();

	}

	// executing instructions
	public void execute(ALU.instruction inst, registers.Registers registers, memory.MCU mcu) {
		int effectiveAddress = EA(inst, mcu);
		int reg = 0; // selected general purpose register
		int IXreg = 0; // selected Index register

		// reading the content of selected register using [R] in the instruction
		switch (inst.getR()) {
		case 0: {
			reg = registers.getR0();
		}
		case 1: {
			reg = registers.getR1();
		}
		case 10: {
			reg = registers.getR2();
		}
		case 11: {
			reg = registers.getR3();
		}
		}

		// reading Opcode to see which instruction we should execute
		switch (inst.getOpcode()) {
		case 10: {
			// 02:STR -> Store Register to Memory
			mcu.storeIntoMemory(bin2dec(effectiveAddress), bin2dec(reg));
		}
		case 101010: {
			// 42: STX -> Store Index Register to Memory

			// first, we read the content of selected Index Register using [IX]
			switch (inst.getIX()) {
			case 0: {
				IXreg = registers.getX1();
			}
			case 1: {
				IXreg = registers.getX2();
			}
			case 10: {
				IXreg = registers.getX3();
			}
			}

			// now, we store the content of Index register into the memory
			mcu.storeIntoMemory(bin2dec(effectiveAddress), bin2dec(IXreg));
		}
		case 1: {
			// 01: LDR -> Load Register From Memory
			// we read the content of effective address and laod to the register
			reg = mcu.fetchFromMemory(bin2dec(effectiveAddress));
		}
		case 11: {
			// 03: LDA -> Load Register with Address
			reg = bin2dec(effectiveAddress);
		}
		case 101001: {
			// 41: LDX -> Load Index Register from Memory
			// first, we read the content of selected Index Register using [IX]
			// in instruction
			switch (inst.getIX()) {
			case 0: {
				IXreg = registers.getX1();
			}
			case 1: {
				IXreg = registers.getX2();
			}
			case 10: {
				IXreg = registers.getX3();
			}

			}
			// now, we load the content of effective address from the memory
			IXreg = mcu.fetchFromMemory(bin2dec(effectiveAddress));
		}

		}
	}

	// calculating the effective address
	private int EA(ALU.instruction inst, memory.MCU mcu) {

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
				return mcu.fetchFromMemory(bin2dec(inst.getAddress()));
			} else {
				return mcu.fetchFromMemory(bin2dec(inst.getAddress() + mcu.fetchFromMemory(bin2dec(inst.getIX()))));
			}
		}
		return 0;
	}
}
