package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.EffectiveAddress;
import util.MachineFaultException;
import util.StringUtil;

public class RFS extends AbstractInstruction {

	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		// -----------------------------------
		// 015: RFS -> Return From Subroutine w/ return code as Immed portion
		// (optional) stored in the instruction's address field
		// registers.setR0(Immed));?????????????????
		// -----------------------------------
		int immed = StringUtil.binaryToDecimal(instruction.substring(11, 16));
		registers.setR0(immed); // 1233
		registers.setPC(mcu.fetchFromMemory(registers.getR3()));
	}

	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}