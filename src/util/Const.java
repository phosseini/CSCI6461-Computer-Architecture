package util;

import java.util.HashMap;

public class Const {

    public static final Integer MEMORY_RESERVE_LOCATION = 5;
    public static final Integer MEMORY_WORDS_BOUND = 2048;
    public static final Integer MEMORY_WORDS_BOUND_EXPANDED = 4096;
    public static final Integer CACHE_LINES = 16;
    public static final Integer BOOT_PROG_BASE = 8;
    public static final Integer BOOT_PROG1_BASE = 101;
    public static final HashMap<String, Integer> ROM = new HashMap<>();
    static {
        // address-value pair Boot Program
        ROM.put("8", 0x69f); // LDR 2, 2, 31
        ROM.put("9", 0x75b); // LDR 3, 1, 27
        ROM.put("10", 0xa9e); // STR 2, 2, 30
        ROM.put("11", 0x943); // STR 1, 1, 3
        ROM.put("12", 0xf87); // LDA 3, 2, 7
        ROM.put("13", 0xecb); // LDA 2, 3,11
        ROM.put("14", 0xa595); // LDX 1, 2, 21
        ROM.put("15", 0xa7c5); // LDX 3, 3, 5
        ROM.put("16", 0xa947); // STX 1, 1, 7
        ROM.put("17", 0xa9ca); // STX 1, 3, 10

    }
    public static final HashMap<String, Integer> Pro1 = new HashMap<>();
    static {
        // address-value pair Boot Program
        Pro1.put("101",0x401 );
        Pro1.put("102",0x1400  );
        Pro1.put("103",0x4426  );
        Pro1.put("104",0x400  );
        Pro1.put("105",0x1401  );
        Pro1.put("106",0x816  );
        Pro1.put("107",0x402  );
        Pro1.put("108",0x1400  );
        Pro1.put("109",0x442c  );
        Pro1.put("110",0x400  );
        Pro1.put("111",0x1402  );
        Pro1.put("112",0x817  );
        Pro1.put("113",0x416  );
        Pro1.put("114",0x1417  );
        Pro1.put("115",0x4432  );
        Pro1.put("116",0x417  );
        Pro1.put("117",0x816  );
        Pro1.put("118",0x403  );
        Pro1.put("119",0x1400  );
        Pro1.put("120",0x4437  );
        Pro1.put("121",0x400  );
        Pro1.put("122",0x1402  );
        Pro1.put("123",0x817  );
        Pro1.put("124",0x416  );
        Pro1.put("125",0x1417  );
        Pro1.put("126",0x443d  );
        Pro1.put("127",0x417  );
        Pro1.put("128",0x816  );
        Pro1.put("129",0x404  );
    }
    
    public static final HashMap<String, Integer> Pre = new HashMap<>();
    static {
        Pre.put("6", 106 );
        Pre.put("12", 112 );
        Pre.put("18", 118);  
        Pre.put("18", 118); 
        Pre.put("23", 123);
        Pre.put("29", 129);

    }

    public static final HashMap<String, Integer> TB = new HashMap<>();
    static {
        TB.put("0", 500);
        TB.put("500", 516);
        TB.put("501", 521);
        TB.put("502", 526);
        TB.put("503", 531);
        TB.put("504", 536);
        TB.put("505", 541);
        TB.put("506", 546);
        TB.put("507", 551);
        TB.put("508", 556);
        TB.put("509", 561);
        TB.put("510", 566);
        TB.put("511", 571);
        TB.put("512", 576);
        TB.put("513", 581);
        TB.put("514", 586);
        TB.put("515", 591);

        // routine 1
        TB.put("516", 0x1801);// AIR 0, 1 = 0001100000000001
        TB.put("517", 0x1901);// AIR 1, 1 = 0001100100000001
        TB.put("518", 0x1a01);// AIR 2, 1 = 0001101000000001
        TB.put("519", 0x1b01);// AIR 3, 1 = 0001101100000001
        // routine 2
        TB.put("521", 0x1802);
        TB.put("522", 0x1902);
        TB.put("523", 0x1a02);
        TB.put("524", 0x1b02);
        // routine 3
        TB.put("526", 0x1803);
        TB.put("527", 0x1903);
        TB.put("528", 0x1a03);
        TB.put("529", 0x1b03);
        // routine 4
        TB.put("531", 0x1804);
        TB.put("532", 0x1904);
        TB.put("533", 0x1a04);
        TB.put("534", 0x1b04);
        // routine 5
        TB.put("536", 0x1805);
        TB.put("537", 0x1905);
        TB.put("538", 0x1a05);
        TB.put("539", 0x1b05);
        // routine 6
        TB.put("541", 0x1806);
        TB.put("542", 0x1906);
        TB.put("543", 0x1a06);
        TB.put("544", 0x1b06);
        // routine 7
        TB.put("546", 0x1807);
        TB.put("547", 0x1907);
        TB.put("548", 0x1a07);
        TB.put("549", 0x1b07);
        // routine 8
        TB.put("551", 0x1808);
        TB.put("552", 0x1908);
        TB.put("553", 0x1a08);
        TB.put("554", 0x1b08);
        // routine 9
        TB.put("556", 0x1809);
        TB.put("557", 0x1909);
        TB.put("558", 0x1a09);
        TB.put("559", 0x1b09);
        // routine 10
        TB.put("561", 0x180a);
        TB.put("562", 0x190a);
        TB.put("563", 0x1a0a);
        TB.put("564", 0x1b0a);
        // routine 11
        TB.put("566", 0x180b);
        TB.put("567", 0x190b);
        TB.put("568", 0x1a0b);
        TB.put("569", 0x1b0b);
        // routine 12
        TB.put("571", 0x180c);
        TB.put("572", 0x190c);
        TB.put("573", 0x1a0c);
        TB.put("574", 0x1b0c);
        // routine 13
        TB.put("576", 0x180d);
        TB.put("577", 0x190d);
        TB.put("578", 0x1a0d);
        TB.put("579", 0x1b0d);
        // routine 14
        TB.put("581", 0x180e);
        TB.put("582", 0x190e);
        TB.put("583", 0x1a0e);
        TB.put("584", 0x1b0e);
        // routine 15
        TB.put("586", 0x180f);
        TB.put("587", 0x190f);
        TB.put("588", 0x1a0f);
        TB.put("589", 0x1b0f);
        // routine 16
        TB.put("591", 0x1810);
        TB.put("592", 0x1910);
        TB.put("593", 0x1a10);
        TB.put("594", 0x1b10);

    }

    /**
     * 0 - OVERFLOW</br>
     * 1 - UNDERFLOW</br>
     * 2 - DIVZERO</br>
     * 3 - EQUALORNOT
     */
    public enum ConditionCode {
        OVERFLOW(0), UNDERFLOW(1), DIVZERO(2), EQUALORNOT(3);
        int value;

        private ConditionCode(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    /**
     * Machine Fault</br>
     * 0 - ILL_MEM_RSV: Illegal Memory Address to Reserved Locations</br>
     * 1 - ILL_TRPC: Illegal TRAP code</br>
     * 2 - ILL_OPRC: Illegal Operation Code</br>
     * 3 - ILL_MEM_BYD: Illegal Memory Address beyond 2048 (memory installed)
     */
    public enum FaultCode {
        ILL_MEM_RSV(0), ILL_TRPC(1), ILL_OPRC(2), ILL_MEM_BYD(3);
        int value;

        private FaultCode(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum DevId {
        KEYBOARD(0), PRINTER(1);
        int value;

        private DevId(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    /**
     * 000000 - HLT</br>
     * 000001 - LDR</br>
     * 000010 - STR</br>
     * 000011 - LDA</br>
     * 101001 - LDX</br>
     * 101010 - STX</br>
     */
    public static final HashMap<String, String> OPCODE = new HashMap<String, String>();
    static {
        OPCODE.put("000000", "HLT");
        OPCODE.put("011110", "TRAP");
        OPCODE.put("000001", "LDR");
        OPCODE.put("000010", "STR");
        OPCODE.put("000011", "LDA");
        OPCODE.put("101001", "LDX");
        OPCODE.put("101010", "STX");
        OPCODE.put("111101", "IN");
        OPCODE.put("111110", "OUT");
        OPCODE.put("001010", "JZ");
        OPCODE.put("001011", "JNE");
        OPCODE.put("001100", "JCC");
        OPCODE.put("001101", "JMA");
        OPCODE.put("001110", "JSR");
        OPCODE.put("001111", "RFS");
        OPCODE.put("010000", "SOB");
        OPCODE.put("010001", "JGE");
        OPCODE.put("011111", "SRC");
        OPCODE.put("100000", "RRC");
        OPCODE.put("000100", "AMR");
        OPCODE.put("000101", "SMR");
        OPCODE.put("010111", "AND");
        OPCODE.put("011000", "ORR");
        OPCODE.put("011001", "NOT");
        OPCODE.put("000110", "AIR");
        OPCODE.put("000111", "SIR");
        OPCODE.put("010100", "MLT");
        OPCODE.put("010101", "DVD");
        OPCODE.put("010110", "TRR");
    }

}
