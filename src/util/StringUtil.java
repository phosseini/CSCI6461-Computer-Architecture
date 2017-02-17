package util;

import java.math.BigInteger;

public class StringUtil {

    /**
     * @param binary
     * @return
     * 
     *         convert a binary string to a decimal integer number
     * 
     */
    public int binaryToDecimal(String binary) {
        return new BigInteger(binary, 2).intValue();
    }

    /**
     * @param decimal
     * @param bitLength
     * @return
     * 
     *         convert a decimal number to a binary String with a length
     *         of @param bitLength. Additional zeros may be added at the left
     *         side of the string in order to fit this length.
     * 
     */
    public String decimalToBinary(int decimal, int bitLength) {
        return String.format("%" + bitLength + "s", Integer.toBinaryString(decimal)).replace(" ", "0");

    }

}
