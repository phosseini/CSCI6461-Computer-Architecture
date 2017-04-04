package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.Const;
import util.MachineFaultException;
import util.StringUtil;

public class CHK extends AbstractInstruction {
	
	int num;
	int devId;

	@Override
	public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
		// TODO Auto-generated method stub
		this.num = StringUtil.binaryToDecimal(instruction.substring(6, 8));
		this.devId = StringUtil.binaryToDecimal(instruction.substring(11, 16));
		
		if (this.devId == Const.DevId.KEYBOARD.getValue()) {
			String buffer = mcu.getKeyboardBuffer();

            if (buffer != null && buffer.length() > 0) {

                int val = buffer.charAt(0);
                registers.setRnByNum(this.num, val);
                mcu.setKeyboardBuffer(buffer.substring(1, buffer.length()));

            } else {
                registers.setRnByNum(this.num, 0);
            }
		}
		
		if (this.devId == Const.DevId.CARD.getValue()) {
			String buffer = mcu.getCardBuffer();
            
            if (buffer != null && buffer.length() > 0) {
                
                int val = buffer.charAt(0);
                registers.setRnByNum(this.num, val);
                mcu.setCardBuffer(buffer.substring(1, buffer.length()));
                
            } else {
                registers.setRnByNum(this.num, 0);
            }
        }
        
		
		
		if (this.devId == Const.DevId.PRINTER.getValue()) {
			String buffer = mcu.getPrinterBuffer();
            
            if (buffer != null && buffer.length() > 0) {
                
                int val = buffer.charAt(0);
                registers.setRnByNum(this.num, val);
                mcu.setCardBuffer(buffer.substring(1, buffer.length()));
                
            } else {
                registers.setRnByNum(this.num, 0);
            }
		}
		}
		
	

	@Override
	public String getExecuteMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}
