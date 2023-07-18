public class leet_Code_238 {

    public static void main(String[] args) {
     int [] arr = {1,2,3,4};
     int n = arr.length;

     System.out.println(product_Array_Except_Self(arr,n));
    }

    public static  int [] product_Array_Except_Self(int [] arr, int n){
        int left [] = new int[n];
        int right [] = new int [n];
        int res [] = new int [n];
        left[0] = 1;
        right[n-1] = 1;
        for(int i = 1; i < n; i++){
            left[i] = arr[i-1]*left[i-1];
        }
        for(int j = n-2; j >= 0; j--){
            right[j] = arr[j+1] * right[j+1];
        }

        for(int i = 0; i < n; i++){
            res[i] = left[i]*right[i];
            System.out.print(res[i] + ",-----");
        }

        return res;
    }
}
