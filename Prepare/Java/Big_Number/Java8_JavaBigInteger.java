package Prepare.Java.Big_Number;

import java.util.*;
import java.math.BigInteger;

public class Java8_JavaBigInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();

        BigInteger sum = a.add(b);
        BigInteger multiply = a.multiply(b);

        System.out.println(sum);
        System.out.println(multiply);

        scanner.close();
    }
}
