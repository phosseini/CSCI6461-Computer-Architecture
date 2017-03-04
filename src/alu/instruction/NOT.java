package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.MachineFaultException;
import util.StringUtil;

public class NOT extends AbstractInstruction{
	int Bd, rx;
	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		// TODO Auto-generated method stub
		this.rx=StringUtil.binaryToDecimal(instruction.substring(6,8));
		this.Bd=registers.getRnByNum(rx);
		
		Bd=~Bd;
		registers.setRnByNum(rx, Bd);
		
		registers.increasePCByOne();
	}

	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return null;
	}
	
}