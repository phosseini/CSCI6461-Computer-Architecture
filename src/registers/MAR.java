package registers;

public class MAR {
	// Memory Address Register: holds the address of the word to be fetched from
	// memory
	// 16 bits
	int mar;

	public MAR() {
		this.mar = 0;
	}

	public void init() {
		this.mar = 0;
	}

	public int getMar() {
		return mar;
	}

	public void setMar(int mar) {
		this.mar = mar;
	}

}
