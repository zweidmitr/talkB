package com.zwei.memory.meth;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Big {
    public static void main(String[] args) {

        BigInteger big = new BigInteger("123");
        System.out.println(big);
        BigInteger big2 = new BigInteger("123456789123456789123456789123450000");
        System.out.println(big.add(big2));
        System.out.println(big.multiply(big2));
        System.out.println(big2.subtract(big));


        BigDecimal bigDecimal = new BigDecimal("123.5");
        BigDecimal bigDecimal2 = new BigDecimal("123456789123456789123456789123450000.6543123215");
        System.out.println(bigDecimal.add(bigDecimal2));
        System.out.println(bigDecimal2.divide(new BigDecimal("2")));
    }
}
