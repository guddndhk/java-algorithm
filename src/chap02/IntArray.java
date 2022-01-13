package chap02;
/*
배열 기본 알고리즘을 알아보자
 */
public class IntArray {
    public static void main(String[] args) {

        //인트 어레이 데이터 타입의 변수 선언 즉 배열의 선언
        int[] a = new int[5];//5개의 배열이 생성됨

        a[1] = 30;// a[1] 에 30 대입
        a[2] = 56;// a[2] 에 56 대입
        a[4] = a[1] * 2; // a[1] *2 즉 30 * 2 = 60

        for (int i = 0; i < a.length; i++) {// a.length 즉 a의 길이를 의미 합니다 여기서 [5] 를 선언 하였기에 5입니다.
            System.out.println("a[" + i + "] = " + a[i] + " 입니다.");
        }

    }
}
