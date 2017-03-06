package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.EffectiveAddress;
import util.MachineFaultException;
import util.StringUtil;

public class LDA extends AbstractInstruction {
    
    int r;
    int ix;
    int address;
    int i;

    @Override
    public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
        // -----------------------------------
        // 03:LDA -> Load Register From Memory
        // -----------------------------------
        r = StringUtil.binaryToDecimal(instruction.substring(6, 8));
        ix = StringUtil.binaryToDecimal(instruction.substring(8, 10));
        i = StringUtil.binaryToDecimal(instruction.substring(10, 11));
        address = StringUtil.binaryToDecimal(instruction.substring(11, 16));

        // reading the content of selected register using [R] in the instruction
        registers.setRnByNum(r, EffectiveAddress.calculateEA(ix, address, i, mcu, registers));

        registers.increasePCByOne();
    }

    @Override
    public String getExecuteMessage() {
        // TODO Auto-generated method stub
        return "LDA " + r + ", " + ix + ", " + address + ", " + i;
    }

}
