package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.MachineFaultException;
import util.StringUtil;


public class RRC extends AbstractInstruction {
    int AL;
    int LR;
    int Ct;
    int r;
    int Bd;

    public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
			// -----------------------------------
			// 032: RRC -> Rotate Register by Count
			//c(r) is rotated left (L/R = 1) or right (L/R =0) either logically (A/L =1)

			// -----------------------------------
			// TODO Auto-generated method stub
			this.AL=StringUtil.binaryToDecimal(instruction.substring(8,9));
			this.LR=StringUtil.binaryToDecimal(instruction.substring(9,10));
			this.r=StringUtil.binaryToDecimal(instruction.substring(6,8));
			this.Bd=registers.getRnByNum(r);
			this.Ct=StringUtil.binaryToDecimal(instruction.substring(12,16));
			
			String x = null;  //first part of the content
			String y=null;  //second part of the content
			String z=null; //string form of content of the register
			
			z=Integer.toBinaryString(Bd);
			if(Bd>=0);
			z=z.replace("0000000000000000","");
			if(Bd<0)
				z=z.replaceAll("1111111111111111", "");
			
			if(LR==1){
				x=z.substring(Ct, z.length());
				y=z.substring(0,Ct);
				z=x+y;
			}
			if(LR==0){
				x=z.substring(0, z.length()-Ct);
				y=z.substring(z.length()-Ct,z.length());
				z=y+x;
			}
			
			Bd=Integer.parseInt(z,2);
			registers.setRnByNum(r,Bd);
			
			registers.increasePCByOne();
		}
			
		


        

    @Override
    public String getExecuteMessage() {
        // TODO Auto-generated method stub
        return "RRC " + r + ", " + Ct + ", " + LR + ", " + AL;
    }

}  



		
