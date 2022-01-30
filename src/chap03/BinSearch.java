package chap03;

import java.util.Scanner;

/*
이진 검색 :: 이진 검색은 검색 대상이 정렬이 되어 있음을 가정할때 가능하다.
 */
public class BinSearch {

    static int binSearch(int[] a, int n, int key) {

        int pl = 0;     //검색 범위의 첫 인덱스
        int pr = n - 1; //검색 범위의 끝 인덱스

        do {
            int pc = (pl + pr) / 2; //중앙 요소의 인덱스
            if (a[pc] == key) {
                return pc; // 검색 성공. 검색할 요솟수와 중앙요소의 인덱스가 같을때
            } else if (a[pc] < key) {
                pl = pc + 1; // 검색 범위를 뒤쪽 절반으로 좁혀감
            } else {
                pr = pc - 1; // 검색 범위를 앞쪽 절반으로 좁혀감
            }
        } while (pl <= pr);
        //검색 실패
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하시오.");

        System.out.print("x[0]:"); // 첫 요소 입력
        x[0] = scanner.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = scanner.nextInt();
            } while (x[i] < x[i - 1]); // 오름차순 입력을 받아야함 바로 앞의 요소보다 작으면 다시 입력
        }

        System.out.print("검색할 값: ");
        int ky = scanner.nextInt();

        int idx = binSearch(x, num, ky); // 배열 x 에서 키 값이 ky 인 요소를 검색.

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println(ky + "는 x[" + idx + "]에 있습니다.");
        }

    }

}
