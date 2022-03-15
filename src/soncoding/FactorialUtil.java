package soncoding;

import java.util.Scanner;

public class FactorialUtil {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("input:         =");

        FactorialUtil util = new FactorialUtil();
        System.out.print("result = " + util.factorial(scanner.nextInt()));
    }

    public int factorial(int n) {

        if (n == 1) {
            return n;
        }

        return n = n + factorial(n - 1);
    }
}
