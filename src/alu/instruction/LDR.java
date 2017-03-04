package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.EffectiveAddress;
import util.MachineFaultException;
import util.StringUtil;

public class LDR extends AbstractInstruction {

	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		//-----------------------------------
		// 01:LDR -> Load Register From Memory
		//-----------------------------------
				int r = StringUtil.binaryToDecimal(instruction.substring(6, 8));
				
				// reading the content of selected register using [R] in the instruction
				registers.setMAR(util.EffectiveAddress.EA(instruction, mcu, registers));
				registers.setMBR(mcu.fetchFromMemory(registers.getMAR()));
				registers.setRnByNum(r, registers.getMBR());
				
				// System.out.println("this is a LDR instruction!");
				
				registers.increasePCByOne();
			}
	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}