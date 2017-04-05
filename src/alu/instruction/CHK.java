package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.Const;
import util.MachineFaultException;
import util.StringUtil;

public class CHK extends AbstractInstruction {
	
	int num;
	int devId;

	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		// TODO Auto-generated method stub
		this.num = StringUtil.binaryToDecimal(instruction.substring(6, 8));
		this.devId = StringUtil.binaryToDecimal(instruction.substring(11, 16));
		
		if (this.devId == Const.DevId.KEYBOARD.getValue()) {
			
                
                registers.setRnByNum(this.num, 1);
               
           
		}
		
		if (this.devId == Const.DevId.CARD.getValue()) {
			
                registers.setRnByNum(this.num, 1);
               
        }
        
		
		
		if (this.devId == Const.DevId.PRINTER.getValue()) {
			
            	
                registers.setRnByNum(this.num, 1);
               
		}
	}	
	

	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return "CHK "+ num +", "+devId;
	}

}
