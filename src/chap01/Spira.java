package chap01;

import java.util.Scanner;

public class Spira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇층인지 정수를 써주세요:: ");
        int n = scanner.nextInt();

        spira(n);
    }

    static void spira(int n) {

        for (int i = 1; i <= n; i++) { // 입력 받은 n의 값만큼 반복합니다.
            for (int j = 1; j <= n - i; j++) {// n의 값만큼 하나의 공백을 출력하는데 -1 을 넣어 하나씩 줄어나가는
                System.out.print(" ");// 피라미드 구조입니다. n=5일 경우 4 3 2 1 의 공간을 좌측부터 생성해줍니다.
            }
            for (int j = 1; j <= (i - 1) * 2 + 1; j++) {// j와 i는 둘다 1부터 시작합니다.
                System.out.print("*");// 1 <= (1 -1) *2 + 1 = 1 이므로 1개의 별부터 찍어줍니다
            }//두번째 반복시 2 <= (2 -1)*2 +1 = 3 이므로 3개의 별이 찍힙니다.
            System.out.println();// 개행을 하여 층을 쌓아줍니다.
        }

        /*
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */
    // 위의 방법과 크게 다르지 않습니다. 다만 변수들이 0부터 시작하는데 연산자들만 조금씩 수정해 주시면됩니다.
    // 사소하지만 다른 방법도 있다 라는걸 표현하고 싶었습니다. 이외에도 다양한 방법이 있습니다.
    }
}
