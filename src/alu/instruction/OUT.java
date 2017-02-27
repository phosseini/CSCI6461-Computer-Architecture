package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.MachineFaultException;
import util.StringUtil;

public class OUT extends AbstractInstruction {

    int num;
    int devId;
    
    @Override
    public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
        this.num = StringUtil.binaryToDecimal(instruction.substring(6, 8));
        this.devId = StringUtil.binaryToDecimal(instruction.substring(11, 16));
        int val = registers.getRnByNum(this.num);
        char c = (char) val;
        mcu.setPrinterBuffer(String.valueOf(c));
    }

    @Override
    public String getExecuteMessage() {
        return "OUT " + num + ", " + "devId";
    }

}
