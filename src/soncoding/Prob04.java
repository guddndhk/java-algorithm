package soncoding;

public class Prob04 {
    public static void main(String[] args) {

//        int n = 5;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = (n - i); j < n; j++) {
//                System.out.print(" ");
//            }
//            for (int j = (n - i) * 2; j > 1; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }

        int num = 5;
        int i = 0;

        while (i < num) {
            for (int j = 0; j < num; j++) {
                if (j < i / 2) {
                    System.out.print(" ");
                } else if (j >= num - i / 2) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            i += 2;
        }
    }

}
