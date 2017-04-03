package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.Const;
import util.MachineFaultException;
import util.StringUtil;

public class AIR extends AbstractInstruction {

    int r;
    int immed;

    @Override
    public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
        // -----------------------------------
        // 006: AIR -> Add Immediate to Register, r = 0..3
        // r <- c(r) + immed
        // Note:
        // 1. if immed = 0, does nothing
        // 2. if c(r) = 0, loads r with immed
        // IX and I are ignored in this instruction
        // -----------------------------------

        r = StringUtil.binaryToDecimal(instruction.substring(6, 8));

        // this is the immediate operand.
        immed = StringUtil.binaryToDecimal(instruction.substring(11, 16));

        // if immed = 0, we do nothing
        if (immed != 0) {
            if (registers.getRnByNum(r) == 0) {

                // if c(r) = 0, we load r with immed
                registers.setRnByNum(r, immed);

            } else {

                // r <- c(r) + immed

                int result = registers.getRnByNum(r) + immed;
                
                // we check if we have an overflow
                if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                    registers.setCCElementByBit(Const.ConditionCode.OVERFLOW.getValue(), true);
                } else {
                    // if we do not have an overflow, we update the value of
                    // register
                    registers.setRnByNum(r, result);
                }
            }
        }

        registers.increasePCByOne();
    }

    @Override
    public String getExecuteMessage() {
        return "AIR " + r + ", " + immed;
    }

}
