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

    public static int calculateEA(int ix, int address, int i, MCU mcu, Registers registers) {
        if (i == 0) {
            // NO indirect addressing
            if (ix == 0) {// NO indexing
                return address;
            } else {
                return address + registers.getXnByNum(ix);
            }

        } else if (i == 1) {
            // indirect addressing
            if (ix == 0) {// NO indexing
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

}