package chap02;

/*
소수 구하기 개선버전.
 */
public class PrimeNumber2 {
    public static void main(String[] args) {
        int counter = 0;                // 나눗셈 횟수를 카운터에 저장
        int ptr = 0;                    // 찾은 소수의 개수
        int[] prime = new int[500];     // 소수를 저장하는 배열

        prime[ptr++] = 2;               //prime[ptr++] = 2 은 ptr은 1이 되고 prime[] 에 하나의 소수가 들어갑니다.

        for (int n = 3; n <= 1000; n += 2) {// 2는 사전에 넣어 두었으니 3부터 시작하고 +2 씩 하여 홀수만 대상으로 합니다.
            int i;
            for (i = 1; i < ptr; i++) {// 찾은 소수의 개수 만큼 반복합니다. 첫번째는 1 입니다. 첫번째 반복 1<1 은 성립 되지않습니다.
                counter++;
                if (n % prime[i] == 0)// n = 홀수 값 % 찾은 소수로 나누어 봅니다 맞아 떨어지면 소수가 아닙니다.
                    break;
            }
            if (ptr == i) // 마지막까지 나누어지지 않을때
                prime[ptr++] = n; // 소수라고 배열에 저장되고 ptr 즉 찾은 소수 의 개수는 올라갑니다.
        }

        for (int i = 0; i < ptr; i++) {// 찾은 소수의 개수 만큼 반복 합니다.
            System.out.println(prime[i]);// 저장한 배열의 소수들을 출력합니다.
        }

        System.out.println("나눈셈을 수행한 횟수 : " + counter);// 1버전 보다 훨씬 적은 수행 횟수를 확인 할 수 있습니다.
    }
}
