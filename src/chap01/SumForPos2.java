package chap01;

import java.util.Scanner;

/*
a,b에 정수의 값을 입력받아 b-a를 출력하는 프로그램을 작성하시오
또한 a가 b보다 클경우 b의 값을 다시 입력 받으십시오.
 */

public class SumForPos2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        System.out.println("b-a 값을 구합니다.");

        System.out.println("a 의값: ");
        a = scanner.nextInt();
        do {
            System.out.println("b 의값: ");
            b = scanner.nextInt();
            if (a >= b)
                System.out.println("b의 값은 a의 값보다 커야합니다.");
        } while (a >= b);

        int sum = 0;

        if (a < b)
            sum += b - a;
        System.out.println("b-a 의 값은: " + sum);
    }
}
