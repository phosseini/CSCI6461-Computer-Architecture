package alu.instruction;

import cpu.Registers;
import memory.MCU;
import util.Const;
import util.MachineFaultException;
import util.StringUtil;

/**
 * 
 * OUT r, devid</br>
 * Output Character to Device from Register
 * 
 * @author Liang
 *
 */
public class OUT extends AbstractInstruction {

    int num;
    int devId;

    @Override
    public void execute(String instruction, Registers registers, MCU mcu) throws MachineFaultException {
        this.num = StringUtil.binaryToDecimal(instruction.substring(6, 8));
        this.devId = StringUtil.binaryToDecimal(instruction.substring(11, 16));
        if (this.devId == Const.DevId.PRINTER.getValue()) {
            int val = registers.getRnByNum(this.num);
            char c = (char) val;
            mcu.setPrinterBuffer(String.valueOf(c));
            
            registers.increasePCByOne();
        }
    }

    @Override
    public String getExecuteMessage() {
        return "OUT " + this.num + ", " + this.devId;
    }

}
