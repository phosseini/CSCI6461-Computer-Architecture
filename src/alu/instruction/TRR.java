package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.Const;
import util.MachineFaultException;
import util.StringUtil;

public class TRR extends AbstractInstruction {

	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		// ------------------------------------------------------
		// 022: TRR -> Test the equality of Register and Register
		// if c(rx) = c(ry), set cc(4) <- 1; else, cc(4) <- 0
		// ------------------------------------------------------
		int rx = StringUtil.binaryToDecimal(instruction.substring(6, 8));
		int ry = StringUtil.binaryToDecimal(instruction.substring(8, 10));

		if (registers.getRnByNum(rx) == registers.getRnByNum(ry)) {
			registers.setCCElementByBit(Const.ConditionCode.EQUALORNOT.getValue(), true);
		} else {
			registers.setCCElementByBit(Const.ConditionCode.EQUALORNOT.getValue(), false);
		}
		registers.increasePCByOne();
	}

	@Override
	public String getExecuteMessage() {
		return null;
	}
}
