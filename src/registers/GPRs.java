package registers;

public class GPRs {
	// 4 General Purpose Registers (GPRs) ¨C each 16 bits in length
	int r0;
	int r1;
	int r2;
	int r3;
	
	public GPRs(){
		this.r0 = 0;
		this.r1 = 0;
		this.r2 = 0;
		this.r3 = 0;
	}

	public void init() {
		this.r0 = 0;
		this.r1 = 0;
		this.r2 = 0;
		this.r3 = 0;
	}
	
	public int getGPRByNum(int num){
		if(num == 0) return this.r0;
		if(num == 1) return this.r1;
		if(num == 2) return this.r2;
		if(num == 3) return this.r3;
		return 0;
	}
	
	public void setGPRByNum(int num, int r){
		if(num == 0) this.r0 = r;
		if(num == 1) this.r1 = r;
		if(num == 2) this.r2 = r;
		if(num == 3) this.r3 = r;
	}

	public int getR0() {
		return r0;
	}

	public void setR0(int r0) {
		this.r0 = r0;
	}

	public int getR1() {
		return r1;
	}

	public void setR1(int r1) {
		this.r1 = r1;
	}

	public int getR2() {
		return r2;
	}

	public void setR2(int r2) {
		this.r2 = r2;
	}

	public int getR3() {
		return r3;
	}

	public void setR3(int r3) {
		this.r3 = r3;
	}

}
