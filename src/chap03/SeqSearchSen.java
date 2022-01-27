package chap03;
/*
선형검색 (보초법):: 요솟수 와 값을 입력한뒤 특정 값을 입력하여 그값의 위치를 검색하는 알고리즘을 완성하시오.
 */

import java.util.Scanner;

public class SeqSearchSen {

    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;

        a[n] = key;// 보초를 배치

        while (true) {// 종료 조건이 필요하지 않기에 하나의 if 문을 사용 그러므로 반복 종료 판단횟수가 줄어듬.
            if (a[i] == key) {
                break;
            }
            i++;
        }
        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num + 1];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        System.out.print("검색할 값 : ");
        int ky = scanner.nextInt();

        int idx = seqSearchSen(x, num, ky);

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println(ky + "는 x[" + idx + "]에 있습니다.");
        }
    }
}
