package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.Const;
import util.MachineFaultException;
import util.StringUtil;

public class DVD extends AbstractInstruction {

    int rx;
    int ry;

    @Override
    public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
        // ------------------------------------------------------
        // 021: DVD -> Divide Register by Register
        // rx, rx+1 <- c(rx)/c(ry)
        // rx must be 0 or 2
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

            // if c(ry) = 0, it means that we have a divide by zero
            if (registers.getRnByNum(ry) == 0) {
                registers.setCCElementByBit(Const.ConditionCode.DIVZERO.getValue(), true);
                // TODO: I think it is a trap and we should handle it.
            } else {

                // doing the division: result is the same as quotient
                int result = registers.getRnByNum(rx) / registers.getRnByNum(ry);

                // first we check if we have an overflow
                if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                    registers.setCCElementByBit(Const.ConditionCode.OVERFLOW.getValue(), true);
                } else {

                    // if we do not have an overflow, we continue updating the
                    // value of registers
                    int remainder = registers.getRnByNum(rx) % registers.getRnByNum(ry);

                    // saving the quotient in rx
                    registers.setRnByNum(rx, result);

                    // saving the remainder in rx+1
                    registers.setRnByNum(rx + 1, remainder);
                }
            }

            registers.increasePCByOne();
        }

    }

    @Override
    public String getExecuteMessage() {
        // TODO Auto-generated method stub
        return "DVD " + rx + ", " + ry;
    }

}
