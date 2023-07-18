public class largest_SQ_matrixOfAll_Once {
    public static void main(String[] args) {
        int arr [][] = {
                {0,1,0,1,0,1},
                {1,0,1,0,1,0},
                {0,1,1,1,1,0},
                {0,0,1,1,1,0},
                {1,1,1,1,1,1}
        };
        System.out.println(largest_Sqr_Matrix(arr));

    }
    static int largest_Sqr_Matrix(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int dp[][] = new int[n][m];
        int max = 1;

        for (int i = 0; i < n; i++) {
            dp[i][0] = arr[i][0];
        }

        for (int j = 0; j < m; j++) {
            dp[0][j] = arr[0][j];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (arr[i][j] == 1) {
                    int x = dp[i - 1][j];
                    int y = dp[i][j - 1];
                    int z = dp[i - 1][j - 1];
                    int res = Math.min(x, Math.min(y, z)) + 1;
                    dp[i][j] = res;
                    max = Math.max(res, max);
                }
            }
        }

        return max;
    }

}
