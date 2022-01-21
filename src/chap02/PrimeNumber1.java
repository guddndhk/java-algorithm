package chap02;

/*
1000 이하의 소수를 열거하시오. 소수란 자신과 1이외의 어떠한 정수로도 나뉘어 지지 않는 수 를 뜻 합니다.
 */
public class PrimeNumber1 {
    public static void main(String[] args) {
        int counter = 0;

        for (int n = 2; n <= 1000; n++) {
            int i;
            for (i = 2; i < n; i++) {// n이 7 이면 i 는 2 부터 점점 증가하며 올라간 정수들로 한번씩 n를 나누어봅니다.
                counter++;
                if (n % i == 0) // 여기에서 0 으로 나뉘어 떨어지면 소수가 아닙니다.
                    break;// 더이상의 반복은 불필요 하기에 브레이크 해줍니다.
            }
            if (n == i) // 마지막까지 나뉘어 떨어지지 않을때
                System.out.println(n);
        }

        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
}
