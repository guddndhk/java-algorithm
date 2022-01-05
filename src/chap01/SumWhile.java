package chap01;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값: ");
        int n = scanner.nextInt(); // n 의 값을 5라고 지칭 하겠습니다.

        int sum = 0; //sum 이라는 변수명은 대게 값의 합을 지칭할때 사용합니다.
        int i = 1;

        while (i <= n) { // 1 <= 5 일경우 해당 while 반복문은 반복하게 됩니다.
            sum += i; //첫번째 반복 i = 1 sum 에 1의 값을 + 해줍니다.
            i++; // 1++ 이기에 이제 i 의 값은 1에서 2가 됩니다.
        /*
        그렇게 1~5 까지의 값이 sum += i 즉 sum 에 + 됩니다.
        sum 의 구조 (1+2+3+4+5) 로 안에서 저장되어 있습니다.
        그렇게 5번을 반복하면 i <= 5 해당 while 반복문은 멈추게 되고
         */
        }
        System.out.println("1부터 " + n + "까지의 합은" + sum + "입니다.");
        //while 문에 벗어난 해당 println 이 출력됩니다.
    }
}
