package chap02;

import java.util.Arrays;
import java.util.Scanner;

/*
static void rcopy(int[] a , int[] b)
 배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드를 작성하시오.
 */
public class ReverseCopyArray {

    static void rcopy(int[] a , int[] b){

        for (int i = b.length-1 ,j=0 ; i >= 0; i--,j++){
            a[j] = b[i];
        }
        System.out.println("배열 b의 값"+Arrays.toString(b));
        System.out.println("배열 b의 값을 복사하여 배열 a값에 역순으로 복사 합니다.");
        System.out.println("배열 a의 값"+Arrays.toString(a));
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열 b의 요솟수 : ");
        int bn = scanner.nextInt();


        int[] b = new int[bn];
        int[] a = b.clone();

        for (int i = 0; i < bn ;i++){
            System.out.print("b["+i+"] : ");
            b[i] = scanner.nextInt();
        }

        rcopy(a,b);

    }
}
