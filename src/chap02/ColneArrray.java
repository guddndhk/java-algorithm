package chap02;

public class ColneArrray {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = a.clone();// .clone() 은 b는 a의 복제를 참조합니다. a.clone(); 즉 a를 복제합니다.

        b[3] = 0; // 한요소 또는 3인덱스만 0을 대입시킴

        System.out.print("a =");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.print("\nb =");// \n 은 개행입니다 \nb라 작성하여 개행합니다.
        for (int i = 0; i < b.length; i++) {
            System.out.print(" " + b[i]);// b 의 3번 인덱스의 값이 0이 출력 되는데 이는 중간에 b[3] = 0;
            // 선언하여 값이 바뀌게 됩니다.
        }
    }
}
