package util;

import java.util.HashMap;

public class Const {
	
		public static final HashMap<String, Integer> ROM = new HashMap<>();
		static{
			// address-value pair instruction
			ROM.put("22", 0x1234);
			ROM.put("23", 0x0809);
		}
}
