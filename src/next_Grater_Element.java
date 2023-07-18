import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class next_Grater_Element {
    public static void main(String[] args) throws Exception {

      int [] nums = {1,3,4,2};
      int [] nums2 = {4,1,2};
      int [] res = next_Grater_Right(nums);
        display(res);

        HashMap<Integer,Integer> obj = new HashMap<>();
        for(int i = 0; i < nums2.length; i++){
            System.out.println("nums[i] =="+nums2[i]);
            System.out.println("res[i]"+res[i]);
            obj.put(nums2[i], res[i]);
        }

        System.out.println(obj);

    }
    static void display(int [] arr){
        System.out.print("[ ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +",");
        }
        System.out.print("]");
    }
    static int[] next_Grater_Right(int nums []){
        int nge [] = new int[nums.length];
        Stack<Integer> stk = new Stack<>();
        stk.push(nums[nums.length-1]);
        nge[nums.length-1] = -1;

        for(int i = nums.length-2; i >= 0; i--){
            while(stk.size() > 0 && nums[i] > stk.peek() ){
                stk.pop();
            }
            if(stk.size() == 0){
                nge[i] = -1;
            }else{
                nge[i] = stk.peek();
            }
            stk.push(nums[i]);
        }
        return nge;

    }


}
