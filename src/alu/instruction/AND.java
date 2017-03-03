package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.MachineFaultException;
import util.StringUtil;

public class AND extends AbstractInstruction{
	int x, y, rx, ry;
	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		// TODO Auto-generated method stub
		
		this.rx=StringUtil.binaryToDecimal(instruction.substring(5,8));
		this.ry=StringUtil.binaryToDecimal(instruction.substring(7,10));
		this.x=registers.getRnByNum(rx);
		this.y=registers.getRnByNum(ry);
		
	}

	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return null;
	}
	
}