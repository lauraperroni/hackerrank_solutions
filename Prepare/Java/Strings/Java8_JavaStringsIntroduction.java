package Prepare.Java.Strings;

import java.util.Scanner;

public class Java8_JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int sum = (A.length()) + (B.length());

        System.out.println(sum);

        if (A.compareTo(B) < 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        System.out.println(Character.toUpperCase(A.charAt(0)) + A.substring(1, A.length()) + " "
                + Character.toUpperCase(B.charAt(0)) + B.substring(1, B.length()));

    }
}