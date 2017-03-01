package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.EffectiveAddress;
import util.MachineFaultException;

public class LDX extends AbstractInstruction {

	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		//-----------------------------------
		// 41: LDX -> Load Index Register from Memory
		//-----------------------------------
				int ix = Integer.valueOf(instruction.substring(8, 10));
				
				// first, we read the content of selected Index Register using [IX]
				registers.setMAR(util.EffectiveAddress.EA(instruction, mcu, registers));
				registers.setMBR(mcu.fetchFromMemory(registers.getMAR()));
				registers.setXnByNum(ix, registers.getMBR());
				
				
				// System.out.println("this is a LDX instruction!");
			}
	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
