public class number_Of_LongestIncreasing_Subsequence {
    public static void main(String[] args) {

    }
    static int No_Of_Lcs (int [] nums){
        int n = nums.length;
        int dp [] = new int[n];
        dp[0] = 1;
        for(int i = 1; i < n; i++){
            int max = 0;
            for(int j = 0; j < i; j++){
                if(nums[j] > nums[i]){

                }
            }
        }
        return n;

    }
}
