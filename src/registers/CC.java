package registers;

public class CC {
	// Condition Code: set when arithmetic/logical operations are executed
	// 4 bits
	int cc;

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

}
