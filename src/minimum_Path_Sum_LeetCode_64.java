public class minimum_Path_Sum_LeetCode_64 {
    public static void main(String[] args) {
      int grid [][] =  {
              {1,2,3},{4,5,6}
//              {1,4,8,6,2,2,1,7},
//              {4,7,3,1,4,5,5,1},
//              {8,8,2,1,1,8,0,1},
//              {8,9,2,9,8,0,8,9},
//              {5,7,5,7,1,8,5,5},
//              {7,0,9,4,5,6,5,6},
//              {4,9,9,7,9,1,9,0}
              };
        System.out.println(minPathSum(grid));
    }
    static int minPathSum(int[][] grid) {
        int n  = grid.length;
        int m = grid[0].length;
        int dp [][] = new int [n][m];
        dp[n-1][m-1] = grid[n-1][m-1];
     //  System.out.println("==>>"+dp[n-1][m-1] +" n ->"+ n +" m ->"+m);

        int j = m-1;
        for(int i = n-2; i >= 0; i-- ){
         //   System.out.println(i+"<<>>"+ j);
         //  System.out.println("24-->>"+grid[i+1][j]);
         //  System.out.println("25-->>"+grid[i][j]);
            dp[i][j] = grid[i][j] + dp[i+1][j];
          //  System.out.println("27-->>"+dp[i][j]);
        }

        int i = n-1;
        for(int k = m-2; k >= 0; k--){
            dp[i][k] = grid[i][k] + dp[i][k+1];
            System.out.println("27-->>"+dp[i][k]);
        }

        for(int k = n-2; k >= 0; k--){
            for(int l = m-2; l >= 0; l--){
                int x = dp[k+1][l];
                int y = dp[k][l+1];
                int min = Math.min(x,y);
                dp[k][l] = grid[k][l] + min;
               // System.out.println("===>"+ dp[k][l]);
            }
        }

       return dp[0][0];
    }
}
