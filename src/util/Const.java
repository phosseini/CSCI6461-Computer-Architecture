package util;

import java.util.HashMap;

public class Const {

	public static final Integer MEMORY_RESERVE_LOCATION = 5;

	public static final HashMap<String, Integer> ROM = new HashMap<>();
	static {
		// address-value pair Boot Program
		ROM.put("8", 0x69f); //LDR 2, 2, 31
		ROM.put("9", 0x75b); //LDR 3, 1, 27
		ROM.put("10", 0xa9e); //STR 2, 2, 30
		ROM.put("11", 0x943); //STR 1, 1, 3
		ROM.put("12", 0xf87); //LDA 3, 2, 7
		ROM.put("13", 0xecb); //LDA 2, 3,11
		ROM.put("14", 0xa595); //LDX 1, 2, 21
		ROM.put("15", 0xa7c5); //LDX 3, 3, 5
		ROM.put("16", 0xa947); //STX 1, 1, 7
		ROM.put("17", 0xa9ca); //STX 1, 3, 10
		
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
		OPCODE.put("HLT", "000000");
		OPCODE.put("LDR", "000001");
		OPCODE.put("STR", "000010");
		OPCODE.put("LDA", "000011");
		OPCODE.put("LDX", "101001");
		OPCODE.put("STX", "101010");
	}

}
