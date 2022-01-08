package chap01;

import java.util.Scanner;

/*
a,b에 정수의 값을 입력받아 b-a를 출력하는 프로그램을 작성하시오
또한 a가 b보다 클경우 b의 값을 다시 입력 받으십시오.
 */

public class SumForPos2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a; //a,b 변수 선언
        int b;

        System.out.println("b-a 값을 구합니다.");

        System.out.println("a 의값: ");
        a = scanner.nextInt();

        do {
            System.out.println("b 의값: ");
            b = scanner.nextInt();
            if (a >= b) //앞전의 양수만~~ 게시글에서 본 if문을 적용 하였습니다.
                // b가 a보다 작거나 같을때 b의 값만 계속 다시 요구하게 됩니다.
                System.out.println("b의 값은 a의 값보다 커야합니다.");
        } while (a >= b);

        int sum = 0; // b-a 값을 담아줄 변수선언

        if (a < b)
            sum += (b - a); // sum += b - a 도 되지만 가독성을위해 (닫아줍니다.)
        System.out.println("b-a 의 값은: " + sum);
    }
}
