package Array;

import java.util.Arrays;

public class E_59_SpiralMatrix2 {

    public static Integer[][] generateMatrix(int n) {
        Integer[][] result = new Integer[n][n];

        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        for(int x=0,y=0,i=1,d=0; i<=n*n; i++) {
            result[x][y] = i;
            int a = x + dx[d];
            int b = y + dy[d];

            if(a < 0 || a >= n || b < 0 || b >= n || result[a][b] != null) {
                d = (d + 1) % 4;
                a = x + dx[d];
                b = y + dy[d];
            }
            x = a;
            y = b;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        Integer[][] output = new Integer[][]{{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};

        assert Arrays.deepEquals(output, generateMatrix(n));
    }
}
