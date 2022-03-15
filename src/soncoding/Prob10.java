package soncoding;

import java.util.Scanner;

public class Prob10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputInt = scanner.nextInt();

        if (inputInt < 2 || inputInt > 9) {
            System.out.println("다시입력 1 보다 크고 10 보다 작은");
            return;
        }

        int result = 1;

        for (int i = 1; i <= inputInt; i++) {
            result = 1;
            for (int j = 2; j <= i; j++) {
                result *= j;
            }
            System.out.println(i+"!="+result);
        }
    }
}
