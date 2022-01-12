package chap01;

import java.util.Scanner;

/*
메소드를 만들어 역 피라미드를 출력하시오.
 */
public class Nspira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇층인지 정수를 써주세요:: ");
        int n = scanner.nextInt();

        nnSpira(n);
    }
    // 두개의 메소드 모두 n = 5 이라고 하겠습니다.
    static void nSpira(int n) {

        for (int i = n; i > 0; i--) {// 5 > 0 는 5,4,3,2,1 로 점점 작아지며 반복됩니다 i-- 연산때문
            for (int j = n-i; j > 0; j--) {//j=5-5 ; 0>0 이므로 출력되지 않습니다. 하지만 i 값은 위에서 반복 될때마다 줄어들기에
                System.out.print(" ");// 두번째 반복시 5-4 이므로 1>0 두번쨰는 1개의 여백이 출력되는 구조입니다.
            }//추가로 설명하면 세번째 반복시 5-3 의 구조로 2>0 j-- 연산자로 2,1>0 두번의 연산으로 2개의 여백이 출력됩니다.
            for (int j = i*2-1; j > 0; j--) {//i=n 이라고 첫번째 for문에 정의 하였습니다. 그러므로 (5*2)-1 이 성립되어
                System.out.print("*");//j는 9가되고 9>0 j-- 서서히 감소하며 총 9번이 출력됩니다.
            }
            System.out.println();
        }
    }
    // 두번째 방법
    static void nnSpira(int n) {

        for (int i = 0; i < n; i++){//i<5 일때 0~4까지 5번 반복됩니다.
            for (int j = n-i ; j < n; j++){// j = 5-0 일때 5 <5 flase 이기에 첫번째 출력하지 않습니다.
                System.out.print(" ");// 두번째 경우 i의 값이 1로 증감되어 5-1 의 성립됩니다. 4<5 맞는 조건으로 1개의 여백이 촐력
            }
            for (int j = (n-i)*2  ; j > 1;j--){//(5-0)*2 = 10 입니다 10 > 1 j-- 10~2까지 9번의 별이 출력됩니다.
                System.out.print("*");// 두번째는 (5-1)*2 = 8 일떄 8 > 1 j-- 8~2 까지 7번이 출력됩니다.
            }
            System.out.println();// 2번3번 for문의 개행
        }
    }
}

