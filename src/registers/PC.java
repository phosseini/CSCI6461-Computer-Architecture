package registers;

public class PC {
	// Program Counter: address of next instruction to be executed
	// 12 bits
	int pc;
	
	public PC(){
		this.pc = 0;
	}

	public void init() {
		this.pc = 0;
	}

	public int getPc() {
		return this.pc;
	}

	public void setPc(int pc) {
		this.pc = pc;
	}
	
	public void pcIncrease(){
		this.pc++;
	}

}
