package chap03;
/*
선형검색 :: 요솟수 와 값을 입력한뒤 특정 값을 입력하여 그값의 위치를 검색하는 알고리즘을 완성하시오.
 */

import java.util.Scanner;

public class SeqSearch {

    static int seqSeqrch(int[] a, int n, int key) {
        int i = 0;

      /*  for (int i = 0; i < n; i++){
            if (a[i] == key){
                return i;
            }
                return -1;
        }
       */
        // for 문 방법도 기재.

        while (true) {
            if (i == n) {
                return -1;//    검색 실패 -1 리턴
            }
            if (a[i] == key) {
                return i;// 검색 성공시 인덱스 반환
            }
            i++;
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

        System.out.print("검색할 값 : ");
        int ky = scanner.nextInt();
        int idx = seqSeqrch(x, num, ky);// 배열x 에서 키 값이 ky인 요소를 검색

        if (idx == -1) {
            System.out.println("그 값의 요소가 존재하지 않습니다.");
        } else {
            System.out.println(ky + "은 x[" + idx + "]에 있습니다.");
        }
    }
}
