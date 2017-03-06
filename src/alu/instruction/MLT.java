package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.Const;
import util.MachineFaultException;
import util.StringUtil;

public class MLT extends AbstractInstruction {

    int rx;
    int ry;

    @Override
    public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
        // ------------------------------------------------------
        // 020: MLT -> Multiply Register by Register
        // rx, rx+1 <- c(rx) * c(ry)
        // rx must be 0 or 2
        // ry must be 0 or 2
        // rx contains the high order bits, rx+1 contains the low order bits of
        // the result
        // Set OVERFLOW flag, if overflow
        // ------------------------------------------------------

        rx = StringUtil.binaryToDecimal(instruction.substring(6, 8));
        ry = StringUtil.binaryToDecimal(instruction.substring(8, 10));

        // first we should check the below condition:
        // rx must be 0 or 2
        // AND
        // ry must be 0 or 2
        if ((rx == 0 || rx == 2) && (ry == 0 || ry == 2)) {

            // doing the multiplication
            double result = registers.getRnByNum(rx) * registers.getRnByNum(ry);

            // we check if we have an overflow
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) { // TODO
                                                                            // not
                                                                            // sure
                registers.setCCElementByBit(Const.ConditionCode.OVERFLOW.getValue(), true);
            } else {
                // rx contains the high order bits of the result
                registers.setRnByNum(rx, getHighOrderBits((int) result));

                // rx+1 contains the low order bits of the result
                registers.setRnByNum(rx + 1, getLowOrderBits((int) result));
            }
        }

        registers.increasePCByOne();

    }

    @Override
    public String getExecuteMessage() {
        return "MLT " + rx + ", " + ry;
    }

    // getting the low 16 bits of an integer
    private int getLowOrderBits(int x) {
        return (x & 0xFFFF);
    }

    // getting the high 16 bits of an integer
    private int getHighOrderBits(int x) {
        return x >> 16;
    }

}
