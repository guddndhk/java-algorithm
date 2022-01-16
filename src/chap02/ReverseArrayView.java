package chap02;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayView {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        for (int i = 0; i < x.length / 2; i++) {
            System.out.println(Arrays.toString(x));
            System.out.println("a[" + i + "]와 a[" + (x.length - i - 1) + "]를 교환합니다.");
            int sum = x[i];
            x[i] = x[x.length - i - 1];
            x[x.length - i - 1] = sum;
            for (int j = 0; j< num;j++ ){
                //System.out.print(x[j]);
            }
            //System.out.println();
        }
        System.out.println("역순 정렬을 마쳤습니다.");



    }
}
