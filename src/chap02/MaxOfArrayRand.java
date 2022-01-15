package chap02;

import java.util.Random;
import java.util.Scanner;
/*
랜덤 함수의 이용
 */
public class MaxOfArrayRand {

    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람의 수: ");
        int num = scanner.nextInt();

        int[] height = new int[num];// 입력 받은 요솟수를 height 키 에 대입합니다.

        System.out.println("키 값은 아래와 같습니다.");
        for (int i = 0; i < num; i++) {
            height[i] = 100 + random.nextInt(90);// 0~n 까지의 인덱스 안의 값은 100+ 90 안쪽의 랜덤한 정수가 들어갑니다.
            System.out.println("height[" + i + "]: " + height[i]);
        }
        System.out.println("제일 큰 키는 " + maxOf(height) + "입니다.");
    }
}
