package chap02;

import java.util.Scanner;

/*
배열 역순
 */
public class ReverseArray {

    // idx1와 idx2 의 값 을 바꾼다
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];// t라는 공간에 a[idx1] 인덱스값을 넣어줍니다. ex) t = 1이 들어갑니다.
        a[idx1] = a[idx2];// a[idx1] 에는 이제 a[idx2] 의 값을 대입 해줍니다. ex) 1 은 5가 됩니다.
        a[idx2] = t;// ex) a[idx2]에 t 를 대입하여 5는 1이 됩니다. 이런식으로 역순 정렬이 됩니다.
    }

    // a의 요소를 역순으로 정렬
    static void reverse(int[] a) {//메인에서 넘긴 인자값이 들어옵니다.
        for (int i = 0; i < a.length / 2; i++) {// 나누기 2 를 하는 것은 가운데 홀수는 역순에 포함되지 않기 때문입니다.
            // 이유는 1,2,3,4,5 를 역순할시 3의 값은 변동이 없습니다 /2 를 나누어 1 5 , 2 4 즉 2번만 실행합니다.
            swap(a, i, a.length - i - 1);// swap 으로 인자 값 들을 넘겨줍니다.
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //총 요소의 값을 받습니다.
        System.out.print("요솟수: ");
        int num = scanner.nextInt();

        int[] x = new int[num];// 입력 받은 수의 인덱스(배열)이 생성됩니다.

        //입력받은 요솟수 만큼 반복하여 배열 마다 값을 넣어줍니다.
        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] :");
            x[i] = scanner.nextInt();
        }

        //역순 메서드를 실행합니다.
        reverse(x);

        System.out.println("요수를 역순으로 정렬 하였습니다.");
        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
