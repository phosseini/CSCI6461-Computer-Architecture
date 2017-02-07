package registers;

public class IR {
	// Instruction Register: holds the instruction to be executed
	// 16 bits
	int ir;

	public IR() {
		this.ir = 0;
	}

	public void init() {
		this.ir = 0;
	}

	public int getIr() {
		return ir;
	}

	public void setIr(int ir) {
		this.ir = ir;
	}

	public String getBinaryStringIr() {
		if (this.ir <= 0xffff) {
			return String.format("%16s", Integer.toBinaryString(this.ir)).replace(" ", "0");
		}
		return null;
	}

}
