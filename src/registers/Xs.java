package registers;

public class Xs {
	// 3 Index Registers ¨C 16 bits in length
	int x1;
	int x2;
	int x3;

	public void init() {
		this.x1 = 0;
		this.x2 = 0;
		this.x3 = 0;
	}
	
	public int getXByNum(int num){
		if(num == 1) return this.x1;
		if(num == 2) return this.x2;
		if(num == 3) return this.x3;
		return 0;
	}
	
	public void setXByNum(int num, int x){
		if(num == 1) this.x1 = x;
		if(num == 2) this.x2 = x;
		if(num == 3) this.x3 = x;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getX3() {
		return x3;
	}

	public void setX3(int x3) {
		this.x3 = x3;
	}

}
