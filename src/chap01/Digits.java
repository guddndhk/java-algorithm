package chap01;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        //인스턴스 선언
        Scanner scanner = new Scanner(System.in);
        //변수선언
        int no;

        System.out.println("2자리의 정수를 입력하시오.");

        do {
            System.out.println("입력: ");
            no = scanner.nextInt();
        } while (no < 10 || no > 99);
        // 논리연산자 ||(OR) no 가 10보다 작거나 99보다 크면 do while 문의 루프를 계속 순환합니다.
        //논리연산자는 블로그 게시글에 추가 설명 하겠습니다.

        System.out.println("변수 no의 값은 " + no + "가 되었습니다.");
    }
}
