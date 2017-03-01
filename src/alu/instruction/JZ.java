package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.EffectiveAddress;
import util.MachineFaultException;

public class JZ extends AbstractInstruction {

	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		//------------------------------------------
		//  010: JZ -> Jump if Zero
		//------------------------------------------
		int r = Integer.valueOf(instruction.substring(6, 8));
		if (mcu.fetchFromMemory(registers.getRnByNum(r)) == 0){
			registers.setPC(util.EffectiveAddress.EA(instruction, mcu, registers));
		}
		else {
			registers.setPC(registers.getPC()+1);
		}
	}

	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}