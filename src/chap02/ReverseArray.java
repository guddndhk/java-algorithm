package chap02;

import java.util.Scanner;

/*
배열 역순
 */
public class ReverseArray {

    // idx1와 idx2 의 값 을 바꾼다
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }

    // a의 요소를 역순으로 정렬
    static void reverse(int[] a){
        for (int i = 0 ; i < a.length /2 ;i++){
            swap(a, i, a.length -i -1);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = scanner.nextInt();

        int[] x = new int[num];

        for (int i = 0 ; i < num; i++){
            System.out.print("x["+i+"] :");
            x[i] = scanner.nextInt();
        }

        reverse(x);

        System.out.println("요수를 역순으로 정렬 하였습니다.");
        for (int i = 0 ; i < num; i++){
            System.out.println("x["+i+"] = "+ x[i]);
        }
    }
}
