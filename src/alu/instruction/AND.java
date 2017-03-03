package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.MachineFaultException;
import util.StringUtil;

public class AND extends AbstractInstruction{
	int Bd, rx, ry;
	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		// TODO Auto-generated method stub
		this.Bd=StringUtil.binaryToDecimal(instruction);
		this.rx=StringUtil.binaryToDecimal(instruction.substring(5,8));
		this.ry=StringUtil.binaryToDecimal(instruction.substring(7,10));
		
	}

	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return null;
	}
	
}