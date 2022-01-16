package chap02;

import java.util.Scanner;

public class ReverseArrayView {

    static void swap(int[] a, int index1, int index2) {
        /*int sum = a[index1];
        a[index1] = a[index2];
        a[index2] = sum;
    */
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = a[index1];
            a[index1] = a[index2];
            a[index2] = sum;
            //System.out.println("a["+a[index1]+"]과 a["+a[index2]+"]를 교환합니다.");
            System.out.println(a[index1]);
        }
    }


    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        reverse(x);

        System.out.println("역순 정렬");
        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }

    }
}
