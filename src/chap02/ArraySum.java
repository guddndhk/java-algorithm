package chap02;

import java.util.Scanner;

/*
배열a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하시오.
 */
public class ArraySum {

    static int sumof(int[] a) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수를 입력해주세요: ");
        int num = scanner.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        sumof(x);

        System.out.println("배열a 의 요소의 합은: " + sumof(x) + "입니다.");
    }
}
