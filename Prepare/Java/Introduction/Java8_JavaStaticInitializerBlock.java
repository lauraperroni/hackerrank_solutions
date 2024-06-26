package Prepare.Java.Introduction;

import java.util.Scanner;

public class Java8_JavaStaticInitializerBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int h = sc.nextInt();

        if (b > 0 && h > 0) {
            int area = b * h;
            System.out.println(area);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        sc.close();
    }
}
