package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.Const;
import util.EffectiveAddress;
import util.MachineFaultException;
import util.StringUtil;

public class AMR extends AbstractInstruction {

	int r;
	int ix;
	int i;
	int address;

	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		// -----------------------------------
		// 004: AMR -> Add Memory to Register
		// r <- c(r) + c(EA)
		// -----------------------------------
		r = StringUtil.binaryToDecimal(instruction.substring(6, 8));
		ix = StringUtil.binaryToDecimal(instruction.substring(8, 10));
		address = StringUtil.binaryToDecimal(instruction.substring(11, 16));
		i = StringUtil.binaryToDecimal(instruction.substring(10, 11));

		int effectiveAddress = EffectiveAddress.calculateEA(ix, address, i, mcu, registers);

		// we check if effective address is a reserved memory address or not
		if (effectiveAddress < 6) {
			throw new MachineFaultException(Const.FaultCode.ILL_MEM_RSV.getValue(),
					Const.FaultCode.ILL_MEM_RSV.getMessage());
			// now we check if address is beyond our current memory size
		} else if (effectiveAddress > mcu.getCurrentMemorySize() - 1) {
			throw new MachineFaultException(Const.FaultCode.ILL_MEM_BYD.getValue(),
					Const.FaultCode.ILL_MEM_BYD.getMessage());
		} else {
			// first, we store the effective address in memory address register
			registers.setMAR(effectiveAddress);

			// storing what we fetched from memory into the memory buffer
			// register
			registers.setMBR(mcu.fetchFromCache(registers.getMAR()));

			int result = registers.getRnByNum(r) + registers.getMBR();

			// we check if we have an overflow
			if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
				registers.setCCElementByBit(Const.ConditionCode.OVERFLOW.getValue(), true);
			} else {
				// if we do not have an overflow, we update the value of
				// register
				registers.setRnByNum(r, result);
			}

			registers.increasePCByOne();
		}
	}

	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return "AMR " + r + ", " + ix + ", " + address + ", " + i;
	}

}
