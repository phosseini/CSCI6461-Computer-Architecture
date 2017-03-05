package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.EffectiveAddress;
import util.MachineFaultException;

public class JSR extends AbstractInstruction {

	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		// -----------------------------------
		// 014: JSR -> Jump and Save Return Address
		// -----------------------------------
		registers.setR3(registers.getPC() + 1);
		registers.setPC(util.EffectiveAddress.EA(instruction, mcu, registers));
	}

	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}