package chap01;

import java.util.Scanner;

/*
문제
양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하시오
ex) 123 입력시 그 수는 3자리입니다.
 */

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;//인트타입 변수 선언

        System.out.println("입력한 양의 정수의 자릿수를 구합니다.");

        System.out.println("양의 정수를 입력해주세요. : ");
        num = scanner.nextInt();

        if (num <= 9)//입력 받은 값이 9보다 같거나 작으면 1자리수가 출력이 됩니다.
            System.out.println(num + " 해당 수는 1자리입니다.");
        else if (num > 9 && num <= 99)// && and 연산자를 사용하였습니다 && 의 앞뒤의 조건이 둘다 맞을경우 수행합니다.
            System.out.println(num + " 해당 수는 2자리입니다.");// || or 연산자를 사용할경우 한가지 조건만 충족하여도
        else if (num > 99 && num <= 999)                    // 실행이 되기에 원치않는 결과가 나올수 있습니다.
            System.out.println(num + " 해당 수는 3자리입니다.");// 상황에 맞게 OR,AND 연산자를 잘 활용해보세요!
        else if (num > 999 && num <= 9999)
            System.out.println(num + " 해당 수는 4자리입니다.");

        //자바에서 지원하는 Math 함수를 이용한 방법 주석을 해제하고 실행해 보세요
        System.out.println("해당 수는 "+(int)(Math.log10(num)+1)+"자리 입니다.");
    }
}
