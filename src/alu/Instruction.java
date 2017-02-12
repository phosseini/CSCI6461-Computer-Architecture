package alu;

public class Instruction {
	
	// we use this class in order to create an object for the instruction that we want to execute.
	
	public int opcode;
	public int r;
	public int ix;
	public int i;
	public int address;
	
	public int getOpcode(){return this.opcode;}
	public int getR(){return this.r;}
	public int getIX(){return this.ix;}
	public int getI(){return this.i;}
	public int getAddress(){return this.address;}

}
