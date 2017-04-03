package util;
import javax.swing.JOptionPane;

import cpu.Registers;
import memory.MCU;

/**
 * @author Liang
 *
 */
public class MachineFaultException extends Exception{
	
	int faultCode;
	String message;
	
	/**
	 * @param faultCode
	 * @param message
	 */
	public MachineFaultException(int faultCode, String message, MCU mcu, Registers registers){
		this.faultCode = faultCode;
		this.message = message;
		HandlingMachineFault(mcu, registers);
		JOptionPane.showMessageDialog(null, this.message, "Fault Code: " + this.faultCode, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public MachineFaultException(int faultCode){
		this.faultCode = faultCode;
	}
	
	private void HandlingMachineFault(MCU mcu, Registers registers)
	{
		// when a machine fault occurs, we should save current values of PC and MSR into reserved locations in memory.
		mcu.storeIntoCache(4, registers.getPC());
		mcu.storeIntoCache(5, registers.getMSR()); // location 5 in memory is not used, so we can store MSR for machine fault in address 5
		
		// now we should fetch from location 1 into the PC
		registers.setPC(mcu.fetchFromCache(1));
	}
	
	/**
	 * @return
	 */
	public int getFaultCode(){
		return this.faultCode;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 */
	public String getMessage(){
		return this.message;
	}
	

}
