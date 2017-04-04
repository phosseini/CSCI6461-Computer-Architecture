package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.Const;
import util.EffectiveAddress;
import util.MachineFaultException;
import util.StringUtil;

public class JCC extends AbstractInstruction {

	int cc;
	int ix;
	int address;
	int i;

	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		// -----------------------------------
		// 012: JCC -> Jump If Condition Code cc replaces r for this instruction
		// -----------------------------------
		cc = StringUtil.binaryToDecimal(instruction.substring(6, 8));
		ix = Integer.valueOf(instruction.substring(8, 10));
		address = StringUtil.binaryToDecimal(instruction.substring(11, 16));
		i = Integer.valueOf(instruction.substring(10, 11));

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

			if (registers.getCCElementByBit(cc)) {
				registers.setPC(effectiveAddress);
			} else {
				registers.increasePCByOne();
			}
		}
		
		// System.out.println("this is a JCC instruction!");
	}

	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return "JCC " + cc + ", " + ix + ", " + address + ", " + i;
	}

}