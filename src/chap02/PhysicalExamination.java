package chap02;
/*
신체검사 데이터용 클래스의 배열에서 평균키와 시력의 분포를 구하라.
 */

import java.util.Scanner;

public class PhysicalExamination {

    static final int VMAX = 21; // 시력의 분포도 (0.0부터 0.1 단위로 21개 구성)

    static class PhyscData {
        String name;    // 이름
        int height;     //  키
        double vision;  // 시력

        //constructor 생성자
        PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    // 키의 평균값 메서드
    static double aveHeight(PhyscData[] dat) {
        double sum = 0;

        for (int i = 0; i < dat.length; i++) {
            sum += dat[i].height;
        }
        return sum / dat.length;
    }

    // 시력 분포도 메서드
    static void distVision(PhyscData[] dat, int[] dist) {
        int i = 0;

        dist[i] = 0;
        for (i = 0; i < dat.length; i++) {
            if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
                dist[(int) (dat[i].vision * 10)]++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("김민수", 162, 0.3),
                new PhyscData("김2수", 173, 0.3),
                new PhyscData("김3수", 175, 2.0),
                new PhyscData("김4수", 171, 1.5),
                new PhyscData("김5수", 168, 0.4),
                new PhyscData("김6수", 174, 1.2),
                new PhyscData("김7수", 169, 0.8)
        };
        int[] vdist = new int[VMAX]; // 시력의 분포

        System.out.println("신체검사 리스트");
        System.out.println("이름      키   시력");
        System.out.println("-------------------");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
            System.out.printf("\n 평균 키 : %5.1fcm\n", aveHeight(x));
        }
        distVision(x, vdist); // 시력의 분포를 구함

        System.out.println("\n시력 분포");
        for (int i = 0; i < VMAX; i++) {
            System.out.printf("%3.1f~ :", i / 10.0);
            //System.out.println(i / 10.0, vdist[i]);기존은
            for (int j = 0; j < vdist[i];j++){
                System.out.print("*");// 인원대신 * 로 인원수 출력
            }
            System.out.println();
        }
    }
}
