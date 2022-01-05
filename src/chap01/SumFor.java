package chap01;

import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        /*
        for 반복문 i = 1일 때 i <=n; i++ 이다
        1 <= n 의 조건이 충족되면 반복문을 시작합니다 반복과 동시에 i++ 도 성립되며
        i 의 값이 하나씩 ++ 됩니다 (EX :1,2,3)
        또한 sum += i; 를 수행후 다시 포문으로 넘어가 i++된 두번째 반복을 수행하는 프로세서 입니다.
        앞에 작성한 while문 의 반복 사이클과 상이합니다.
         */
        System.out.println("1부터 " + n + "까지의 합은" + sum + "입니다.");
    }
}
