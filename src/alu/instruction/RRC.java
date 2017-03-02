package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.MachineFaultException;
import util.StringUtil;

public class RRC extends AbstractInstruction{
	int AL, LR, Bd, Ct;
	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		// TODO Auto-generated method stub
		this.AL=StringUtil.binaryToDecimal(instruction.substring(7,8));
		this.LR=StringUtil.binaryToDecimal(instruction.substring(8,9));
		this.Bd=StringUtil.binaryToDecimal(instruction.substring(0,15));
		this.Ct=StringUtil.binaryToDecimal(instruction.substring(11,15));
	
		if(AL==1){
			if(LR==0){
				Bd= (Bd>>Ct|Bd<<(16-Ct));
			}
			if(LR==1){
				Bd= (Bd<<Ct|Bd>>(16-Ct));
			}
		}
		System.out.println((byte)Bd);
	}

	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}	