package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.Const;
import util.MachineFaultException;
import util.StringUtil;

public class SIR extends AbstractInstruction {

    int r;
    int immed;

    @Override
    public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
        // ------------------------------------------------------
        // 007: SIR -> Subtract Immediate from Register, r = 0..3
        // r <- c(r) - immed
        // Note:
        // 1. if immed = 0, does nothing
        // 2. if c(r) = 0, loads r1 with -(immed)
        // IX and I are ignored in this instruction
        // ------------------------------------------------------

        r = StringUtil.binaryToDecimal(instruction.substring(6, 8));

        // this is the immediate operand
        immed = StringUtil.binaryToDecimal(instruction.substring(11, 16));

        // if immed = 0, we do nothing
        if (immed != 0) {
            // if c(r) = 0, we load r1 with -(immed)
            if (registers.getRnByNum(r) == 0) {
                registers.setR1(-immed);
            } else {

                // r <- c(r) - immed

                double result = registers.getRnByNum(r) - immed;

                // we check if we have an overflow
                if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) { // TODO
                                                                                // not
                                                                                // sure
                    registers.setCCElementByBit(Const.ConditionCode.OVERFLOW.getValue(), true);
                } else {
                    // updating the value of register if there is no overflow
                    registers.setRnByNum(r, (int) result);
                }
            }
        }

        registers.increasePCByOne();

    }

    @Override
    public String getExecuteMessage() {
        return "SIR " + r + ", " + immed;
    }

}
