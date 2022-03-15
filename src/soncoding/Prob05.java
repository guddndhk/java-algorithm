package soncoding;

public class Prob05 {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 15;

        Prob05 prob05 = new Prob05();
        System.out.println("prob05.abs(num1,num2) = " + prob05.abs(num1, num2));

    }

    public int abs(int num1, int num2) {

        int result = 0;
        result = num1 - num2;
        System.out.println("result = " + result);

        if (result < 0) {
            return result * -1;
        }

        return result;
    }
}
