package util;

import java.util.HashMap;

public class Const {

	public static final Integer MEMORY_RESERVE_LOCATION = 5;

	public static final HashMap<String, Integer> ROM = new HashMap<>();
	static {
		// address-value pair Boot Program
		ROM.put("8", 0x1234);
		ROM.put("9", 0x0809);
		ROM.put("10", 0x2333);
		ROM.put("11", 0x7777);
	}


	public enum ConditionCode {
		OVERFLOW(0), UNDERFLOW(1), DIVZERO(2), EQUALORNOT(3);
		int value;

		private ConditionCode(int value) {
			this.value = value;
		}
		
		public int getValue(){
			return this.value;
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
		
		public int getValue(){
			return this.value;
		}
	}


	
	public static final HashMap<String, String> OPCODE = new HashMap<String, String>();
	static{
		OPCODE.put("LDR", "000001");
		OPCODE.put("STR", "000010");
		OPCODE.put("LDA", "000011");
		OPCODE.put("LDX", "101001");
		OPCODE.put("STX", "101010");
	}

}
