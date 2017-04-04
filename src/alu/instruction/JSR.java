package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.Const;
import util.EffectiveAddress;
import util.MachineFaultException;
import util.StringUtil;

public class JSR extends AbstractInstruction {

	int ix;
	int address;
	int i;

	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		// -----------------------------------
		// 014: JSR -> Jump and Save Return Address
		// -----------------------------------
		ix = StringUtil.binaryToDecimal(instruction.substring(8, 10));
		i = StringUtil.binaryToDecimal(instruction.substring(10, 11));
		address = StringUtil.binaryToDecimal(instruction.substring(11, 16));

		int effectiveAddress = EffectiveAddress.calculateEA(ix, address, i, mcu, registers);

		// we check if effective address is a reserved memory address or not
		if (effectiveAddress < 6) {
			throw new MachineFaultException(Const.FaultCode.ILL_MEM_RSV.getValue(),
					Const.FaultCode.ILL_MEM_RSV.getMessage());
			// now we check if address is beyond our current memory size
		} else if (effectiveAddress > mcu.getCurrentMemorySize() - 1) {
			throw new MachineFaultException(Const.FaultCode.ILL_MEM_BYD.getValue(),
					Const.FaultCode.ILL_MEM_BYD.getMessage());
		} else {
			registers.setR3(registers.getPC() + 1);
			registers.setPC(effectiveAddress);
		}
	}

	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return "JSR " + ix + ", " + address + ", " + i;
	}

}