package util;

import java.math.BigInteger;

public class StringUtil {

    /**
     * 
     * convert a binary string to a decimal integer number
     * 
     * @param binary
     *            binary String
     * @return decimal number
     * 
     */
    public static int binaryToDecimal(String binary) {
        return new BigInteger(binary, 2).intValue();
    }

    /**
     * 
     * convert a decimal number to a binary String with a length of @param
     * bitLength. Additional zeros may be added at the left side of the string
     * in order to fit this length.
     * 
     * @param decimal
     *            decimal number
     * @param bitLength
     *            the bits of the binary
     * @return binary String
     * 
     * 
     */
    public static String decimalToBinary(int decimal, int bitLength) {
        return String.format("%" + bitLength + "s", Integer.toBinaryString(decimal)).replace(" ", "0");

    }

}
