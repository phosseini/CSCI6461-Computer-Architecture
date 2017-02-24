package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.EffectiveAddress;
import util.MachineFaultException;

public class STR extends AbstractInstruction {

	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		//-----------------------------------
		// 02:STR -> Store Register to Memory
		//-----------------------------------
		int r = Integer.valueOf(instruction.substring(6, 8));
		
		// reading the content of selected register using [R] in the instruction
		registers.setMAR(util.EffectiveAddress.EA(instruction, mcu, registers));
		registers.setMBR(registers.getRnByNum(r));
		mcu.storeIntoMemory(registers.getMAR(), registers.getMBR());
		
		// System.out.println("this is a STR instruction!");
	}

	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}