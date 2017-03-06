package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.MachineFaultException;
import util.StringUtil;

public class NOT extends AbstractInstruction {

    int rx;

    @Override
    public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
        // -----------------------------------
        // 025: NOT -> Logical Not of Register To Register
        // C(rx) <- NOT c(rx)
        // -----------------------------------
        // TODO Auto-generated method stub
        this.rx = StringUtil.binaryToDecimal(instruction.substring(6, 8));
        int Bd = registers.getRnByNum(rx);

        Bd = ~Bd;
        registers.setRnByNum(rx, Bd);

        registers.increasePCByOne();
    }

    @Override
    public String getExecuteMessage() {
        // TODO Auto-generated method stub
        return "NOT " + rx;
    }

}