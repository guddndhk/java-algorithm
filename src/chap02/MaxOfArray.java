package chap02;

import java.util.Scanner;

public class MaxOfArray {

    static int maxof(int[] a) {
        int max = a[0];//첫번째 사람의 키값 이 최대일때
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)// 첫번째 즉 0번 인덱스가 max일떄 그보다 크면 해당 값을 max로 바꿔줍니다.
                max = a[i];// 0,1,2,3,4 모두 비교후
        }
        return max;// 최대 값이 출력이 됩니다 다시 메인 으로 돌아가 값을 반환
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.println("사람 수 : ");
        int num = scanner.nextInt();// 정수의 값을 입력 받습니다. ex) 5

        int[] height = new int[num]; //int[] height 에 num 의 값 5를 대입합니다 즉 height 는 5개의 배열이(인덱스)생성
        // 0,1,2,3,4 배열은 항상 0 부터 시작합니다.
        for (int i = 0; i < num; i++) {
            System.out.print("height[" + i + "] :");
            height[i] = scanner.nextInt();//for 문으로 각 height 의 배열에 키의 값을 입력해 줍니다. 총 5번
        }

        System.out.println("최댓값은 " + maxof(height) + "입니다.");// maxof(height) 메소드를 실행 시키며 안에 height 의 값
        //대입 합니다. 그러면 해당 메소드가 키값 인자를 받아 실행됩니다. 실행 후 결과 출력
    }
}

