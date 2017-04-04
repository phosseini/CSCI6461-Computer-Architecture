package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.Const;
import util.EffectiveAddress;
import util.MachineFaultException;
import util.StringUtil;

public class LDA extends AbstractInstruction {

	int r;
	int ix;
	int address;
	int i;

	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		// -----------------------------------
		// 03:LDA -> Load Register From Memory
		// -----------------------------------
		r = StringUtil.binaryToDecimal(instruction.substring(6, 8));
		ix = StringUtil.binaryToDecimal(instruction.substring(8, 10));
		i = StringUtil.binaryToDecimal(instruction.substring(10, 11));
		address = StringUtil.binaryToDecimal(instruction.substring(11, 16));

		int effectiveAddress = EffectiveAddress.calculateEA(ix, address, i, mcu, registers);

		// we check if effective address is a reserved memory address or not
		if (address < 6) { // corrected by Zhihong
			throw new MachineFaultException(Const.FaultCode.ILL_MEM_RSV.getValue(),
					Const.FaultCode.ILL_MEM_RSV.getMessage());
			// now we check if address is beyond our current memory size
		} else if (address > mcu.getCurrentMemorySize() - 1) { // corrected by Zhihong
			throw new MachineFaultException(Const.FaultCode.ILL_MEM_BYD.getValue(),
					Const.FaultCode.ILL_MEM_BYD.getMessage());
		} else {
			// reading the content of selected register using [R] in the
			// instruction
			registers.setRnByNum(r, effectiveAddress);
			registers.increasePCByOne();
		}
	}

	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return "LDA " + r + ", " + ix + ", " + address + ", " + i;
	}

}
