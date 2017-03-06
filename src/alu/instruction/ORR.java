package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.MachineFaultException;
import util.StringUtil;

public class ORR extends AbstractInstruction {

    int rx;
    int ry;

    @Override
    public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
        // -----------------------------------
        // 024: ORR -> Logical Or of Register and Register
        // c(rx) <- c(rx) OR c(ry)
        // -----------------------------------
        // TODO Auto-generated method stub
        this.rx = StringUtil.binaryToDecimal(instruction.substring(6, 8));
        this.ry = StringUtil.binaryToDecimal(instruction.substring(8, 10));
        int x = registers.getRnByNum(rx);
        int y = registers.getRnByNum(ry);
        x = x | y;
        registers.setRnByNum(rx, x);

        registers.increasePCByOne();
    }

    @Override
    public String getExecuteMessage() {
        // TODO Auto-generated method stub
        return "OR " + rx + ", " + ry;
    }

}