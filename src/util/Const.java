package util;

import java.util.HashMap;

import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;

public class Const {

	public static final Integer MEMORY_RESERVE_LOCATION = 5;
	public static final Integer MEMORY_WORDS_BOUND = 2048;
	public static final Integer MEMORY_WORDS_BOUND_EXPANDED = 4096;
	public static final Integer CACHE_LINES = 16;
	public static final Integer BOOT_PROG_BASE = 8;
	public static final Integer PG_10BASE = 500;
	public static final Integer PG_10END = 871;
	public static final Integer PG_20_BASE = 300;
	public static final Integer PG_20_END = 370;
	public static final Integer PG2_0_BASE = 1600;
	public static final Integer PG2_0_END = 1624;
	public static final Integer PG2_1_BASE = 1700;
	public static final Integer PG2_1_END = 1724;
	public static final Integer PG2_2_BASE = 900;
	public static final Integer PG2_2_END = 989;
	public static final Integer PG_P_BASE = 1800;
	public static final Integer PG_P_END = 1862;
	public static final Integer PG_P1_BASE = 1000;
	public static final Integer PG_P1_END = 1062;
	public static final Integer PG_P2_BASE = 1100;
	public static final Integer PG_P2_END = 1162;
	public static final Integer PG_3_BASE = 1200;
	public static final Integer PG_3_END = 1208;
	// public static final HashMap<String, Integer> ROM = new HashMap<>();
	// static {
	// // address-value pair Boot Program
	// ROM.put("8", 0x69f); // LDR 2, 2, 31
	// ROM.put("9", 0x75b); // LDR 3, 1, 27
	// ROM.put("10", 0xa9e); // STR 2, 2, 30
	// ROM.put("11", 0x943); // STR 1, 1, 3
	// ROM.put("12", 0xf87); // LDA 3, 2, 7
	// ROM.put("13", 0xecb); // LDA 2, 3,11
	// ROM.put("14", 0xa595); // LDX 1, 2, 21
	// ROM.put("15", 0xa7c5); // LDX 3, 3, 5
	// ROM.put("16", 0xa947); // STX 1, 1, 7
	// ROM.put("17", 0xa9ca); // STX 1, 3, 10
	// }

	public static final HashMap<String, Integer> PG1_10 = new HashMap<>();
	static {
		PG1_10.put("500", 0x407);
		PG1_10.put("501", 0x141B);
		PG1_10.put("502", 0x443F);
		PG1_10.put("503", 0x41B);
		PG1_10.put("504", 0x1407);
		PG1_10.put("505", 0x81C);
		PG1_10.put("506", 0x71F);
		PG1_10.put("507", 0x1B0B);
		PG1_10.put("508", 0xB1F);
		PG1_10.put("509", 0x408);
		PG1_10.put("510", 0x141B);
		PG1_10.put("511", 0x81D);
		PG1_10.put("512", 0x443F);
		PG1_10.put("513", 0x41B);
		PG1_10.put("514", 0x1408);
		PG1_10.put("515", 0x81D);
		PG1_10.put("516", 0x71F);
		PG1_10.put("517", 0x1B0C);
		PG1_10.put("518", 0xB1F);
		PG1_10.put("519", 0x41D);
		PG1_10.put("520", 0x141C);
		PG1_10.put("521", 0x507);
		PG1_10.put("522", 0x91E);
		PG1_10.put("523", 0x61C);
		PG1_10.put("524", 0x443F);
		PG1_10.put("525", 0x408);
		PG1_10.put("526", 0x81E);
		PG1_10.put("527", 0x61D);
		PG1_10.put("528", 0xA1C);
		PG1_10.put("529", 0x71F);
		PG1_10.put("530", 0x1B09);
		PG1_10.put("531", 0xB1F);
		PG1_10.put("532", 0x409);
		PG1_10.put("533", 0x141B);
		PG1_10.put("534", 0x443F);
		PG1_10.put("535", 0x41B);
		PG1_10.put("536", 0x1409);
		PG1_10.put("537", 0x81D);
		PG1_10.put("538", 0x71F);
		PG1_10.put("539", 0x1B0B);
		PG1_10.put("540", 0xB1F);
		PG1_10.put("541", 0x41D);
		PG1_10.put("542", 0x141C);
		PG1_10.put("543", 0x443F);
		PG1_10.put("544", 0x61D);
		PG1_10.put("545", 0xA1C);
		PG1_10.put("546", 0x509);
		PG1_10.put("547", 0x91E);

		// for M(10)

		PG1_10.put("548", 0x71F);
		PG1_10.put("549", 0x1B08);
		PG1_10.put("550", 0xB1F);
		PG1_10.put("551", 0x40A);
		PG1_10.put("552", 0x141B);
		PG1_10.put("553", 0x443F);
		PG1_10.put("554", 0x41B);
		PG1_10.put("555", 0x140A);
		PG1_10.put("556", 0x81D);
		PG1_10.put("557", 0x71F);
		PG1_10.put("558", 0x1B0B);
		PG1_10.put("559", 0xB1F);
		PG1_10.put("560", 0x41D);
		PG1_10.put("561", 0x141C);
		PG1_10.put("562", 0x443F);
		PG1_10.put("563", 0x61D);
		PG1_10.put("564", 0xA1C);
		PG1_10.put("565", 0x50A);
		PG1_10.put("566", 0x91E);
		// for M(11)

		PG1_10.put("567", 0x71F);
		PG1_10.put("568", 0x1B08);
		PG1_10.put("569", 0xB1F);
		PG1_10.put("570", 0x40B);
		PG1_10.put("571", 0x141B);
		PG1_10.put("572", 0x443F);
		PG1_10.put("573", 0x41B);
		PG1_10.put("574", 0x140B);
		PG1_10.put("575", 0x81D);
		PG1_10.put("576", 0x71F);
		PG1_10.put("577", 0x1B0B);
		PG1_10.put("578", 0xB1F);
		PG1_10.put("579", 0x41D);
		PG1_10.put("580", 0x141C);
		PG1_10.put("581", 0x443F);
		PG1_10.put("582", 0x61D);
		PG1_10.put("583", 0xA1C);
		PG1_10.put("584", 0x50B);
		PG1_10.put("585", 0x91E);
		// for M(12)
		PG1_10.put("586", 0x71F);
		PG1_10.put("587", 0x1B08);
		PG1_10.put("588", 0xB1F);
		PG1_10.put("589", 0x40C);
		PG1_10.put("590", 0x141B);
		PG1_10.put("591", 0x443F);
		PG1_10.put("592", 0x41B);
		PG1_10.put("593", 0x140C);
		PG1_10.put("594", 0x81D);
		PG1_10.put("595", 0x71F);
		PG1_10.put("596", 0x1B0B);
		PG1_10.put("597", 0xB1F);
		PG1_10.put("598", 0x41D);
		PG1_10.put("599", 0x141C);
		PG1_10.put("600", 0x443F);
		PG1_10.put("601", 0x61D);
		PG1_10.put("602", 0xA1C);
		PG1_10.put("603", 0x50C);
		PG1_10.put("604", 0x91E);
		// for M(13)
		PG1_10.put("605", 0x71F);
		PG1_10.put("606", 0x1B08);
		PG1_10.put("607", 0xB1F);
		PG1_10.put("608", 0x40D);
		PG1_10.put("609", 0x141B);
		PG1_10.put("610", 0x443F);
		PG1_10.put("611", 0x41B);
		PG1_10.put("612", 0x140D);
		PG1_10.put("613", 0x81D);
		PG1_10.put("614", 0x71F);
		PG1_10.put("615", 0x1B0B);
		PG1_10.put("616", 0xB1F);
		PG1_10.put("617", 0x41D);
		PG1_10.put("618", 0x141C);
		PG1_10.put("619", 0x443F);
		PG1_10.put("620", 0x61D);
		PG1_10.put("621", 0xA1C);
		PG1_10.put("622", 0x50D);
		PG1_10.put("623", 0x91E);
		// for M(14)
		PG1_10.put("624", 0x71F);
		PG1_10.put("625", 0x1B08);
		PG1_10.put("626", 0xB1F);
		PG1_10.put("627", 0x40E);
		PG1_10.put("628", 0x141B);
		PG1_10.put("629", 0x443F);
		PG1_10.put("630", 0x41B);
		PG1_10.put("631", 0x140E);
		PG1_10.put("632", 0x81D);
		PG1_10.put("633", 0x71F);
		PG1_10.put("634", 0x1B0B);
		PG1_10.put("635", 0xB1F);
		PG1_10.put("636", 0x41D);
		PG1_10.put("637", 0x141C);
		PG1_10.put("638", 0x443F);
		PG1_10.put("639", 0x61D);
		PG1_10.put("640", 0xA1C);
		PG1_10.put("641", 0x50E);
		PG1_10.put("642", 0x91E);
		// for M(15)
		PG1_10.put("643", 0x71F);
		PG1_10.put("644", 0x1B08);
		PG1_10.put("645", 0xB1F);
		PG1_10.put("646", 0x40F);
		PG1_10.put("647", 0x141B);
		PG1_10.put("648", 0x443F);
		PG1_10.put("649", 0x41B);
		PG1_10.put("650", 0x140F);
		PG1_10.put("651", 0x81D);
		PG1_10.put("652", 0x71F);
		PG1_10.put("653", 0x1B0B);
		PG1_10.put("654", 0xB1F);
		PG1_10.put("655", 0x41D);
		PG1_10.put("656", 0x141C);
		PG1_10.put("657", 0x443F);
		PG1_10.put("658", 0x61D);
		PG1_10.put("659", 0xA1C);
		PG1_10.put("660", 0x50F);
		PG1_10.put("661", 0x91E);
		// for M(16)
		PG1_10.put("662", 0x71F);
		PG1_10.put("663", 0x1B08);
		PG1_10.put("664", 0xB1F);
		PG1_10.put("665", 0x410);
		PG1_10.put("666", 0x141B);
		PG1_10.put("667", 0x443F);
		PG1_10.put("668", 0x41B);
		PG1_10.put("669", 0x1410);
		PG1_10.put("670", 0x81D);
		PG1_10.put("671", 0x71F);
		PG1_10.put("672", 0x1B0B);
		PG1_10.put("673", 0xB1F);
		PG1_10.put("674", 0x41D);
		PG1_10.put("675", 0x141C);
		PG1_10.put("676", 0x443F);
		PG1_10.put("677", 0x61D);
		PG1_10.put("678", 0xA1C);
		PG1_10.put("679", 0x510);
		PG1_10.put("680", 0x91E);
		// for M(17)
		PG1_10.put("681", 0x71F);
		PG1_10.put("682", 0x1B08);
		PG1_10.put("683", 0xB1F);
		PG1_10.put("684", 0x411);
		PG1_10.put("685", 0x141B);
		PG1_10.put("686", 0x443F);
		PG1_10.put("687", 0x41B);
		PG1_10.put("688", 0x1411);
		PG1_10.put("689", 0x81D);
		PG1_10.put("690", 0x71F);
		PG1_10.put("691", 0x1B0B);
		PG1_10.put("692", 0xB1F);
		PG1_10.put("693", 0x41D);
		PG1_10.put("694", 0x141C);
		PG1_10.put("695", 0x443F);
		PG1_10.put("696", 0x61D);
		PG1_10.put("697", 0xA1C);
		PG1_10.put("698", 0x511);
		PG1_10.put("699", 0x91E);
		// for M(18)
		PG1_10.put("700", 0x71F);
		PG1_10.put("701", 0x1B08);
		PG1_10.put("702", 0xB1F);
		PG1_10.put("703", 0x412);
		PG1_10.put("704", 0x141B);
		PG1_10.put("705", 0x443F);
		PG1_10.put("706", 0x41B);
		PG1_10.put("707", 0x1412);
		PG1_10.put("708", 0x81D);
		PG1_10.put("709", 0x71F);
		PG1_10.put("710", 0x1B0B);
		PG1_10.put("711", 0xB1F);
		PG1_10.put("712", 0x41D);
		PG1_10.put("713", 0x141C);
		PG1_10.put("714", 0x443F);
		PG1_10.put("715", 0x61D);
		PG1_10.put("716", 0xA1C);
		PG1_10.put("717", 0x512);
		PG1_10.put("718", 0x91E);
		// for M(19)
		PG1_10.put("719", 0x71F);
		PG1_10.put("720", 0x1B08);
		PG1_10.put("721", 0xB1F);
		PG1_10.put("722", 0x413);
		PG1_10.put("723", 0x141B);
		PG1_10.put("724", 0x443F);
		PG1_10.put("725", 0x41B);
		PG1_10.put("726", 0x1413);
		PG1_10.put("727", 0x81D);
		PG1_10.put("728", 0x71F);
		PG1_10.put("729", 0x1B0B);
		PG1_10.put("730", 0xB1F);
		PG1_10.put("731", 0x41D);
		PG1_10.put("732", 0x141C);
		PG1_10.put("733", 0x443F);
		PG1_10.put("734", 0x61D);
		PG1_10.put("735", 0xA1C);
		PG1_10.put("736", 0x513);
		PG1_10.put("737", 0x91E);
		// for M(20)
		PG1_10.put("738", 0x71F);
		PG1_10.put("739", 0x1B08);
		PG1_10.put("740", 0xB1F);
		PG1_10.put("741", 0x414);
		PG1_10.put("742", 0x141B);
		PG1_10.put("743", 0x443F);
		PG1_10.put("744", 0x41B);
		PG1_10.put("745", 0x1414);
		PG1_10.put("746", 0x81D);
		PG1_10.put("747", 0x71F);
		PG1_10.put("748", 0x1B0B);
		PG1_10.put("749", 0xB1F);
		PG1_10.put("750", 0x41D);
		PG1_10.put("751", 0x141C);
		PG1_10.put("752", 0x443F);
		PG1_10.put("753", 0x61D);
		PG1_10.put("754", 0xA1C);
		PG1_10.put("755", 0x514);
		PG1_10.put("756", 0x91E);
		// for M(21)
		PG1_10.put("757", 0x71F);
		PG1_10.put("758", 0x1B08);
		PG1_10.put("759", 0xB1F);
		PG1_10.put("760", 0x415);
		PG1_10.put("761", 0x141B);
		PG1_10.put("762", 0x443F);
		PG1_10.put("763", 0x41B);
		PG1_10.put("764", 0x1415);
		PG1_10.put("765", 0x81D);
		PG1_10.put("766", 0x71F);
		PG1_10.put("767", 0x1B0B);
		PG1_10.put("768", 0xB1F);
		PG1_10.put("769", 0x41D);
		PG1_10.put("770", 0x141C);
		PG1_10.put("771", 0x443F);
		PG1_10.put("772", 0x61D);
		PG1_10.put("773", 0xA1C);
		PG1_10.put("774", 0x515);
		PG1_10.put("775", 0x91E);
		// for M(22)
		PG1_10.put("776", 0x71F);
		PG1_10.put("777", 0x1B08);
		PG1_10.put("778", 0xB1F);
		PG1_10.put("779", 0x416);
		PG1_10.put("780", 0x141B);
		PG1_10.put("781", 0x443F);
		PG1_10.put("782", 0x41B);
		PG1_10.put("783", 0x1416);
		PG1_10.put("784", 0x81D);
		PG1_10.put("785", 0x71F);
		PG1_10.put("786", 0x1B0B);
		PG1_10.put("787", 0xB1F);
		PG1_10.put("788", 0x41D);
		PG1_10.put("789", 0x141C);
		PG1_10.put("790", 0x443F);
		PG1_10.put("791", 0x61D);
		PG1_10.put("792", 0xA1C);
		PG1_10.put("793", 0x516);
		PG1_10.put("794", 0x91E);
		// for M(23)
		PG1_10.put("795", 0x71F);
		PG1_10.put("796", 0x1B08);
		PG1_10.put("797", 0xB1F);
		PG1_10.put("798", 0x417);
		PG1_10.put("799", 0x141B);
		PG1_10.put("800", 0x443F);
		PG1_10.put("801", 0x41B);
		PG1_10.put("802", 0x1417);
		PG1_10.put("803", 0x81D);
		PG1_10.put("804", 0x71F);
		PG1_10.put("805", 0x1B0B);
		PG1_10.put("806", 0xB1F);
		PG1_10.put("807", 0x41D);
		PG1_10.put("808", 0x141C);
		PG1_10.put("809", 0x443F);
		PG1_10.put("810", 0x61D);
		PG1_10.put("811", 0xA1C);
		PG1_10.put("812", 0x517);
		PG1_10.put("813", 0x91E);
		// for M(24)
		PG1_10.put("814", 0x71F);
		PG1_10.put("815", 0x1B08);
		PG1_10.put("816", 0xB1F);
		PG1_10.put("817", 0x418);
		PG1_10.put("818", 0x141B);
		PG1_10.put("819", 0x443F);
		PG1_10.put("820", 0x41B);
		PG1_10.put("821", 0x1418);
		PG1_10.put("822", 0x81D);
		PG1_10.put("823", 0x71F);
		PG1_10.put("824", 0x1B0B);
		PG1_10.put("825", 0xB1F);
		PG1_10.put("826", 0x41D);
		PG1_10.put("827", 0x141C);
		PG1_10.put("828", 0x443F);
		PG1_10.put("829", 0x61D);
		PG1_10.put("830", 0xA1C);
		PG1_10.put("831", 0x518);
		PG1_10.put("832", 0x91E);
		// for M(25)
		PG1_10.put("833", 0x71F);
		PG1_10.put("834", 0x1B08);
		PG1_10.put("835", 0xB1F);
		PG1_10.put("836", 0x419);
		PG1_10.put("837", 0x141B);
		PG1_10.put("838", 0x443F);
		PG1_10.put("839", 0x41B);
		PG1_10.put("840", 0x1419);
		PG1_10.put("841", 0x81D);
		PG1_10.put("842", 0x71F);
		PG1_10.put("843", 0x1B0B);
		PG1_10.put("844", 0xB1F);
		PG1_10.put("845", 0x41D);
		PG1_10.put("846", 0x141C);
		PG1_10.put("847", 0x443F);
		PG1_10.put("848", 0x61D);
		PG1_10.put("849", 0xA1C);
		PG1_10.put("850", 0x519);
		PG1_10.put("851", 0x91E);
		// for M(26)
		PG1_10.put("852", 0x71F);
		PG1_10.put("853", 0x1B08);
		PG1_10.put("854", 0xB1F);
		PG1_10.put("855", 0x41A);
		PG1_10.put("856", 0x141B);
		PG1_10.put("857", 0x443F);
		PG1_10.put("858", 0x41B);
		PG1_10.put("859", 0x141A);
		PG1_10.put("860", 0x81D);
		PG1_10.put("861", 0x71F);
		PG1_10.put("862", 0x1B0B);
		PG1_10.put("863", 0xB1F);
		PG1_10.put("864", 0x41D);
		PG1_10.put("865", 0x141C);
		PG1_10.put("866", 0x443F);
		PG1_10.put("867", 0x61D);
		PG1_10.put("868", 0xA1C);
		PG1_10.put("869", 0x51A);
		PG1_10.put("870", 0x91E);
		PG1_10.put("871", 0x71F);

		// print the result in m(30)

	}

	public static final HashMap<String, Integer> PG_P = new HashMap<>(); // print
																			// the
																			// result
																			// in
																			// m(30)
	static {
		// presets of this single program
		PG_P.put("31", 1809); // start of the block (0)
		// m(30) store the number that you want to print
		PG_P.put("6", 50); // store every digit of the numbers starting from
							// m(50), example: for number 31 we store like this,
							// m(50)=10 (new line sign), m(51)=49 (ascii of
							// '1'), m(52)=51 (ascii of '3')

		// program begins

		PG_P.put("1800", 0x7d8f); // reset r1
		PG_P.put("1801", 0x190a); // AIR r1, 10
		PG_P.put("1802", 0x926); // store r1 into location of content of m(6)
		PG_P.put("1803", 0xf26); // load r3 with content of m(6)
		PG_P.put("1804", 0x1b01); // AIR r3, 1
		PG_P.put("1805", 0xb06); // store r3 into m(6)
		PG_P.put("1806", 0x7e8f); // reset r2
		PG_P.put("1807", 0x1a0a); // AIR r2, 10
		PG_P.put("1808", 0xc3e); // load r0 with content of m(30)

		// (0)
		PG_P.put("1809", 0x5480); // DVD r0, r2
		PG_P.put("1810", 0xf3f);// load r3 with content of m(31)
		PG_P.put("1811", 0x1b14);// AIR r3, 20
		PG_P.put("1812", 0xb1f);// store r3 into m(31)
		PG_P.put("1813", 0x283f);// JZ r0, content of m(31), means if r0 == 0
									// jump to (1)
		PG_P.put("1814", 0x1918);// r1 + 48, convert to ascii
		PG_P.put("1815", 0x1918);
		PG_P.put("1816", 0x926);// store r1 into location of content of m(6)
		PG_P.put("1817", 0xf26);// load r3 with content of m(6)
		PG_P.put("1818", 0x1b01);// AIR r3, 1
		PG_P.put("1819", 0xb06);// store r3 into m(6)
		PG_P.put("1820", 0xf3f);// load r3 with content of m(31)
		PG_P.put("1821", 0x1f14);// SIR r3, 20
		PG_P.put("1822", 0xb1f);// store r3 into m(31)
		PG_P.put("1823", 0x343f);// JMA, content of m(31), means jump to (0)

		// (1) r0 == 0, means has reach the highest digit of the number
		PG_P.put("1829", 0x1918);// r1 + 48, convert to ascii
		PG_P.put("1830", 0x1918);
		PG_P.put("1831", 0x926);// store r1 into location of content of m(6)
		PG_P.put("1832", 0xf3f);// load r3 with content of m(31)
		PG_P.put("1833", 0x1b14);// AIR r3, 20
		PG_P.put("1834", 0xb1f);// store r3 into m(31)
		PG_P.put("1835", 0x7e8f);// reset r2
		PG_P.put("1836", 0x1a0a);// AIR r2, 10 (new line sign, use to compare)
		PG_P.put("1837", 0x343f);// JMA, content of m(31), means jump to (2)

		// (2) print the digit one by one
		PG_P.put("1849", 0x526);// load r1 with address of content of m(6)
		PG_P.put("1850", 0xf901);// print r1 to console
		PG_P.put("1851", 0xf3f);// load r3 with content of m(31)
		PG_P.put("1852", 0x1b14);// AIR r3, 20
		PG_P.put("1853", 0xb1f);// store r3 into m(31)
		PG_P.put("1854", 0x5980);// TRR r1, r2
		PG_P.put("1855", 0x333f);// JCC cc(3), content of m(31), mean jump to
									// (3)
		PG_P.put("1856", 0xf26);// load r3 with content of m(6)
		PG_P.put("1857", 0x1f01);// SIR r3, 1
		PG_P.put("1858", 0xb06);// store r3 into m(6)
		PG_P.put("1859", 0xf3f);// load r3 with content of m(31)
		PG_P.put("1860", 0x1f14);// SIR r3, 20
		PG_P.put("1861", 0xb1f);// store r3 into m(31)
		PG_P.put("1862", 0x343f);// JMA, content of m(31), means jump to (2)

		// (3) finish printing the numbers
		PG_P.put("1869", 0);
	}
	public static final HashMap<String, Integer> PG_P2 = new HashMap<>(); // print
	// the
	// result
	// in
	// m(30)
	static {
		// presets of this single program
		PG_P2.put("31", 1109); // start of the block (0)
		// m(30) store the number that you want to print
		PG_P2.put("6", 50); // store every digit of the numbers starting from
		// m(50), example: for number 31 we store like this,
		// m(50)=10 (new line sign), m(51)=49 (ascii of '1'), m(52)=51 (ascii of
		// '3')

		// program begins

		PG_P2.put("1100", 0x7d8f); // reset r1
		PG_P2.put("1101", 0x190a); // AIR r1, 10
		PG_P2.put("1102", 0x926); // store r1 into location of content of m(6)
		PG_P2.put("1103", 0xf26); // load r3 with content of m(6)
		PG_P2.put("1104", 0x1b01); // AIR r3, 1
		PG_P2.put("1105", 0xb06); // store r3 into m(6)
		PG_P2.put("1106", 0x7e8f); // reset r2
		PG_P2.put("1107", 0x1a0a); // AIR r2, 10
		PG_P2.put("1108", 0xc3d); // load r0 with content of m(29)

		// (0)
		PG_P2.put("1109", 0x5480); // DVD r0, r2
		PG_P2.put("1110", 0xf3f);// load r3 with content of m(31)
		PG_P2.put("1111", 0x1b14);// AIR r3, 20
		PG_P2.put("1112", 0xb1f);// store r3 into m(31)
		PG_P2.put("1113", 0x283f);// JZ r0, content of m(31), means if r0 == 0
									// jump to (1)
		PG_P2.put("1114", 0x1918);// r1 + 48, convert to ascii
		PG_P2.put("1115", 0x1918);
		PG_P2.put("1116", 0x926);// store r1 into location of content of m(6)
		PG_P2.put("1117", 0xf26);// load r3 with content of m(6)
		PG_P2.put("1118", 0x1b01);// AIR r3, 1
		PG_P2.put("1119", 0xb06);// store r3 into m(6)
		PG_P2.put("1120", 0xf3f);// load r3 with content of m(31)
		PG_P2.put("1121", 0x1f14);// SIR r3, 20
		PG_P2.put("1122", 0xb1f);// store r3 into m(31)
		PG_P2.put("1123", 0x343f);// JMA, content of m(31), means jump to (0)
		// (1) r0 == 0, means has reach the highest digit of the number
		PG_P2.put("1129", 0x1918);// r1 + 48, convert to ascii
		PG_P2.put("1130", 0x1918);
		PG_P2.put("1131", 0x926);// store r1 into location of content of m(6)
		PG_P2.put("1132", 0xf3f);// load r3 with content of m(31)
		PG_P2.put("1133", 0x1b14);// AIR r3, 20
		PG_P2.put("1134", 0xb1f);// store r3 into m(31)
		PG_P2.put("1135", 0x7e8f);// reset r2
		PG_P2.put("1136", 0x1a0a);// AIR r2, 10 (new line sign, use to compare)
		PG_P2.put("1137", 0x343f);// JMA, content of m(31), means jump to (2)
		// (2) print the digit one by one
		PG_P2.put("1149", 0x526);// load r1 with address of content of m(6)
		PG_P2.put("1150", 0xf901);// print r1 to console
		PG_P2.put("1151", 0xf3f);// load r3 with content of m(31)
		PG_P2.put("1152", 0x1b14);// AIR r3, 20
		PG_P2.put("1153", 0xb1f);// store r3 into m(31)
		PG_P2.put("1154", 0x5980);// TRR r1, r2
		PG_P2.put("1155", 0x333f);// JCC cc(3), content of m(31), mean jump to
									// (3)
		PG_P2.put("1156", 0xf26);// load r3 with content of m(6)
		PG_P2.put("1157", 0x1f01);// SIR r3, 1
		PG_P2.put("1158", 0xb06);// store r3 into m(6)
		PG_P2.put("1159", 0xf3f);// load r3 with content of m(31)
		PG_P2.put("1160", 0x1f14);// SIR r3, 20
		PG_P2.put("1161", 0xb1f);// store r3 into m(31)
		PG_P2.put("1162", 0x343f);// JMA, content of m(31), means jump to (2)

		// (3) finish printing the numbers
		PG_P2.put("1169", 0);
	}
	public static final HashMap<String, Integer> PG_P1 = new HashMap<>(); // print
	// the
	// result
	// in
	// m(30)
	static {
		// presets of this single program
		PG_P1.put("31", 1009); // start of the block (0)
		// m(30) store the number that you want to print
		PG_P1.put("6", 50); // store every digit of the numbers starting from
		// m(50), example: for number 31 we store like this,
		// m(50)=10 (new line sign), m(51)=49 (ascii of '1'), m(52)=51 (ascii of
		// '3')

		// program begins

		PG_P1.put("1000", 0x7d8f); // reset r1
		PG_P1.put("1001", 0x190a); // AIR r1, 10
		PG_P1.put("1002", 0x926); // store r1 into location of content of m(6)
		PG_P1.put("1003", 0xf26); // load r3 with content of m(6)
		PG_P1.put("1004", 0x1b01); // AIR r3, 1
		PG_P1.put("1005", 0xb06); // store r3 into m(6)
		PG_P1.put("1006", 0x7e8f); // reset r2
		PG_P1.put("1007", 0x1a0a); // AIR r2, 10
		PG_P1.put("1008", 0xc3c); // load r0 with content of m(28)

		// (0)
		PG_P1.put("1009", 0x5480); // DVD r0, r2
		PG_P1.put("1010", 0xf3f);// load r3 with content of m(31)
		PG_P1.put("1011", 0x1b14);// AIR r3, 20
		PG_P1.put("1012", 0xb1f);// store r3 into m(31)
		PG_P1.put("1013", 0x283f);// JZ r0, content of m(31), means if r0 == 0
									// jump to (1)
		PG_P1.put("1014", 0x1918);// r1 + 48, convert to ascii
		PG_P1.put("1015", 0x1918);
		PG_P1.put("1016", 0x926);// store r1 into location of content of m(6)
		PG_P1.put("1017", 0xf26);// load r3 with content of m(6)
		PG_P1.put("1018", 0x1b01);// AIR r3, 1
		PG_P1.put("1019", 0xb06);// store r3 into m(6)
		PG_P1.put("1020", 0xf3f);// load r3 with content of m(31)
		PG_P1.put("1021", 0x1f14);// SIR r3, 20
		PG_P1.put("1022", 0xb1f);// store r3 into m(31)
		PG_P1.put("1023", 0x343f);// JMA, content of m(31), means jump to (0)

		// (1) r0 == 0, means has reach the highest digit of the number
		PG_P1.put("1029", 0x1918);// r1 + 48, convert to ascii
		PG_P1.put("1030", 0x1918);
		PG_P1.put("1031", 0x926);// store r1 into location of content of m(6)
		PG_P1.put("1032", 0xf3f);// load r3 with content of m(31)
		PG_P1.put("1033", 0x1b14);// AIR r3, 20
		PG_P1.put("1034", 0xb1f);// store r3 into m(31)
		PG_P1.put("1035", 0x7e8f);// reset r2
		PG_P1.put("1036", 0x1a0a);// AIR r2, 10 (new line sign, use to compare)
		PG_P1.put("1037", 0x343f);// JMA, content of m(31), means jump to (2)

		// (2) print the digit one by one
		PG_P1.put("1049", 0x526);// load r1 with address of content of m(6)
		PG_P1.put("1050", 0xf901);// print r1 to console
		PG_P1.put("1051", 0xf3f);// load r3 with content of m(31)
		PG_P1.put("1052", 0x1b14);// AIR r3, 20
		PG_P1.put("1053", 0xb1f);// store r3 into m(31)
		PG_P1.put("1054", 0x5980);// TRR r1, r2
		PG_P1.put("1055", 0x333f);// JCC cc(3), content of m(31), mean jump to
									// (3)
		PG_P1.put("1056", 0xf26);// load r3 with content of m(6)
		PG_P1.put("1057", 0x1f01);// SIR r3, 1
		PG_P1.put("1058", 0xb06);// store r3 into m(6)
		PG_P1.put("1059", 0xf3f);// load r3 with content of m(31)
		PG_P1.put("1060", 0x1f14);// SIR r3, 20
		PG_P1.put("1061", 0xb1f);// store r3 into m(31)
		PG_P1.put("1062", 0x343f);// JMA, content of m(31), means jump to (2)

		// (3) finish printing the numbers
		PG_P1.put("1069", 0);
	}
	public static final HashMap<String, Integer> Pre = new HashMap<>();
	static {
		Pre.put("6", 44); // ascii of ','
		// 7 ~ 26 store the 20 numbers
		// 27 store the 1 number
		Pre.put("28", 302); // start of block (0)
		Pre.put("29", 7); // the first address of the numbers
		Pre.put("30", 20); // the numbers of words need to read in program 1
		Pre.put("31", 505);
	}

	public static final HashMap<String, Integer> PG1_20 = new HashMap<>();
	static {
		PG1_20.put("300", 0x7c8f); // SRC Reset r0 = 0
		PG1_20.put("301", 0xf3e); // LDA r3 with content of memory address 30
		// (0)
		PG1_20.put("302", 0xe26); // LDA r2 with content of memory address 6
		PG1_20.put("303", 0xf500); // IN r1
		PG1_20.put("304", 0x5980); // TRR r1, r2
		PG1_20.put("305", 0xe3c); // LDA r2 with c(memory 28)
		PG1_20.put("306", 0x1a14); // AIR r2, 20
		PG1_20.put("307", 0xa1c); // Store r2 into location memory 28
		PG1_20.put("308", 0x333c);// JCC cc=3 to c(memory 28) means jump to (1)
		PG1_20.put("309", 0xe3c);// Load r2 with c(memory 28)
		PG1_20.put("310", 0x1a14);// AIR r2, 20
		PG1_20.put("311", 0xa1c);// Store r2 into location memory 28
		PG1_20.put("312", 0x343c);// JMA to c(memory 28) means jump to (2)
		// (1) it is a ','
		PG1_20.put("322", 0x83d);// Store r0 into memory with a location of
									// c(memory 29)
		PG1_20.put("323", 0x7c8f);// reset r0
		PG1_20.put("324", 0x180a);// AIR r0, 10
		PG1_20.put("325", 0xf801);// print r0 to console
		PG1_20.put("326", 0xd3d);// Load r1 with content of memory address 29
		PG1_20.put("327", 0x1901);// AIR r1 with 1
		PG1_20.put("328", 0x91d);// Store r1 into memory address 29
		PG1_20.put("329", 0x7c8f);// Reset r0
		PG1_20.put("330", 0xe3c);// Load r2 with c(memory 28)
		PG1_20.put("331", 0x1a14);// AIR r2, 20
		PG1_20.put("332", 0x1a14);// AIR r2, 20
		PG1_20.put("333", 0xa1c);// Store r2 into location memory 28
		PG1_20.put("334", 0x343c);// JMA to c(memory 28) means jump to (3)
		// (2) it is a digit
		PG1_20.put("342", 0x83D);// STR r0 into memory with a location of
									// c(memory 29)
		PG1_20.put("343", 0x103D);// AMR r0, c(memory 29)
		PG1_20.put("344", 0x103D);// AMR r0, c(memory 29)
		PG1_20.put("345", 0x103D);// AMR r0, c(memory 29)
		PG1_20.put("346", 0x103D);// AMR r0, c(memory 29)
		PG1_20.put("347", 0x103D);// AMR r0, c(memory 29)
		PG1_20.put("348", 0x103D);// AMR r0, c(memory 29)
		PG1_20.put("349", 0x103D);// AMR r0, c(memory 29)
		PG1_20.put("350", 0x103D);// AMR r0, c(memory 29)
		PG1_20.put("351", 0x103D);// AMR r0, c(memory 29)
		PG1_20.put("352", 0xf901);// print r1 to console
		PG1_20.put("353", 0x1d18);// r1 should subtract 48 to get a digit
		PG1_20.put("354", 0x1d18);
		PG1_20.put("355", 0x93D);// Store r1 into memory with a location of
									// c(memory 29)
		PG1_20.put("356", 0x103D);// AMR r0, c(memory 29)
		PG1_20.put("357", 0xE3C);// LDA r2 with c(memory 28)
		PG1_20.put("358", 0x1E14);// SIR r2, 20
		PG1_20.put("359", 0x1E14);// SIR r2, 20
		PG1_20.put("360", 0xA1C);// Store r2 into location memory 28
		PG1_20.put("361", 0x343C);// JMA to c(memory 28) means jump to (3)
		// (3)
		PG1_20.put("362", 0xE3C);// Load r2 with c(memory 28)
		PG1_20.put("363", 0x1E14);// SIR r2, 20
		PG1_20.put("364", 0x1E14);// SIR r2, 20
		PG1_20.put("365", 0x1E14);// SIR r2, 20
		PG1_20.put("366", 0xA1C);// Store r2 into location memory 28
		PG1_20.put("367", 0x433C);// SOB r3, c(memory 28)
		PG1_20.put("368", 0x7c8f);// reset r0
		PG1_20.put("369", 0x1801);// AIR r0, 1
		PG1_20.put("370", 0x81e);// store r0 to m(30)
	}

	public static final HashMap<String, Integer> PRE_PROG2 = new HashMap<>();
	static {
		PRE_PROG2.put("31", 0); // length of the sentence
		PRE_PROG2.put("30", 0); // length of the word
		PRE_PROG2.put("29", 1); // current sentence
		PRE_PROG2.put("28", 1); // current word of sentence
		PRE_PROG2.put("27", 32); // ascii of space
		PRE_PROG2.put("26", 0); // ascii of 0
		PRE_PROG2.put("25", 46); // ascii of period
		PRE_PROG2.put("24", 0); // r1
		PRE_PROG2.put("22", -1); // i
		PRE_PROG2.put("21", 0); // j
		PRE_PROG2.put("20", 99); // m(100) start of sentences
		PRE_PROG2.put("19", 79); // m(80) start of word or 80
		PRE_PROG2.put("18", 1601); // start of (0) in PROG2_0
		PRE_PROG2.put("17", 1701); // start of (0) in PROG2_1
		PRE_PROG2.put("16", 80); // clear location to 80
		PRE_PROG2.put("15", 904); // the first JMA
		PRE_PROG2.put("14", 989); // END of the program
		PRE_PROG2.put("13", 951); // the second JMA
		PRE_PROG2.put("12", 961); // the third JMA
		PRE_PROG2.put("11", 937); // the forth JMA
		PRE_PROG2.put("10", 969); // the fifth JMA
		PRE_PROG2.put("9", 979); // the sixth JMA
		PRE_PROG2.put("8", 902); // the third JMA to for
		PRE_PROG2.put("7", 80);
	}

	public static final HashMap<String, Integer> PROG2_0 = new HashMap<>(); // read
																			// the
																			// sentences
	static {
		PROG2_0.put("1600", 0xf34); // Load r3 with content of m(20)
		// (0)
		PROG2_0.put("1601", 0xf502); // IN r1, 2
		PROG2_0.put("1602", 0xe32); // Load r2 with content of m(18)
		PROG2_0.put("1603", 0x1a14); // AIR r2, 20
		PROG2_0.put("1604", 0xa12); // Store r2 into m(18)
		PROG2_0.put("1605", 0x2932); // JZ r1, content of m(18), means jump to
										// (1) if r1 == 0
		PROG2_0.put("1606", 0xf901); // OUT r1, 1
		PROG2_0.put("1607", 0xc3f); // Load r0 with content of m(31)
		PROG2_0.put("1608", 0x1801); // AIR r0, 1
		PROG2_0.put("1609", 0x81f); // Store r0 into m(31)
		PROG2_0.put("1610", 0xc34); // Load r0 with content of m(20)
		PROG2_0.put("1611", 0x1801); // AIR r0, 1
		PROG2_0.put("1612", 0x814); // Store r0 into m(20)
		PROG2_0.put("1613", 0x934); // Store r1 into content of m(20)
		PROG2_0.put("1614", 0xe32); // Load r2 with content of m(18)
		PROG2_0.put("1615", 0x1E14); // SIR r2, 20
		PROG2_0.put("1616", 0xa12); // Store r2 into m(18)
		PROG2_0.put("1617", 0x3432); // JMA content of m(18), means jump to (0)

		// (1) if r1 == 0
		PROG2_0.put("1621", 0x7d8f); // SRC reset r1 to 0
		PROG2_0.put("1622", 0x190a); // AIR r1, 10
		PROG2_0.put("1623", 0xf901); // OUT r1, 1
		PROG2_0.put("1624", 0xb14); // Store r3 into m(20)
	}

	public static final HashMap<String, Integer> PROG2_1 = new HashMap<>(); // read
																			// the
																			// word
	static {
		PROG2_0.put("1700", 0xf33); // Load r3 with content of m(19)
		// (0)
		PROG2_0.put("1701", 0xf500); // IN r1, 0
		PROG2_0.put("1702", 0xe31); // Load r2 with content of m(17)
		PROG2_0.put("1703", 0x1a14); // AIR r2, 20
		PROG2_0.put("1704", 0xa11); // Store r2 into m(17)
		PROG2_0.put("1705", 0x2931); // JZ r1, content of m(17), means jump to
										// (1) if r1 == 0
		PROG2_0.put("1706", 0xf901); // OUT r1, 1
		PROG2_0.put("1707", 0xc3e); // Load r0 with content of m(30)
		PROG2_0.put("1708", 0x1801); // AIR r0, 1
		PROG2_0.put("1709", 0x81e); // Store r0 into m(30)
		PROG2_0.put("1710", 0xc33); // Load r0 with content of m(19)
		PROG2_0.put("1711", 0x1801); // AIR r0, 1
		PROG2_0.put("1712", 0x813); // Store r0 into m(19)
		PROG2_0.put("1713", 0x933); // Store r1 into content of m(19)
		PROG2_0.put("1714", 0xe31); // Load r2 with content of m(17)
		PROG2_0.put("1715", 0x1E14); // SIR r2, 20
		PROG2_0.put("1716", 0xa11); // Store r2 into m(17)
		PROG2_0.put("1717", 0x3431); // JMA content of m(17), means jump to (0)

		// (1) if r1 == 0
		PROG2_0.put("1721", 0x7d8f); // SRC reset r1 to 0
		PROG2_0.put("1722", 0x190a); // AIR r1, 10
		PROG2_0.put("1723", 0xf901); // OUT r1, 1
		PROG2_0.put("1724", 0xb13); // Store r3 into m(19)
	}
	public static final HashMap<String, Integer> PROG2_2 = new HashMap<>(); // find
																			// the
																			// word
	static {
		PROG2_2.put("900", 0x61F);// LDR r3 from M(31)
		PROG2_2.put("901", 0x1A01);// AIR r3+1
		PROG2_2.put("902", 0x422F); // SOB r3 *
		PROG2_2.put("903", 0x342E); // JMA to the final STOP
		PROG2_2.put("904", 0x416); // LDR r0 from M(22) !
		PROG2_2.put("905", 0x1801);// AIR r0+1
		PROG2_2.put("906", 0x816); // STR r0 to M (22)
		PROG2_2.put("907", 0x414); // LDR M (20) =99
		PROG2_2.put("908", 0x1801); // AIR r0+1
		PROG2_2.put("909", 0x814); // STR r0 to M(20)
		PROG2_2.put("910", 0x534); // LDR r1 form M(100) indirect
		PROG2_2.put("911", 0x419); // LDR r0 from M(25)= 46
		PROG2_2.put("912", 0x5840); // TRR r1 and r0
		PROG2_2.put("913", 0x332D); // JCC cc3 if 1 if not 0 continue
		PROG2_2.put("914", 0x41B); // LDR r0 from M(27)= 32
		PROG2_2.put("915", 0x5840); // TRR r1 and r0
		PROG2_2.put("916", 0x332C); // JCC cc3 if 1 if not 0 continue
		PROG2_2.put("917", 0x627); // LDR r2 from M(7)=80 first capital from wor
		PROG2_2.put("918", 0x5980); // TRR r1 and r2
		PROG2_2.put("919", 0x332B); // JCC cc3 if 1 if not 0 continue
		PROG2_2.put("920", 0x416); // LDR r0 from M(22)
		PROG2_2.put("921", 0x1415); // SMR r0 –M(21)
		PROG2_2.put("922", 0x816); // STR r0 to M(22)
		PROG2_2.put("923", 0x414); // LDR r0 from M(20)
		PROG2_2.put("924", 0x1415); // SMR r0 –M(21)
		PROG2_2.put("925", 0x814); // STR r0 to M(20) i= i-j
		PROG2_2.put("926", 0x419); // LDR r0 from M(25)
		PROG2_2.put("927", 0x5840); // TRR r1 and r0
		PROG2_2.put("928", 0x332A); // JCC cc3 if 1 if not 0 continue
		PROG2_2.put("929", 0x41B); // LDR r0 from M(27)
		PROG2_2.put("930", 0x5840); // TRR r1 and r0
		PROG2_2.put("931", 0x3329); // JCC cc3 if 1 if not 0 continue
		PROG2_2.put("932", 0x041A); // LDR r0 from M(26)=0
		PROG2_2.put("933", 0x815); // STR r0 to M (21)
		PROG2_2.put("934", 0x410); // LDR r0 from M(16)=81
		PROG2_2.put("935", 0x807); // STR r0 to M (7)
		PROG2_2.put("936", 0x3428); // JMA EA8 =* 902
		PROG2_2.put("937", 0x415); // LDR r0 from M(21) j %
		PROG2_2.put("938", 0x918); // STR r1 to M(24) r1
		PROG2_2.put("939", 0x51E); // LDR r1 from M(30)
		PROG2_2.put("940", 0x1D01); // SIR r1-1
		PROG2_2.put("941", 0x5840); // TRR r1 and r0
		PROG2_2.put("942", 0x518); // LDR r1 from M(24)
		PROG2_2.put("943", 0x332E); // JCC cc3 if 1 if not 0 continue
		PROG2_2.put("944", 0x415); // LDR r0 from M(21) j
		PROG2_2.put("945", 0x1801); // AIR r0+1
		PROG2_2.put("946", 0x815); // STR r0 to M(21)
		PROG2_2.put("947", 0x407); // LDR r0 from M(7)
		PROG2_2.put("948", 0x1801); // AIR r0+1
		PROG2_2.put("949", 0x807); // STR r0 to M(7) c
		PROG2_2.put("950", 0x3428); // // JMA to for
		PROG2_2.put("951", 0x41D); // LDR r0 from M(29) cs #
		PROG2_2.put("952", 0x1801); // AIR r0+1
		PROG2_2.put("953", 0x81D); // STR r0 to M(29)
		PROG2_2.put("954", 0x41A); // LDR r0 from M(26)=0
		PROG2_2.put("955", 0x81C); // STR r0 to M(28)
		PROG2_2.put("956", 0x40D); // LDR r0 from M(13) 951
		PROG2_2.put("957", 0x1C1F); // SIR 951-31=920
		PROG2_2.put("958", 0x1C06); // SIR 920-6=914
		PROG2_2.put("959", 0x806); // STR r0 to M(6)
		PROG2_2.put("960", 0x3426); // JMA to 14
		PROG2_2.put("961", 0x41C); // LDR r0 from M(28) cw $
		PROG2_2.put("962", 0x1801); // AIR r0+1
		PROG2_2.put("963", 0x81C); // STR r0 to M(28)
		PROG2_2.put("964", 0x40D); // LDR r0 from M(12) 961
		PROG2_2.put("965", 0x1C1F); // SIR 961-31=930
		PROG2_2.put("966", 0x1C0D); // SIR 930-13=917
		PROG2_2.put("967", 0x806); // STR r0 to M(6)
		PROG2_2.put("968", 0x3426); // JMA to 17
		PROG2_2.put("969", 0x40A); // LDR r0 from M(10) 969 ^
		PROG2_2.put("970", 0x1C1F); // SIR 969-31=938
		PROG2_2.put("971", 0x1C09); // SIR 938-9=929
		PROG2_2.put("972", 0x806); // STR r0 to M(6)
		PROG2_2.put("973", 0x415); // LDR r0 from M(21)
		PROG2_2.put("974", 0x2826); // JZ j if 0
		PROG2_2.put("975", 0x41D); // LDR r0 from M(29) cs
		PROG2_2.put("976", 0x1C01); // SIR -1 cs-1
		PROG2_2.put("977", 0x81D); // STR r0 to M(29)
		PROG2_2.put("978", 0x3426); // JMA to 29
		PROG2_2.put("979", 0x409); // LDR r0 from M(9) 979 ^
		PROG2_2.put("980", 0x1C1F); // SIR 979-31=948
		PROG2_2.put("981", 0x1C10); // SIR 948-16=932
		PROG2_2.put("982", 0x806); // STR r0 to M(6)
		PROG2_2.put("983", 0x415); // LDR r0 from M(21) j
		PROG2_2.put("984", 0x2826); // JZ j if 0
		PROG2_2.put("985", 0x41C); // LDR r0 from M(28) cws
		PROG2_2.put("986", 0x1C01); // SIR -1 cs-1
		PROG2_2.put("987", 0x81C); // STR r0 to M(28)
		PROG2_2.put("988", 0x3426); // JMA to 32
		PROG2_2.put("989", 0x41D); // out LDR r0 from M(29)

	}
	public static final HashMap<String, Integer> Pre3 = new HashMap<>();
	static {
		//Pre3.put("100", 3);
		//Pre3.put("101", 4);
		//Pre3.put("102", 5);
		Pre3.put("200", 80);
		Pre3.put("201", 100);
		Pre3.put("202", 120);
		Pre3.put("28", 200);
		Pre3.put("27", 100);
		Pre3.put("26", 101);
		Pre3.put("25", 102);
		Pre3.put("31", 10100000);
		Pre3.put("30", 11);;
		Pre3.put("29", 10);
		Pre3.put("24", 1);
		Pre3.put("23", 0);
		Pre3.put("22", 3);
	}

	public static final HashMap<String, Integer> PG_3 = new HashMap<>(); // example
	
static {

	PG_3.put("1200", 0x8D3B);
	PG_3.put("1201", 0x881D);
	PG_3.put("1202", 0xC81E);
	PG_3.put("1203", 0x841D);
	PG_3.put("1204", 0xCC1E);
	PG_3.put("1205", 0x418);
	PG_3.put("1206", 0x941E);
	PG_3.put("1207", 0x417);
	PG_3.put("1208", 0x9416);

}
	/**
	 * table and routine for TRAP instruction
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
		ILL_MEM_RSV(0, "Illegal Memory Address to Reserved Locations"), ILL_TRPC(1, "Illegal TRAP code"), ILL_OPRC(2,
				"Illegal Operation Code"), ILL_MEM_BYD(3, "Illegal Memory Address beyond 2048 (memory installed)");
		int value;
		String messsage;

		private FaultCode(int value, String message) {
			this.value = value;
			this.messsage = message;
		}

		public int getValue() {
			return this.value;
		}

		public String getMessage() {
			return this.messsage;
		}
	}

	public enum DevId {
		KEYBOARD(0), PRINTER(1), CARD(2);
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
		OPCODE.put("111111", "CHK");
		OPCODE.put("100001", "FADD");
		OPCODE.put("100010", "FSUB");
		OPCODE.put("100011", "VADD");
		OPCODE.put("100100", "VSUB");
		OPCODE.put("100101", "CNVRT");
		OPCODE.put("110010", "LDFR");
		OPCODE.put("110011", "STFR");
	}

}
