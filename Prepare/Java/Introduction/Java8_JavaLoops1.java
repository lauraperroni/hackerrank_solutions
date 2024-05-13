package Prepare.Java.Introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java8_JavaLoops1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d %n", N, i, N * i);
        }

        bufferedReader.close();
    }
}
