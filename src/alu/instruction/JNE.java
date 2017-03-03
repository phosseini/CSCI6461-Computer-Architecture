package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.EffectiveAddress;
import util.MachineFaultException;
import util.StringUtil;

public class JNE extends AbstractInstruction {

	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		// -----------------------------------
		// 011: JNE -> Jump if Not Equal
		// -----------------------------------
		int r = StringUtil.binaryToDecimal(instruction.substring(6, 8));

		// reading the content of selected register using [R] in the instruction
		if (mcu.fetchFromMemory(registers.getRnByNum(r)) != 0) {
			registers.setPC(util.EffectiveAddress.EA(instruction, mcu, registers));
		} else {
			registers.setPC(registers.getPC() + 1);
		}

		// System.out.println("this is a JNE instruction!");
	}

	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}