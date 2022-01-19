package chap02;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {

    static void equals(int[] a, int[] b) {

        if (a != b)
            b = a;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                a[i] = b[i];
        }
    }

    static void copy(int[] a, int[] b){

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

        equals(a, b);

        for (int i = 0 ; i < b.length; i++){
            System.out.println("a[" + i + "] = " + Arrays.toString(a));
            System.out.println("\nb[" + i + "] = " + Arrays.toString(b));
        }


    }
}
