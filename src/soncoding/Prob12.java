package soncoding;

public class Prob12 {
    public static void main(String[] args) {
        String[] arr = {"java program", "array", "java program area", "append"};
        String result = Prob12.replaceString(arr);
        System.out.println("변경된 문자열:" + result);
    }

    public static String replaceString(String[] arr) {

        int sum = 0, max = 0, index = 0;
        String result1;

        for (int i = 0; i < arr.length; i++) {

            sum = 0;

            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'a') {
                    sum++;
                }
            }
            if (sum >= max) {
                max = sum;
                index = i;
            }
        }

        result1 = arr[index].replace('a', 'A');

        return result1;
    }

}
