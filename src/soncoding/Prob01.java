package soncoding;


public class Prob01 {
    public static void main(String[] args) {
        int limit = 67;
        Util util = new Util();

        int primeCount = util.findPrimeCount(limit);
        System.out.println("limit = " + limit + "primeCount = " + primeCount);

        int[] primeArray = util.findPrimeReturnArray(limit);

        for (int i = 0; i < primeArray.length; i++) {
            System.out.print(primeArray[i] + ((primeArray.length - 1) != i ? "," : ""));
        }
    }
}

