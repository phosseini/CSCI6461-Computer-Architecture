package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.EffectiveAddress;
import util.MachineFaultException;
import util.StringUtil;

public class STX extends AbstractInstruction {
    
    int r;
    int ix;
    int address;
    int i;
    
	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		// ------------------------------------------
		// 42: STX -> Store Index Register to Memory
		// ------------------------------------------
	    r = StringUtil.binaryToDecimal(instruction.substring(6, 8));
        ix = StringUtil.binaryToDecimal(instruction.substring(8, 10));
        i = StringUtil.binaryToDecimal(instruction.substring(10, 11));
        address = StringUtil.binaryToDecimal(instruction.substring(11, 16));

		registers.setMAR(EffectiveAddress.calculateEA(ix, address, i, mcu, registers));
		registers.setMBR(registers.getXnByNum(ix));
		mcu.storeIntoCache(registers.getMAR(), registers.getMBR());

		registers.increasePCByOne();
	}

	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return "STX " + r + ", " + ix + ", " + address + ", " + i;
	}

}