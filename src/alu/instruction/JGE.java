package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.EffectiveAddress;
import util.MachineFaultException;
import util.StringUtil;

public class JGE extends AbstractInstruction {

	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		//-----------------------------------
		// 017: JGE -> Jump Greater Than or Equal To
		//-----------------------------------
		int r = StringUtil.binaryToDecimal(instruction.substring(6, 8));
		if (mcu.fetchFromMemory(registers.getRnByNum(r)) >= 0){
			registers.setPC(util.EffectiveAddress.EA(instruction, mcu, registers));
		}
		else {
			registers.setPC(registers.getPC()+1);
		}
		
		// System.out.println("this is a JGE instruction!");
	}

	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}