public class longest_Increasing_Subsequenc {
    public static void main(String[] args) {
        int nums [] = {10,9,2,5,3,7,101,18};

        System.out.println(Lcs(nums));
    }

    static int Lcs (int nums[]){
        int dp [] = new int [nums.length];
        dp[0] = 1;
        int BIGmAX = 1;
        for(int i = 1; i < dp.length; i++){
            int max = 0;
            for(int j = 0; j < i; j++){
                if(nums[j] > nums[i]){
                    if(dp[j] > max){
                        max = dp[j];
                    }
                }
                dp[i] = max + 1;
                BIGmAX = Math.max(BIGmAX,dp[i]);
            }
        }
        return BIGmAX;
    }
}
