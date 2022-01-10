package chap01;

import java.util.Scanner;

/*
왼쪽 아래가 직각인 이등변 삼각형을 출력하시오
 */
public class TriangleLeft {
    public static void main(String[] args) {
        // 스캐너 인스턴스 생성
        Scanner scanner = new Scanner(System.in);
        //변수선언
        int n;

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형 출력시작.");

        do {
            System.out.print("몇 층의 삼각형을 출력 하시겠습니까?");
            n = scanner.nextInt();
        }while (n <= 0); // 이전게시물에 false 조건으로 빠져나온다고 설명 드려습니다. 구구단 게시글 참조.

        for (int i = 1; i <= n; i++){// i가 n 보다 작거나 같을 때 반복합니다.
            for (int j = 1 ; j <= i; j++)// j 는 i 보다 작거나 같다 즉 j가 i  될때까지 반복됩니다.
                System.out.print("*");
            System.out.println();
        /*
        추가설명
        n = 4 일때 첫번째 for문(i) 는 자신포함 하위를 총 4번 반복합니다.
        i 는 1부터 시작해서 n = 4 까지 도달해야 하기 때문입니다.
        두번째 for문(j) 는 i 의 값 만큼 반복합니다.
        i = 1일 때 1번 반복되어 * 하나가 출력되고 i = 2일 때 1부터 2까지 두번 반복하여 * 을 2개 출력합니다.
         */
        }
    }
}
