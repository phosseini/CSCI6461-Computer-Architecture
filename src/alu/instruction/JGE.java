package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.EffectiveAddress;
import util.MachineFaultException;
import util.StringUtil;

public class JGE extends AbstractInstruction {

    int r;
    int ix;
    int address;
    int i;

    @Override
    public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
        // -----------------------------------
        // 017: JGE -> Jump Greater Than or Equal To
        // -----------------------------------
        r = StringUtil.binaryToDecimal(instruction.substring(6, 8));
        ix = StringUtil.binaryToDecimal(instruction.substring(8, 10));
        i = StringUtil.binaryToDecimal(instruction.substring(10, 11));
        address = StringUtil.binaryToDecimal(instruction.substring(11, 16));

        if (registers.getRnByNum(r) >= 0) {
            registers.setPC(EffectiveAddress.calculateEA(ix, address, i, mcu, registers));
        } else {
            registers.increasePCByOne();
        }

        // System.out.println("this is a JGE instruction!");
    }

    @Override
    public String getExecuteMessage() {
        // TODO Auto-generated method stub
        return "JGE " + r + ", " + ix + ", " + address + ", " + i;
    }

}