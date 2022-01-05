package chap01;

import java.util.Scanner;

public class SumOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a의 값: ");
        int a = scanner.nextInt();
        System.out.print("b의 값: ");
        int b = scanner.nextInt();

        System.out.println("a 와 b 사이의 합은: " + sumAll(a, b));
        //sumAll 메서드를 호출하여 값을 출력합니다.
    }

    static int sumAll(int a, int b) {

        int sum = 0;
        //두수의 합을 저장할 변수를 하나 선언합니다.

        if (a < b)// 여기서 a = 3 b는 = 5 라고 가정 하겠습니다.
            for (int i = a; i <= b; i++) { // 3 <= 5 조건충족
                sum += i;// sum 에 i = a 이므로 (3+4+5)의 값이 저장됩니다.
            }
        else if (a > b)// a가 5 b가 3일 경우를 대비해 else if 조건을 추가했습니다.
            for (int i = a; i >= b; i--)// 위와 크게 다르지 않습니다 다만 i-- 는 a=5 일경우 -1씩 감소합니다.
                sum += i;

            return sum;// 두수의 합이 저장된 sum 을 리턴 하여 줍니다.
    }
}
