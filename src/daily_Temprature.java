import java.util.Stack;

public class daily_Temprature {
    public static void main(String[] args) {
      int [] temperatures = {73,74,75,71,69,72,76,73};
      int [] ans = daily_temprature(temperatures);
      display(ans);
    }
    static void display(int [] arr){
        System.out.print("[ ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +",");
        }
        System.out.print("]");
    }
    static int [] daily_temprature(int[] temperatures){
        int n = temperatures.length;
        int res [] = new int[n];
        Stack<Integer> stk = new Stack<>();
        stk.push(n-1);
        res[n-1] = 0;
        for(int i = n-2; i >= 0; i--){

            while(stk.size() > 0 && temperatures[stk.peek()] <= temperatures[i]){
                stk.pop();
            }
            if(stk.size() == 0){
                res[i] = 0;
            }else{
                res[i] = stk.peek();
            }
            stk.push(i);
        }
        int res2 [] = new int[n];
        for(int i = 0; i < n; i++){
            if(res[i] != 0){
                res2[i] = res[i] - i;
            }
            else{
                res2[i] = res[i];
            }
        }

        return res2;
    }
}
