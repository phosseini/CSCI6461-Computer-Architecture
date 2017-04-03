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
	public MachineFaultException(int faultCode, String message){
		this.faultCode = faultCode;
		this.message = message;
	}
	
	public MachineFaultException(int faultCode){
		this.faultCode = faultCode;
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
