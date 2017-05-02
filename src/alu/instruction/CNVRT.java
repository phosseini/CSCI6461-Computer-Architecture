package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.EffectiveAddress;
import util.MachineFaultException;
import util.StringUtil;

public class CNVRT extends AbstractInstruction {

	int r;
	int ix;
	int address;
	int i;
	int F;

	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		// TODO Auto-generated method stub
		r = StringUtil.binaryToDecimal(instruction.substring(6, 8));
		ix = StringUtil.binaryToDecimal(instruction.substring(9, 11));
		i = StringUtil.binaryToDecimal(instruction.substring(8, 9));
		address = StringUtil.binaryToDecimal(instruction.substring(11, 16));

		int effectiveAddress = EffectiveAddress.calculateEA(ix, address, i, mcu, registers);
		F = registers.getRnByNum(r);
		registers.setMAR(effectiveAddress);
		registers.setMBR(mcu.fetchFromCache(registers.getMAR()));

		if (F == 0) {

			registers.setRnByNum(r, Math.round(registers.getMBR()));
		}
		if (F == 1) {

			registers.setConvertFRByNum(0, registers.getMBR());
		}
		registers.increasePCByOne();
	}

	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return "CNVRT" + r + ", " + ix + ", " + address + "," + i;
	}

}
