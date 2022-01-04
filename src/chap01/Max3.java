package chap01;

import java.util.Scanner;

class Max3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.print("a의 값 : "); int a = scanner.nextInt();
        System.out.print("b의 값 : "); int b = scanner.nextInt();
        System.out.print("c의 값 : "); int c = scanner.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("최댓값은 " + max + "입니다.");
    }

}
