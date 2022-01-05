package chap01;

import java.util.Scanner;

public class JudgeSign {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력해주세요.");
        int n = scanner.nextInt();

        if (n > 0)
            System.out.println("이 수는 양수입니다.");
        else if (n < 0)
            System.out.println("이 수는 음수입니다.");
        else
            System.out.println("이 수는 0 입니다.");
        /*
        else if (n == 0)
            System.out.println("이 수는 0 입니다.");

        else 부분을 해당 주석의 코드처럼 작성 할 수 도 있습니다.
        하지만 위의 작성된 코드가 더욱 간결하고 가독성 또한 좋기에 위처럼 클린한 코드를 개인적으로 추천합니다.
        알고리즘에 답은 없습니다 원하는 결과만 잘 나오면 되는 것 이지요 다만
        코드의 가독성 및 효율성은 다를 수 있습니다.
         */

    }
}
