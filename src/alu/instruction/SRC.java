package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.MachineFaultException;
import util.StringUtil;

public class SRC extends AbstractInstruction{
	int AL, LR, Bd, Ct, r;
	
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		// TODO Auto-generated method stub
		this.AL=StringUtil.binaryToDecimal(instruction.substring(8,9));
		this.LR=StringUtil.binaryToDecimal(instruction.substring(9,10));
		this.Ct=StringUtil.binaryToDecimal(instruction.substring(12,16));
		this.r=StringUtil.binaryToDecimal(instruction.substring(6,8));
		this.Bd=registers.getRnByNum(r);
		if (AL==0){
			if(LR==0){
				Bd=Bd>>Ct;
			}
			if(LR==1){
				Bd=Bd<<Ct;
			}
		}
		if(AL==1){
			if(LR==0){
				Bd=Bd>>>Ct;
			}
			if(LR==1){
				Bd=Bd<<Ct;
			}
		}
		registers.setRnByNum(r,Bd);
		
	}
	
	
	



	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}
	