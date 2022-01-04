package chap01;

import java.util.Scanner;

public class Median {
    //파라메터 값이  a:1 b:2 c:3 일 경우를 생각하여 코딩 하였습니다.
    static int med3(int a, int b, int c) {

        if (a >= b) // 첫번째 조건문 1 >= 2 일때 flase 입니다
            if (b >= c) // 첫번째 조건문이 flase 이기에 두번째 조건문은 실행하지 않습니다.
                return b;
            else if (a <= c)
                return a;
            else
                return c;
        else if (a > c)// 첫번째 조건문의 else if 문 입니다 1 > 3 일때
            return a; // flase 반환 하지 않습니다.
        else if (b > c) // 2 > 3 일때 flase
            return c; //반환하지 않습니다.
        else //바로위 2 > 3 이 아닐때 다음과 같이 b를 반환 합니다.
            return b; //2 미들값을 반환합니다.

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.print("a의값");
        int a = scanner.nextInt();
        System.out.print("b의값");
        int b = scanner.nextInt();
        System.out.print("c의값");
        int c = scanner.nextInt();

        System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
    }
}
