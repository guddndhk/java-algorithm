package soncoding;

import java.util.Scanner;

public class Prob2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
