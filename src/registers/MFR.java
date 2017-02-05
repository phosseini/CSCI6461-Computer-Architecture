package registers;

public class MFR {
	// Machine Fault Register: contains the ID code if a machine fault after it
	// occurs
	// 4 bits
	int msf;

	public void init() {
		this.msf = 0;
	}

	public int getMsf() {
		return this.msf;
	}

	public void setMsf(int value) {
		this.msf = value;
	}
}
