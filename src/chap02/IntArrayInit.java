package chap02;

public class IntArrayInit {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};// {} 를 이용하여 정수 대입시 배열  a 에 순서대로 초기화된다.
        //int[] a = new int[] {1, 2, 3, 4, 5}; new 연산자로 좀더 명확하게 선언도 가능

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i] + " 입니다.");
        }
    }
}
