public class leet_Code_153 {

    public static void main(String[] args) {


    }
    public static int find_Minimum(int [] arr){
        int l = 0;
        int h = arr.length-1;

        while(l < h){
            int m = (l+h)/2;

            if(arr[l] > arr[m]){
                if(arr[m-1] > arr[m] && arr[m+1] > arr[m]){
                    return arr[m];
                }
                l = m+1;
            }
            else if(arr[l] < arr[m]){
                if(arr[m-1] > arr[m] && arr[m+1] > arr[m]){
                    return arr[m];
                }
                h = m-1;
            }

        }

        return 0;
    }
}
