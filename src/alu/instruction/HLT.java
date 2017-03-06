package alu.instruction;

import javax.swing.JOptionPane;

import cpu.Registers;
import memory.MCU;
import util.Const;
import util.MachineFaultException;

public class HLT extends AbstractInstruction {

	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		// -----------------------------------
		// 000: HALT -> Stops the machine.
		// -----------------------------------
		// TODO Auto-generated method stub
		if(instruction.substring(8,16).equals("00000000")){
			System.out.println("HALT!");
			//JOptionPane.showMessageDialog(null, "Program stop!");
		}
	}

	@Override
	public String getExecuteMessage() {
		return "AND ";
	}

}
