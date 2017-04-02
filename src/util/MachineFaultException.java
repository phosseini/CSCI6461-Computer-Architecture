package util;
import javax.swing.JOptionPane;

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
		 JOptionPane.showMessageDialog(null, this.message, "Fault Code: " + this.faultCode, JOptionPane.INFORMATION_MESSAGE);
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
