package chap01;

import java.util.Scanner;

public class SumForPos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("1부터 n 까지의 합을 구합니다.");

        do {
            System.out.print("n의 값: ");//do,while문을 적용하여 n의 값이 0보다 클때까지 반복합니다.
            n = scanner.nextInt();//-1 같은 값을 입력하게 되면 조건을 충족하지 못하기에 계속 양수를 요구합니다.
            /*if (n <= 0)//if 문을 추가하여 양수를 입력 하지 않을시
                System.out.println("양수를 입력해주세요");// 이와같은 메세지를 통지 할 수도 있습니다.
            */
        } while (n <= 0);// 즉 여기서 조건을 만족하지 못하면 do문의 첫번째단 으로 다시 넘어가서 반복되는 구조입니다.

        //조건이 성립 될때까지 do문 안에서 무한루프에 빠지게 됩니다.

        int sum = 0; //합 을 저장할 변수 선언

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
