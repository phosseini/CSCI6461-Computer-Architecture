package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.EffectiveAddress;
import util.MachineFaultException;

public class JCC extends AbstractInstruction {

	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		//-----------------------------------
		// 012: JCC -> Jump If Condition Code cc replaces r for this instruction
		//-----------------------------------
		if (registers.getCC() == 1){
			registers.setPC(util.EffectiveAddress.EA(instruction, mcu, registers));
		}
		else {
			registers.setPC(registers.getPC()+1);
		}
		
		// System.out.println("this is a JCC instruction!");
	}

	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}