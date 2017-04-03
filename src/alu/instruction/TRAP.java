package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.Const;
import util.MachineFaultException;
import util.StringUtil;

public class TRAP extends AbstractInstruction {

    int trapCode;

    @Override
    public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
        // TODO Auto-generated method stub
        // System.out.println("This is a TRAP instruction!");
        trapCode = StringUtil.binaryToDecimal(instruction.substring(12, 16));
        if(trapCode > 15 || trapCode < 0){
            throw new MachineFaultException(Const.FaultCode.ILL_TRPC.getValue(), Const.FaultCode.ILL_TRPC.getMessage());
        }
        // store pc+1 into memory 2
        registers.setMAR(2);
        registers.setMBR(registers.getPC() + 1);
        mcu.storeIntoCache(registers.getMAR(), registers.getMBR());
        // goes to the routine whose address is in memory location 0
        registers.setMAR(0);
        registers.setMBR(mcu.fetchFromCache(registers.getMAR()));
        int tableAddress = registers.getMBR();

        registers.setMAR(trapCode + tableAddress);
        registers.setMBR(mcu.fetchFromCache(registers.getMAR()));
        int routine = registers.getMBR();
        registers.setPC(routine);
        try {
            do {
                registers.setMAR(registers.getPC());
                registers.setMBR(mcu.fetchFromCache(registers.getMAR()));
                registers.setIR(registers.getMBR());
                String ins = StringUtil.decimalToBinary(registers.getIR(), 16);
                String opCode = ins.substring(0, 6);
                if (Const.OPCODE.containsKey(opCode)) {
                    AbstractInstruction instr = (AbstractInstruction) Class
                            .forName("alu.instruction." + Const.OPCODE.get(opCode)).newInstance();
                    instr.execute(ins, registers, mcu);
                }
            } while (registers.getIR() != 0);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // return to the instruction
        registers.setMAR(2);
        registers.setMBR(mcu.fetchFromCache(registers.getMAR()));
        registers.setPC(registers.getMBR());
    }

    @Override
    public String getExecuteMessage() {
        // TODO Auto-generated method stub
        return "TRAP " + trapCode;
    }
}