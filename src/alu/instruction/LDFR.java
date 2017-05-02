package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.EffectiveAddress;
import util.MachineFaultException;
import util.StringUtil;

public class LDFR extends AbstractInstruction{

	int fr;
	int ix;
	int address;
	int i;

	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		// TODO Auto-generated method stub
		fr = StringUtil.binaryToDecimal(instruction.substring(6, 8));
		ix = StringUtil.binaryToDecimal(instruction.substring(9, 11));
		i = StringUtil.binaryToDecimal(instruction.substring(8, 9));
		address = StringUtil.binaryToDecimal(instruction.substring(11, 16));
		int effectiveAddress = EffectiveAddress.calculateEA(ix, address, i, mcu, registers);
		
		String exp="0000000";
	    String man="00000000";
	    
		registers.setMAR(effectiveAddress);
		registers.setMBR(mcu.fetchFromCache(registers.getMAR()));
		int expI=registers.getMBR();
		
		registers.setMAR(effectiveAddress+1);
		registers.setMBR(mcu.fetchFromCache(registers.getMAR()));
		int manI=registers.getMBR();
		

		String temp=Integer.toString(expI);
		exp=exp.substring(0,7-temp.length())+temp;
		String temp1=Integer.toString(manI);
		man=temp1+man.substring(temp1.length());

		
		String frs=exp+man;
		
		registers.setFRByNum(fr, Integer.parseInt(frs,2));
		registers.increasePCByOne();
	}

	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return "LDFR"+ fr + ", " + ix + ", " + address + "," +i;
	}

}
