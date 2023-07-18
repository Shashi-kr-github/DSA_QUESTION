public class minimum_Falling_Path_Sum {
    public static void main(String[] args) {

    }
    static boolean checkValid_Idx(int i,int j , int n, int m ){
        if(i < n && j < m){
            return true;
        }
        return false;
    }
    static int minimum_Sum(int [][] nums){
        int n = nums.length;
        int m = nums[0].length;
        int dp [][] = new int [n][m];
        int minValue = Integer.MIN_VALUE;
        int mi = 0;
        for(int i = 0, j= 0; i < nums.length; i++){
            if(nums[j][i] < minValue){
                minValue = nums[j][i];
                mi = i;
            }
        }
        dp[0][mi] = minValue;

        int r = 0;
        int c = mi;
        while(r < n){
            int x, y,z;
            if(checkValid_Idx(r+1,c-1,n,m)){
                x = nums[r+1][c-1];
            }
        }


        return 0;
    }
}
