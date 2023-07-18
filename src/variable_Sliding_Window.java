public class variable_Sliding_Window {
    public static void main(String[] args) {
        int arr [] = {1,2,3};
        int target = 0;
        System.out.println(product_lessthen_K(arr,target));
    }

    static int product_lessthen_K (int []arr, int k){
        int sp = 0;
        int ep = 0;
        int c = 1;
        int res = 0;

        while(ep < arr.length){
            // grow
            c = c*arr[ep];
            // srink
            while(c >= k && sp <= ep){
                c = c/arr[sp];
                sp++;
            }
            // calculate answer
            System.out.println("===>>"+ res);
            res = res + (ep-sp)+1;
            ep++;
        }
        return res;
    }
}
