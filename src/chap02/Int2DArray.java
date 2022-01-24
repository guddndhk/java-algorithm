package chap02;

/*
2차원 배열 시작.
 */
public class Int2DArray {
    public static void main(String[] args) {
        int[][] x = new int[2][4];

        x[0][1] = 37;
        x[0][3] = 54;
        x[1][2] = 65;

        for (int i = 0; i < 2; i++) { // 최대 20 자리 까지의 인데스 접근
            for (int j = 0; j < 4; j++) {// 최대 4까지의 인덱스 접근
                System.out.println("x[" + i + "][" + j + "] = " + x[i][j]);
                //2 중 for 문을 사용하여 해당 조건들을 모두 출력.
            }
        }
    }
}
