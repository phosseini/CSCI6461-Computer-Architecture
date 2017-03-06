package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.Const;
import util.EffectiveAddress;
import util.MachineFaultException;
import util.StringUtil;

public class SMR extends AbstractInstruction {

    int r;
    int ix;
    int address;
    int i;

    @Override
    public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
        // -----------------------------------
        // 005: SMR -> Subtract Memory From Register
        // r <- c(r) - c(EA)
        // -----------------------------------
        r = StringUtil.binaryToDecimal(instruction.substring(6, 8));
        ix = StringUtil.binaryToDecimal(instruction.substring(8, 10));
        i = StringUtil.binaryToDecimal(instruction.substring(10, 11));
        address = StringUtil.binaryToDecimal(instruction.substring(11, 16));

        // first, we store the effective address in memory address register
        registers.setMAR(EffectiveAddress.calculateEA(ix, address, i, mcu, registers));

        // storing what we fetched from memory into the memory buffer register
        registers.setMBR(mcu.fetchFromCache(registers.getMAR()));

        double result = registers.getRnByNum(r) - registers.getMBR();

        // we check if we have an overflow
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) { // TODO
                                                                        // not
                                                                        // sure
            registers.setCCElementByBit(Const.ConditionCode.OVERFLOW.getValue(), true);
        } else {
            // if we do not have an overflow, we update the value of register
            registers.setRnByNum(r, (int) result);
        }

        registers.increasePCByOne();
    }

    @Override
    public String getExecuteMessage() {
        // TODO Auto-generated method stub
        return "SMR " + r + ", " + ix + ", " + address + ", " + i;
    }

}
