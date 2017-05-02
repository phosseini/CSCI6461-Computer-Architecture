package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.Const;
import util.EffectiveAddress;
import util.MachineFaultException;
import util.StringUtil;

public class FSUB extends AbstractInstruction {

	int fr;
	int ix;
	int address;
	int i;

	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		// -----------------------------------
		// 034: FSUB -> Floating Subtract Memory from Register
		// c(FR) <- c(FR) - c(EA)
		// c(FR) <- c(FR) - c(c(EA)), if l bit set
		// -----------------------------------
		fr = StringUtil.binaryToDecimal(instruction.substring(6, 8));
		ix = StringUtil.binaryToDecimal(instruction.substring(8, 10));
		i = StringUtil.binaryToDecimal(instruction.substring(10, 11));
		address = StringUtil.binaryToDecimal(instruction.substring(11, 16));

		int effectiveAddress = EffectiveAddress.calculateEA(ix, address, i, mcu, registers);

		// first, we store the effective address in memory address register
		registers.setMAR(effectiveAddress);

		// storing what we fetched from memory into the memory buffer
		// register
		registers.setMBR(mcu.fetchFromCache(registers.getMAR()));

		int result = registers.getFRByNum(fr) - registers.getMBR();

		// we check if we have an overflow
		int MAX_VALUE = 2^6;
		int MIN_VALUE = -2^6-1;
		if (result > MAX_VALUE && result < MIN_VALUE) {
			registers.setCCElementByBit(Const.ConditionCode.OVERFLOW.getValue(), true);
		} else {
			// if we do not have an overflow, we update the value of
			// register
			registers.setFRByNum(fr, result);
		}

		registers.increasePCByOne();
	}

	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return "FSUB " + fr + ", " + ix + ", " + address + ", " + i;
	}

}
