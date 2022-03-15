package soncoding;

public class Prob03 {
    public static void main(String[] args) {
        int[] ia = new int[]{3, 7, 1, 8, 10, 2, 15, 2, 10};
        int[] ib = new int[]{1, 2, 3, 4, 5};

        Prob03 p = new Prob03();
        System.out.println("배열a");
        p.calc(ia);
        System.out.println("배열b");
        p.calc(ib);
    }

    public void calc(int[] ix) {

        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < ix.length; i++) {
            if (ix[i] % 2 == 0) {
                sum += ix[i];
            } else {
                sum2 += ix[i];
            }
        }
        System.out.println("짝sum = " + sum);
        System.out.println("홀sum2 = " + sum2);
    }
}
