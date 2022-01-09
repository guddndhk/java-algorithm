package chap01;
/*
기본 구구단 출력하기.
 */
public class Gugu {
    public static void main(String[] args) {
        System.out.println("=====곱하기 시작=====");

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++)
                System.out.printf("%3d", i * j);
            System.out.println();

            //이번문제는 설명이 조금 길어져서 게시글의 내용을 함께 참조해주세요.
        }
    }
}
