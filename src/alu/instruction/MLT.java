package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.MachineFaultException;
import util.StringUtil;

public class MLT extends AbstractInstruction {

	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		// ------------------------------------------------------
		// 020: MLT -> Multiply Register by Register
		// rx, rx+1 <- c(rx) * c(ry)
		// rx must be 0 or 2
		// ry must be 0 or 2
		// rx contains the high order bits, rx+1 contains the low order bits of the result
		// Set OVERFLOW flag, if overflow
		// ------------------------------------------------------
		
		int rx = StringUtil.binaryToDecimal(instruction.substring(6, 8));
		int ry = StringUtil.binaryToDecimal(instruction.substring(8, 10));

		// first we should check the below condition:
		// rx must be 0 or 2
		// AND
		// ry must be 0 or 2
		if ((rx == 0 || rx == 2) && (ry == 0 || ry == 2)) {
			
			// doing the multiplication
			int result = registers.getRnByNum(rx) * registers.getRnByNum(ry);
			
			// rx contains the high order bits of the result
			registers.setRnByNum(rx, getHighOrderBits(result));
			
			// rx+1 contains the low order bits of the result
			registers.setRnByNum(rx + 1, getLowOrderBits(result));

		}
		
		registers.increasePCByOne();

	}

	@Override
	public String getExecuteMessage() {
		return null;
	}

	// getting the low 16 bits of an integer
	public static int getLowOrderBits(int x) {
		return (x & 0xFFFF);
	}

	// getting the high 16 bits of an integer
	public static int getHighOrderBits(int x) {
		return x >> 16;
	}

}
