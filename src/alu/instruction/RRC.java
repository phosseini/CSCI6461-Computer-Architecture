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

    public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
        // -----------------------------------
        // 032: RRC -> Rotate Register by Count
        // c(r) is rotated left (L/R = 1) or right (L/R =0) either logically
        // (A/L =1)

        // -----------------------------------
        // TODO Auto-generated method stub
        this.AL = StringUtil.binaryToDecimal(instruction.substring(8, 9));
        this.LR = StringUtil.binaryToDecimal(instruction.substring(9, 10));
        this.r = StringUtil.binaryToDecimal(instruction.substring(6, 8));
        this.Ct = StringUtil.binaryToDecimal(instruction.substring(12, 16));
        int Bd = registers.getRnByNum(r);
        String x = null;
        String y = null;
        String z = null;

        z = Integer.toBinaryString(Bd);
        if (Bd >= 0)
            ;
        z = z.replace("0000000000000000", "");
        if (Bd < 0)
            z = z.replaceAll("1111111111111111", "");
        z = rotate(z);
        if (AL == 1) {
            if (LR == 0) {
                x = rotate(z.substring(Ct, z.length()));
                y = rotate(z.substring(0, Ct - 1));
                z = y + x;
            }
            if (LR == 1) {
                x = rotate(z.substring(0, z.length() - Ct));
                y = rotate(z.substring(z.length() - Ct, z.length()));
                z = x + y;
            }
        }
        Bd = Integer.parseInt(z, 2);
        registers.setRnByNum(r, Bd);

        registers.increasePCByOne();
    }

    @Override
    public String getExecuteMessage() {
        // TODO Auto-generated method stub
        return "RRC " + r + ", " + Ct + ", " + LR + ", " + AL;
    }

    private String rotate(String origin) {
        int i;
        char[] origins = origin.toCharArray();
        for (i = 0; i < origins.length / 2; i++) {
            char tem = origins[i];
            origins[i] = origins[origins.length - 1 - i];
            origins[origins.length - 1 - i] = tem;
        }

        return String.valueOf(origins);

    }

}