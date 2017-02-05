package registers;

public class MFR {
	// Machine Fault Register: contains the ID code if a machine fault after it
	// occurs
	// 4 bits
	// 0 - Illegal Memory Address to Reserved Locations
	// 1 - Illegal TRAP code
	// 2 - Illegal Operation Code
	// 3 - Illegal Memory Address beyond 2048 (memory installed)
	int mfr;
	
	public MFR(){
		this.mfr = 0xf;
	}
	
	public void init(){
		this.mfr = 0xf;
	}

	public int getMfr() {
		return mfr;
	}

	public void setMfr(int mfr) {
		this.mfr = mfr;
	}
	

}
