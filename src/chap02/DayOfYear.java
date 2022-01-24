package chap02;

import java.util.Scanner;

public class DayOfYear {

    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},//평년
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} //윤년
    };

    // (윤년 1/ 평년 0)
    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    // 서기 y년 m월 d일의 그 해 경과 일 수를 구하는 역할
    static int dayOfYear(int y, int m, int d) {
        int days = d; // 일수 day

        for (int i = 1; i < m; i++) {//1월 ~m-1월의 일 수를 더 한다
            days += mdays[isLeap(y)][i - 1];
        }
        return days;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int retry;

        System.out.println("그 해 경과 일수를 구합니다.");

        do {
            System.out.print("년 : ");
            int year = scanner.nextInt();
            System.out.print("월 : ");
            int month = scanner.nextInt();
            System.out.print("일 : ");
            int day = scanner.nextInt();

            System.out.printf("그 해 %d 일째입니다.\n", dayOfYear(year, month, day));

            System.out.print("한번 더 할까요? (1.예/2.아니오) : ");
            retry = scanner.nextInt();
        } while (retry == 1);
    }
}
