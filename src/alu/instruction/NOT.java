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
		this.rx=StringUtil.binaryToDecimal(instruction.substring(5,7));
		this.Bd=registers.getRnByNum(rx);
		
		Bd=~Bd;
		registers.setRnByNum(rx, Bd);
	}

	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return null;
	}
	
}