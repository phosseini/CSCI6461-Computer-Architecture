package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.EffectiveAddress;
import util.MachineFaultException;
import util.StringUtil;

public class RFS extends AbstractInstruction {

    int immed;

    @Override
    public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
        // -----------------------------------
        // 015: RFS -> Return From Subroutine w/ return code as Immed portion
        // (optional) stored in the instruction's address field
        // registers.setR0(Immed));?????????????????
        // -----------------------------------
        immed = StringUtil.binaryToDecimal(instruction.substring(11, 16));
        registers.setR0(immed);
        registers.setPC(registers.getR3());
    }

    @Override
    public String getExecuteMessage() {
        // TODO Auto-generated method stub
        return "RFS " + immed;
    }

}