package registers;

public class MSR {
	// Machine Status Register: certain bits record the status of the health of
	// the machine
	// 16 bits
	int msr;

	public void init() {
		this.msr = 0;
	}

	public int getMsr() {
		return this.msr;
	}

	public void setMsr(int msf) {
		this.msr = msf;
	}
}
