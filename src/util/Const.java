package util;

import java.util.HashMap;

public class Const {

    public static final Integer MEMORY_RESERVE_LOCATION = 5;
    public static final Integer MEMORY_WORDS_BOUND = 2048;
    public static final Integer MEMORY_WORDS_BOUND_EXPANDED = 4096;
    public static final Integer CACHE_LINES = 16;
    public static final Integer BOOT_PROG_BASE = 8;
    public static final Integer BOOT_PROG1_BASE = 101;
    public static final Integer PG_20_BASE = 300;
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
        //Pre.put("6", 106 );
        //Pre.put("12", 112 );
        //Pre.put("18", 118);  
        //Pre.put("18", 118); 
        //Pre.put("23", 123);
        //Pre.put("29", 129);
        // 7 ~ 26 store the 20 numbers
        // 27 store the 1 number
        Pre.put("28", 302); // start of block (0)
        Pre.put("29", 7); // the first address of the numbers
        Pre.put("30", 20); // the numbers of words need to read in program 1
        Pre.put("31", 44); //ASCII for ','

    }
    
    public static final HashMap<String, Integer> PG1_20 = new HashMap<>();
    static{
        PG1_20.put("300", 0x7c8f); //SRC Reset r0 = 0
        PG1_20.put("301", 0xf3e); //LDA r3 with c(memory 30)
        // (0)
        PG1_20.put("302", 0xe3f); // LDA r2 with c(memory 31)
        PG1_20.put("303", 0xf500); //IN r1
        PG1_20.put("304", 0x5980); //TRR r1, r2
        PG1_20.put("305", 0xe3c);  // LDA r2 with c(memory 28)
        PG1_20.put("306", 0x1a14); //AIR r2, 20
        PG1_20.put("307", 0xa3c); //Store r2 into location c(memory 28)
        PG1_20.put("308", 0x333c);// JCC cc=3 to c(memory 28) means jump to (1)
        PG1_20.put("309", 0xe3c);//Load r2 with c(memory 28)
        PG1_20.put("310", 0x1a14);//AIR r2, 20
        PG1_20.put("311", 0xa3c);//Store r2 into location c(memory 28)
        PG1_20.put("312", 0x343c);//JMA to c(memory 28) means jump to (2)
        //(1)
        PG1_20.put("322", 0x83d);//Store r0 into memory with a location of c(memory 29)
        PG1_20.put("323", 0xd3d);//Load r1 with content of memory address 29
        PG1_20.put("324", 0x1901);//AIR r1 with 1
        PG1_20.put("325", 0x91d);//Store r1 into memory address 29
        PG1_20.put("326", 0x7c8f);//Reset r0
        PG1_20.put("327", 0xe3c);//Load r2 with c(memory 28)
        PG1_20.put("328", 0x1a14);//AIR r2, 20
        PG1_20.put("329", 0x1a14);//AIR r2, 20
        PG1_20.put("330", 0xa3c);//Store r2 into location c(memory 28)
        PG1_20.put("331", 0x343c);//JMA to c(memory 28) means jump to (2)
        //(2)
        PG1_20.put("342", 0x83D);//STR r0 into memory with a location of c(memory 29)
        PG1_20.put("343", 0x103D);//AMR r0, c(memory 29)
        PG1_20.put("344", 0x103D);//AMR r0, c(memory 29)
        PG1_20.put("345", 0x103D);//AMR r0, c(memory 29)
        PG1_20.put("346", 0x103D);//AMR r0, c(memory 29)
        PG1_20.put("347", 0x103D);//AMR r0, c(memory 29)
        PG1_20.put("348", 0x103D);//AMR r0, c(memory 29)
        PG1_20.put("349", 0x103D);//AMR r0, c(memory 29)
        PG1_20.put("350", 0x103D);//AMR r0, c(memory 29)
        PG1_20.put("351", 0x103D);//AMR r0, c(memory 29)
        PG1_20.put("352", 0x93D);//Store r1 into memory with a location of c(memory 29)
        PG1_20.put("353", 0x103D);//AMR r0, c(memory 29)
        PG1_20.put("354", 0xE3C);//LDA r2 with c(memory 28)
        PG1_20.put("355", 0x1A14);//AIR r2, 20
        PG1_20.put("356", 0xA3C);//Store r2 into location c(memory 28)
        PG1_20.put("357", 0x343C);//JMA to c(memory 28) means jump to (3)
        //(3)
        PG1_20.put("362", 0xE3C);//Load r2 with c(memory 28)
        PG1_20.put("363", 0x1E14);//SIR r2, 20
        PG1_20.put("364", 0x1E14);//SIR r2, 20
        PG1_20.put("365", 0x1E14);//SIR r2, 20
        PG1_20.put("366", 0xA3C);//Store r2 into location c(memory 28)
        PG1_20.put("367", 0x433C);//SOB r3, c(memory 28)
    }

    /**
     *  table and routine for TRAP instruction
     */
    public static final HashMap<String, Integer> TB = new HashMap<>();
    static {
        TB.put("0", 1500);
        TB.put("1500", 1516);
        TB.put("1501", 1521);
        TB.put("1502", 1526);
        TB.put("1503", 1531);
        TB.put("1504", 1536);
        TB.put("1505", 1541);
        TB.put("1506", 1546);
        TB.put("1507", 1551);
        TB.put("1508", 1556);
        TB.put("1509", 1561);
        TB.put("1510", 1566);
        TB.put("1511", 1571);
        TB.put("1512", 1576);
        TB.put("1513", 1581);
        TB.put("1514", 1586);
        TB.put("1515", 1591);

        // routine 1
        TB.put("1516", 0x1801);// AIR 0, 1 = 0001100000000001
        TB.put("1517", 0x1901);// AIR 1, 1 = 0001100100000001
        TB.put("1518", 0x1a01);// AIR 2, 1 = 0001101000000001
        TB.put("1519", 0x1b01);// AIR 3, 1 = 0001101100000001
        // routine 2
        TB.put("1521", 0x1802);
        TB.put("1522", 0x1902);
        TB.put("1523", 0x1a02);
        TB.put("1524", 0x1b02);
        // routine 3
        TB.put("1526", 0x1803);
        TB.put("1527", 0x1903);
        TB.put("1528", 0x1a03);
        TB.put("1529", 0x1b03);
        // routine 4
        TB.put("1531", 0x1804);
        TB.put("1532", 0x1904);
        TB.put("1533", 0x1a04);
        TB.put("1534", 0x1b04);
        // routine 5
        TB.put("1536", 0x1805);
        TB.put("1537", 0x1905);
        TB.put("1538", 0x1a05);
        TB.put("1539", 0x1b05);
        // routine 6
        TB.put("1541", 0x1806);
        TB.put("1542", 0x1906);
        TB.put("1543", 0x1a06);
        TB.put("1544", 0x1b06);
        // routine 7
        TB.put("1546", 0x1807);
        TB.put("1547", 0x1907);
        TB.put("1548", 0x1a07);
        TB.put("1549", 0x1b07);
        // routine 8
        TB.put("1551", 0x1808);
        TB.put("1552", 0x1908);
        TB.put("1553", 0x1a08);
        TB.put("1554", 0x1b08);
        // routine 9
        TB.put("1556", 0x1809);
        TB.put("1557", 0x1909);
        TB.put("1558", 0x1a09);
        TB.put("1559", 0x1b09);
        // routine 10
        TB.put("1561", 0x180a);
        TB.put("1562", 0x190a);
        TB.put("1563", 0x1a0a);
        TB.put("1564", 0x1b0a);
        // routine 11
        TB.put("1566", 0x180b);
        TB.put("1567", 0x190b);
        TB.put("1568", 0x1a0b);
        TB.put("1569", 0x1b0b);
        // routine 12
        TB.put("1571", 0x180c);
        TB.put("1572", 0x190c);
        TB.put("1573", 0x1a0c);
        TB.put("1574", 0x1b0c);
        // routine 13
        TB.put("1576", 0x180d);
        TB.put("1577", 0x190d);
        TB.put("1578", 0x1a0d);
        TB.put("1579", 0x1b0d);
        // routine 14
        TB.put("1581", 0x180e);
        TB.put("1582", 0x190e);
        TB.put("1583", 0x1a0e);
        TB.put("1584", 0x1b0e);
        // routine 15
        TB.put("1586", 0x180f);
        TB.put("1587", 0x190f);
        TB.put("1588", 0x1a0f);
        TB.put("1589", 0x1b0f);
        // routine 16
        TB.put("1591", 0x1810);
        TB.put("1592", 0x1910);
        TB.put("1593", 0x1a10);
        TB.put("1594", 0x1b10);

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
