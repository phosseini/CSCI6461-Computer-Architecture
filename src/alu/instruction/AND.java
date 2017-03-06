package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.MachineFaultException;
import util.StringUtil;

public class AND extends AbstractInstruction {
    int rx;
    int ry;


    @Override
    public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
        // -----------------------------------
        // 023: AND-> Logical And of Register and Register
        // c(rx) <- c(rx) AND c(ry)
        // -----------------------------------
        // TODO Auto-generated method stub

        this.rx = StringUtil.binaryToDecimal(instruction.substring(6, 8));
        this.ry = StringUtil.binaryToDecimal(instruction.substring(8, 10));
        int x = registers.getRnByNum(rx);
        int y = registers.getRnByNum(ry);
        registers.setRnByNum(rx, x & y);

        registers.increasePCByOne();
    }

    @Override
    public String getExecuteMessage() {
        // TODO Auto-generated method stub
        return "AND " + rx + ", " + ry;
    }


}