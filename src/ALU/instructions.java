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

		int effectiveAddress = EA(objInst, mcu);
		int reg = 0; // selected general purpose register
		int IXreg = 0; // selected Index register

		// reading the content of selected register using [R] in the instruction
		switch (r) {
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
		switch (opcode) {
		case 10: {
			// 02:STR -> Store Register to Memory
			mcu.storeIntoMemory(bin2dec(effectiveAddress), bin2dec(reg));
		}
		case 101010: {
			// 42: STX -> Store Index Register to Memory

			// first, we read the content of selected Index Register using [IX]
			switch (ix) {
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
			// we read the content of effective address and load to the register
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
			switch (ix) {
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
	private int EA(ALU.instruction objInst, memory.MCU mcu) {

		if (objInst.getI() == 0) {
			// NO indirect addressing
			if (objInst.getIX() == 0) {
				return objInst.getAddress();
			} else {
				return bin2dec(objInst.getAddress()) + bin2dec(objInst.getIX());
			}

		} else if (objInst.getI() == 1) {
			// indirect addressing, but NO indexing
			if (objInst.getIX() == 0) {
				return mcu.fetchFromMemory(bin2dec(objInst.getAddress()));
			} else {
				return mcu
						.fetchFromMemory(bin2dec(objInst.getAddress() + mcu.fetchFromMemory(bin2dec(objInst.getIX()))));
			}
		}
		return 0;
	}

}
