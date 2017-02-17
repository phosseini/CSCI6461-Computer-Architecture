package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.MachineFaultException;

/**
 * 
 * All the instructions in this project should extend this abstract class.
 *
 */
public abstract class AbstractInstruction {

    /**
     * 
     * execute the instruction
     * 
     * @param instruction
     *            instruction in binary String
     * @param registers
     * @param mcu
     * @throws MachineFaultException
     * 
     * 
     */
    public abstract void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException;

    /**
     * return a message that contains the execution message of an instruction.
     * eg. "LDR 3,0,31" or "Load register 3 with the contents of the memory
     * location 31". The writer of every instruction class should be responsible
     * for building such a string.
     * 
     * @return execution message
     * 
     * 
     */
    public abstract String getExecuteMessage();

}
