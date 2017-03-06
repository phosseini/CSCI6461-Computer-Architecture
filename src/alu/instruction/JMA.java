package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.EffectiveAddress;
import util.MachineFaultException;
import util.StringUtil;

public class JMA extends AbstractInstruction {

    int ix;
    int address;
    int i;

    @Override
    public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
        // -----------------------------------
        // 013: JMA -> Unconditional Jump To Address
        // -----------------------------------
        ix = StringUtil.binaryToDecimal(instruction.substring(8, 10));
        address = StringUtil.binaryToDecimal(instruction.substring(11, 16));
        i = StringUtil.binaryToDecimal(instruction.substring(10, 11));

        registers.setPC(EffectiveAddress.calculateEA(ix, address, i, mcu, registers));
    }

    @Override
    public String getExecuteMessage() {
        // TODO Auto-generated method stub
        return "JMA " + ix + ", " + address + ", " + i;
    }

}