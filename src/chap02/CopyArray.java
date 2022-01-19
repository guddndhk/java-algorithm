package chap02;

import java.util.Arrays;
import java.util.Scanner;

/*
static void copy(int[] a, int[] b) 배열 b 의 요소를 배열 a 에 복사하는 메서드를 작성하시오.
 */

public class CopyArray {

    static void copy(int[] a, int[] b) {

        if (a != b)
            a = b.clone();
        System.out.println("int[] a : "+Arrays.toString(a));
        System.out.println("int[] b : "+Arrays.toString(b));
        System.out.println("복사가 완료 되었습니다.");
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열 a의 요솟수 : ");
        int an = scanner.nextInt();

        int[] a = new int[an];

        for (int i = 0 ; i < an; i++){
            System.out.print("a[" + i + "] : ");
            a[i] = scanner.nextInt();
        }

        System.out.print("배열 b의 요솟수 : ");
        int bn = scanner.nextInt();

        int[] b = new int[bn];

        for (int i = 0 ; i < bn; i++){
            System.out.print("a[" + i + "] : ");
            b[i] = scanner.nextInt();
        }

        copy(a, b);

    }
}
