package util;

import java.util.HashMap;

public class Const {

	public static final Integer MEMORY_RESERVE_LOCATION = 5;

	public static final HashMap<String, Integer> ROM = new HashMap<>();
	static {
		// address-value pair instruction
		ROM.put("22", 0x1234);
		ROM.put("23", 0x0809);
		ROM.put("24", 0x2333);
	}

	// the start and end address of instructions in memory
	public enum Instruction {
		Start(22), End(24);
		int value;

		private Instruction(int value) {
			this.value = value;
		}
	}

	public enum ConditionCode {
		OVERFLOW(0), UNDERFLOW(1), DIVZERO(2), EQUALORNOT(3);
		int value;

		private ConditionCode(int value) {
			this.value = value;
		}
	}

	// Machine Fault
	// 0 Illegal Memory Address to Reserved Locations
	// 1 Illegal TRAP code
	// 2 Illegal Operation Code
	// 3 Illegal Memory Address beyond 2048 (memory installed)
	public enum MachineFault {
		ILL_MEM_RSV(0), ILL_TPC(1), ILL_OPC(2), ILL_MEM_BYD(3);
		int value;

		private MachineFault(int value) {
			this.value = value;
		}
	}

	public enum OpCode {
		HLT("000000"), TRAP("100100"), LDR("000001"), STR("000010"), LDA("000011"), LDX("101001"), STX("101010");

		String value;

		private OpCode(String value) {
			this.value = value;
		}
	}

}
