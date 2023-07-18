public class subArray_Sum_Lessthen_K {
    public static void main(String[] args) {
        int [] nums = {-1,-1,1};
        int k = 1;
       System.out.println(subarraySum(nums, k));


    }
    static int subarraySum(int[] nums, int k) {
        int si = 0;
        int ei = 0;
        int sum = 0;
        int res = 0;

        while(si < nums.length && ei < nums.length){
            sum = sum + nums[ei];

            while(sum > k && si < ei){
                sum = sum - nums[si];
                si++;
            }

            if(sum == k){
                res = res+1;
            }
            ei++;

            if(ei == nums.length-1){
                System.out.println(ei +"<<====>>"+ si+"<<====>>"+ sum);
               sum = sum + nums[ei];
               while(si < ei) {
                   System.out.println(ei +"<<====>>"+ si+"<<==32==>>"+ sum);
                    sum = sum - nums[si];
                    if (sum == k) {
                        System.out.println(ei +"<<==3666==>>"+ si+"<<====>>"+ sum);
                        res = res + 1;
                    }
                   si++;

                }

            }


        }
        return res;

    }
}
