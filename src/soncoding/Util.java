package soncoding;

public class Util {
    public int findPrimeCount(int limit) {

        boolean isPrime = false;
        int count = 0;

        for (int i = 2; i <= limit; i++) {
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
//                System.out.println("isPrime = " + isPrime);
                count++;
            }
        }

        return count;
    }

    public int[] findPrimeReturnArray(int limit) {

        int primeCount = this.findPrimeCount(limit);
        int[] prime = new int[primeCount];

        int temp = 0;

        boolean isPrime = false;

        for (int i = 2; i <= limit; i++) {
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                prime[temp] = i;
                temp++;
            }
        }

        return prime;
    }
}
