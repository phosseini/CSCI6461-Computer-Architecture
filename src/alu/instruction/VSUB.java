package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.Const;
import util.EffectiveAddress;
import util.MachineFaultException;
import util.StringUtil;

public class VSUB extends AbstractInstruction {

	int fr;
	int ix;
	int i;
	int address_V1;
    int address_V2;
	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		// -----------------------------------
		// 033: VADD -> Vector ADD 
		// V1(i) <- V1(i) + V2(i)
		// -----------------------------------
		fr = StringUtil.binaryToDecimal(instruction.substring(6, 8));
		ix = StringUtil.binaryToDecimal(instruction.substring(8, 10));
		address_V1 = StringUtil.binaryToDecimal(instruction.substring(11, 16));
		address_V2 = address_V1+1;
		i = StringUtil.binaryToDecimal(instruction.substring(10, 11));
		int effectiveAddress_V1 = EffectiveAddress.calculateEA(ix, address_V1, i, mcu, registers);	
		int effectiveAddress_V2 = EffectiveAddress.calculateEA(ix, address_V2, i, mcu, registers);
		for (int i=0;i<fr;i++)
		{// first, we store the effective address in memory address register
		registers.setMAR(effectiveAddress_V1+i);
		// storing what we fetched from memory into the memory buffer
		// register
		registers.setMBR(mcu.fetchFromCache(registers.getMAR()));
        int v1 = registers.getMBR();
        // we get the first vector from EA_V1
        registers.setMAR(effectiveAddress_V2+i);
        registers.setMBR(mcu.fetchFromCache(registers.getMAR()));
        int v2 = registers.getMBR();
     // we get the second vector from EA+1
        int result = v1+v2;
        
		// we check if we have an overflow
		int MAX_VALUE = 2^6;
		int MIN_VALUE = -2^6-1;
		if (result > MAX_VALUE || result < MIN_VALUE) {
			registers.setCCElementByBit(Const.ConditionCode.OVERFLOW.getValue(), true);
		} else {
			// if we do not have an overflow, we update the value of
			// register
			registers.setMBR(result);
			registers.setMAR(effectiveAddress_V1+i);
			mcu.storeIntoCache(registers.getMAR(), registers.getMBR());
		}
		}
		registers.increasePCByOne();
	}

	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return "FADD " + fr + ", " + ix + ", " + address_V1 + ", "+address_V2+", " + i;
	}

}
