package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.EffectiveAddress;
import util.MachineFaultException;
import util.StringUtil;

public class STFR extends AbstractInstruction{
	
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
		
		int cfr=registers.getFRByNum(fr);
		String frs=Integer.toBinaryString(cfr);
		
		frs=frs.replaceFirst("0000000000000000", "");
		
		int man=Integer.parseInt(frs.substring(8, 16),2);
		int exp=Integer.parseInt(frs.substring(0, 8),2);
		
		registers.setMAR(effectiveAddress);
		registers.setMBR(exp);
		mcu.storeIntoCache(registers.getMAR(), registers.getMBR());
		
		registers.setMAR(effectiveAddress+1);
		registers.setMBR(man);
		mcu.storeIntoCache(registers.getMAR(), registers.getMBR());
		
		registers.increasePCByOne();
	}

	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return "STFR"+ fr + ", " + ix + ", " + address + "," +i;
	}

}
