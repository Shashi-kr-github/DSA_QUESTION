public class leet_Code_35 {
    public static void main(String[] args) {
        int nums [] = {1,3};
        int target = 1;
        int x = searchInsert(nums,target);
        System.out.println(x);
    }
    public static int searchInsert(int[] nums, int target) {
        int l = 0;
        int h =  nums.length;
        if(target > nums[h-1]){
            return h;
        }
        if(target < nums[l]){
            return l;
        }
        int m = 0;

        while(l < h)
        {
            m = (l+h)/2;
            if(nums[m] == target)
            {
                return m;
            }
            else if(nums[m] > target)
            {
                h = m-1;
            }
            else
            {
                l = m+1;
            }
            //System.out.println(h+"<<<=====>>>"+l+"====="+m);
        }
        if(l== h && nums[l] < target){
            return l+1;
        }
        if(nums[m] < target){
            return m+1;
        }
        else{
            if(m > 0){
                if(nums[m-1] >= target){
                    return  m-1;
                }
            }
            return m;
        }


    }
}
