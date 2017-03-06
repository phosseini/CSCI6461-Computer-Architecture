package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.MachineFaultException;
import util.StringUtil;

public class SRC extends AbstractInstruction {
    int AL;
    int LR;
    int Ct;
    int r;

    public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
        // -----------------------------------
        // 031: RRC -> Shift Register by Count,
        // c(r) is shifted left (L/R =1) or right (L/R = 0) either logically
        // (A/L = 1) or arithmetically (A/L = 0)


        // -----------------------------------
        // TODO Auto-generated method stub
        this.AL = StringUtil.binaryToDecimal(instruction.substring(8, 9));
        this.LR = StringUtil.binaryToDecimal(instruction.substring(9, 10));
        this.Ct = StringUtil.binaryToDecimal(instruction.substring(12, 16));
        this.r = StringUtil.binaryToDecimal(instruction.substring(6, 8));
        int Bd = registers.getRnByNum(r);
        if (AL == 0) {
            if (LR == 0) {
                Bd = Bd >> Ct;
            }
            if (LR == 1) {
                Bd = Bd << Ct;
            }
        }
        if (AL == 1) {
            if (LR == 0) {
                if (Bd >= 0)
                    Bd = (Bd >>> Ct);
                else {
                    String x = Integer.toBinaryString(Bd >>> Ct);
                    x = x.replace("1111111111111111", "");
                    Bd = Integer.parseInt(x, 2);
                }
            }
            if (LR == 1) {
                Bd = Bd << Ct;
            }
        }

        registers.setRnByNum(r, Bd);
        registers.increasePCByOne();
    }

    public String getExecuteMessage() {
        // TODO Auto-generated method stub
        return "SRC " + r + ", " + Ct + ", " + LR + ", " + AL;
    }

}
