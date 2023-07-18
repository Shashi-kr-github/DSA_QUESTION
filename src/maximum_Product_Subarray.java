public class maximum_Product_Subarray {
    public static void main(String[] args) {
      int [] nums = {3,-1,4};
      System.out.println(max_Product(nums));
    }
    static int max_Product(int [] nums){
        int si = 0;
        int prod = 1;
        int prod2 = 1;
        int max = Integer.MIN_VALUE;
        while(si < nums.length){
            System.out.println("prod-->>"+ prod+"<<==>>"+max);
          if(nums[si] > 0){
             prod = prod * nums[si];
            //  prod2 = prod2 * nums[si];
              prod = Math.max(prod,prod2);
             max = Math.max(prod, max);
          }
          else if(nums[si] == 0){
              if(max < 0){
                  max = 0;
              }
              prod = 1;
              si++;
              continue;
          }
          else{
             // prod = 1;
              prod = prod * nums[si];
              prod2 = prod2 * nums[si];
              System.out.println("==>>"+prod);
              if(nums[si] > prod ){
                  if(si > 0 && nums[si-1] < 0){
                     prod = nums[si] * nums[si-1];
                  }
                  else {
                      prod = nums[si];
                      prod = Math.max(prod,prod2);
                  }
              }
            //  prod2 = prod2 * nums[si];
             // prod = Math.max(prod,prod2);
              max = Math.max(prod , max);

          }

            si++;
        }
        return max;
    }
}
