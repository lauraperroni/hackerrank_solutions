package Prepare.Java.Introduction;

import java.util.Scanner;

public class Java8_JavaEndOfLife {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer i = 0;
        while (sc.hasNext()) {
            i++;
            System.out.println(i + " " + sc.nextLine());
        }
        sc.close();
    }
}
