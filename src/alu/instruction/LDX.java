package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.EffectiveAddress;
import util.MachineFaultException;
import util.StringUtil;

public class LDX extends AbstractInstruction {

    int r;
    int ix;
    int address;
    int i;
    
	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		// -----------------------------------
		// 41: LDX -> Load Index Register from Memory
		// -----------------------------------
	    r = StringUtil.binaryToDecimal(instruction.substring(6, 8));
        ix = StringUtil.binaryToDecimal(instruction.substring(8, 10));
        i = StringUtil.binaryToDecimal(instruction.substring(10, 11));
        address = StringUtil.binaryToDecimal(instruction.substring(11, 16));

		// first, we read the content of selected Index Register using [IX]
		registers.setMAR(EffectiveAddress.calculateEA(ix, address, i, mcu, registers));
		registers.setMBR(mcu.fetchFromMemory(registers.getMAR()));
		registers.setXnByNum(ix, registers.getMBR());

		registers.increasePCByOne();
	}

	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return "LDX " + r + ", " + ix + ", " + address + ", " + i;
	}

}
