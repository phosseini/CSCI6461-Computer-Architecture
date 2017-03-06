package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.EffectiveAddress;
import util.MachineFaultException;
import util.StringUtil;

public class SOB extends AbstractInstruction {

    int r;
    int ix;
    int address;
    int i;

    @Override
    public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
        // -----------------------------------
        // 016: SOB -> Subtract One and Branch
        // -----------------------------------
        r = StringUtil.binaryToDecimal(instruction.substring(6, 8));
        ix = StringUtil.binaryToDecimal(instruction.substring(8, 10));
        i = StringUtil.binaryToDecimal(instruction.substring(10, 11));
        address = StringUtil.binaryToDecimal(instruction.substring(11, 16));

        registers.setRnByNum(r, registers.getRnByNum(r) - 1);
        if (registers.getRnByNum(r) > 0) {
            registers.setPC(EffectiveAddress.calculateEA(ix, address, i, mcu, registers));
        } else {
            registers.increasePCByOne();
        }
    }

    @Override
    public String getExecuteMessage() {
        // TODO Auto-generated method stub
        return "SOB " + r + ", " + ix + ", " + address + ", " + i;
    }

}