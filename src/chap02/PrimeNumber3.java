package chap02;

/*
소수 구하기 3번째 방법.
 */
public class PrimeNumber3 {
    public static void main(String[] args) {
        int counter = 0;            //곱셈 , 나눗셈의 횟수
        int ptr = 0;                //찾은 소수의 개수
        int[] prime = new int[500]; // 소수를 저장하는 배열

        prime[ptr++] = 2;
        prime[ptr++] = 3;   // 5부터 시작 하기위해 2,3 소수를 미리 배열에 대입

        for (int n = 5; n <= 1000; n += 2) {
            boolean flag = false;
            for (int i = 1; prime[i] * prime[i] <= n; i++) {
                counter += 2;
                if (n % prime[i] == 0) {// 앞전과 같이 나누어 떨어지면 소수가 아닙니다.
                    flag = true;
                    break;
                }
            }
            if (!flag) {         // 마지막까지 나누어 떨어지지 않으면 소수 즉 배열에 저장.
                prime[ptr++] = n;
                counter++;
            }
        }

        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }
        System.out.println("곱셈과 나눗셈을 수행한 횟수 : " + counter);
    }
}
