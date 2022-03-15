package soncoding;

public class Prob06 {
    public static void main(String[] args) {

        int[] array = {3, 24, 1, 55, 17, 43, 5};

        for (int i = 0; i < array.length - 1; i++) {
            for (int k = 0; k < array.length - 1; k++) {

                int temp1 = array[k];
                int temp2 = array[k + 1];

                if (array[k] > array[k + 1]) {
                    array[k] = temp2;
                    array[k + 1] = temp1;
                }
            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
}
