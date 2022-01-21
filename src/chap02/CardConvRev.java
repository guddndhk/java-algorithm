package chap02;

import java.util.Scanner;

public class CardConvRev {
/*
기수를 변환하는 프로그램.
 */

    // 정수값 x를 r 진수로 변환하여 배열 d에 아랫자리부터 넣어서 자릿수를 반환합니다.
    static int cardConvR(int x, int r, char[] d) {
        int digits = 0; // 변환 후의 자릿수
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r); // r로 나뉜 나머지를 저장합니다.
            x /= r;
        } while (x != 0); // 정수값이 0이 아닐때
        return digits; // 변환 후의 자릿수를 리턴
        //즉 해당 메서드 구조는 x % r 로 나뉜 나머지를 d[digits++] 에 대입하고 digits 값을 증가시킵니다.
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no;                         //변환하는 정수
        int cd;                         //기수
        int dno;                        //변환 후의 자릿수
        int retry;                      //다시 한번 말 그대로 리트라이
        char[] cno = new char[32];      //변환 후 각 자리의 숫자를 넣어두는 문자의 배열입니다.

        System.out.println("10진수를 기수 변환합니다.");
        do {
            do {
                System.out.print("변환하는 음이 아닌 정수 : ");
                no = scanner.nextInt();
            } while (no < 0);

            do {
                System.out.print("어떤 진수로 변환할까요? (2~36) : ");
                cd = scanner.nextInt();
            } while (cd < 2 || cd > 36); // or 연산자 둘중 하나만 조건을 갖추면 됩니다.
            dno = cardConvR(no, cd, cno);

            System.out.print(cd + "진수로는 ");
            for (int i = dno - 1; i >= 0; i--) { // 윗자리부터 나타내기 위한 반복문 즉 역순배열
                System.out.print(cno[i]);
            }
            System.out.println("입니다.");

            System.out.print("한 번 더 실행할까요? (1.예/0.아니오) : ");
            retry = scanner.nextInt();
        } while (retry == 1); // 맨처음 do while 문의 끝입니다. 연산이 끝난후 1 을 입력하면 다시 처음으로 돌아가 반복 합니다.
    }
}
