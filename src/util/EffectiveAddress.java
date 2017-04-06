package util;

import cpu.Registers;
import memory.MCU;

public class EffectiveAddress {

	// calculating the effective address
	public static int EA(String instruction, memory.MCU mcu, cpu.Registers registers) {

		int address = StringUtil.binaryToDecimal(instruction.substring(11, 16));
		int i = StringUtil.binaryToDecimal(instruction.substring(10, 11));
		int ix = StringUtil.binaryToDecimal(instruction.substring(8, 10));
		// int r = Integer.valueOf(instruction.substring(6, 8));
		// int opcode = Integer.valueOf(instruction.substring(0, 6));

		if (i == 0) {
			// NO indirect addressing
			if (ix == 0) {
				return address;
			} else {
				return address + registers.getXnByNum(ix);
			}

		} else if (i == 1) {
			// indirect addressing, but NO indexing
			if (ix == 0) {
				registers.setMAR(address);
				registers.setMBR(mcu.fetchFromCache(registers.getMAR()));
			} else {
				registers.setMAR(address + registers.getXnByNum(ix));
				registers.setMBR(mcu.fetchFromCache(registers.getMAR()));
			}
			return registers.getMBR();
		}

		return 0;
	}

	public static int calculateEA(int ix, int address, int i, MCU mcu, Registers registers)
			throws MachineFaultException {
		if (i == 0) {
			// NO indirect addressing
			if (ix == 0) {// NO indexing
				if (checkMachineFault(address, mcu) == 1) {
					return address;
				}
			} else {
				if (checkMachineFault(address + registers.getXnByNum(ix), mcu) == 1) {
					return address + registers.getXnByNum(ix);
				}
			}

		} else if (i == 1) {
			// indirect addressing
			if (ix == 0) {// NO indexing
				if (checkMachineFault(address, mcu) == 1) {
					registers.setMAR(address);
					registers.setMBR(mcu.fetchFromCache(registers.getMAR()));
				}
			} else {
				if (checkMachineFault(address + registers.getXnByNum(ix), mcu) == 1) {
					registers.setMAR(address + registers.getXnByNum(ix));
					registers.setMBR(mcu.fetchFromCache(registers.getMAR()));
				}
			}
			return registers.getMBR();
		}
		return 0;
	}

	public static int checkMachineFault(int address, MCU mcu) throws MachineFaultException {
		// in here we check if we have a machine fault or not

		// first, we should check if it is a reserved location in memory or not
		if (address < 6) {
			throw new MachineFaultException(Const.FaultCode.ILL_MEM_RSV.getValue(),
					Const.FaultCode.ILL_MEM_RSV.getMessage());
			// now we should check if address is beyond the size of memory or
			// not
		} else if (address > mcu.getCurrentMemorySize() - 1) {
			throw new MachineFaultException(Const.FaultCode.ILL_MEM_BYD.getValue(),
					Const.FaultCode.ILL_MEM_BYD.getMessage());
			// if there is no machine fault we can safely return 1
		} else {
			return 1;
		}
	}

}