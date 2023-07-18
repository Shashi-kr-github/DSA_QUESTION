public class find_Maximum_Dimesional_SqureMatrix {

        public static int largestSubarrayLength(int[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;

            int[][] dp = new int[rows][cols];
            int maxLength = 0;

            // Copy the first row and first column from the input matrix to dp matrix
            for (int i = 0; i < rows; i++) {
                dp[i][0] = matrix[i][0];
                maxLength = Math.max(maxLength, dp[i][0]);
            }

            for (int j = 0; j < cols; j++) {
                dp[0][j] = matrix[0][j];
                maxLength = Math.max(maxLength, dp[0][j]);
            }

            // Compute the dp matrix
            for (int i = 1; i < rows; i++) {
                for (int j = 1; j < cols; j++) {
                    if (matrix[i][j] == 1) {
                        dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                        maxLength = Math.max(maxLength, dp[i][j]);
                    }
                }
            }

            return maxLength;
        }

        public static void main(String[] args) {
            int[][] matrix = {
                    {0,1},
                    {1,0}
//                    {1, 1, 1, 1, 1},
//                    {1, 1, 1, 0, 0},
//                    {1, 1, 1, 0, 0},
//                    {1, 1, 1, 0, 0},
//                    {1, 1, 1, 1, 1}
            };

            int largestLength = largestSubarrayLength(matrix);
            System.out.println("Largest length of 2D subarray of ones: " + largestLength);
        }


}
