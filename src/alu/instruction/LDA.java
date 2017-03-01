package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.EffectiveAddress;
import util.MachineFaultException;
import util.StringUtil;

public class LDA extends AbstractInstruction {

	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		//-----------------------------------
		// 03:LDA -> Load Register From Memory
		//-----------------------------------
				int r = StringUtil.binaryToDecimal(instruction.substring(6, 8));
				
				// reading the content of selected register using [R] in the instruction
				registers.setRnByNum(r, util.EffectiveAddress.EA(instruction, mcu, registers));
				
				// System.out.println("this is a LDA instruction!");
			}
	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}
