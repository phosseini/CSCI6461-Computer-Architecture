package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.EffectiveAddress;
import util.MachineFaultException;

public class STX extends AbstractInstruction {

	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		//------------------------------------------
		// 42: STX -> Store Index Register to Memory
		//------------------------------------------
		
		int ix = Integer.valueOf(instruction.substring(8, 10));
		
		registers.setMAR(util.EffectiveAddress.EA(instruction, mcu, registers));
		registers.setMBR(registers.getXnByNum(ix));
		mcu.storeIntoMemory(registers.getMAR(), registers.getMBR());
	}

	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}