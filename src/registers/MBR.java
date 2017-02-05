package registers;

public class MBR {
	// Memory Buffer Register: holds the word just fetched from or the word to
	// be /last stored into memory
	// 16 bits
	int mbr;
	
	public MBR(){
		this.mbr = 0;
	}

	public void init() {
		this.mbr = 0;
	}

	public int getMbr() {
		return mbr;
	}

	public void setMbr(int mbr) {
		this.mbr = mbr;
	}

}
