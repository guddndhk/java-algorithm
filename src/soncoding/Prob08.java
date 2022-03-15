package soncoding;

import java.util.Scanner;

public class Prob08 {
    public static void main(String[] args) {
        int number = 0;
        int count = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("정수입력");
        number = scanner.nextInt();

        int n = 1000;
        for (int i = 1; i <= n; i++) {
            if (i % number == 0) {
                count++;
                sum += i;
            }
        }

        System.out.println(number+" 배수 개수"+count);
        System.out.println(number+" 배수 합"+sum);
    }
}
