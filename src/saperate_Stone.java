public class saperate_Stone {
    public static void main(String[] args) {
        int arr [] = {0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1};
        //int n = 19;
       int K = 9;
       int N = 17;
//       int N = 5, K = 2;
//        int arr[] = {0,0,0,0,0};
        System.out.println(separateStones(N,K,arr));
        //17 9
        //0 0 1 1 0 1 0 0 1 1 1 1 1 1 0 1 1
    }
    static  int separateStones(int N, int K, int arr[]) {
        int rw = 0;
        int rb = 0;
        int b = 0;
        int w = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                w++;
            }else{
                b++;
            }
        }
        System.out.println(w+"====>>"+ b);
        if( w >= K && w % K == 0){
            rw = w/K;
        }
        else if(w < K && w != 0){
            rw = 1;
        }
        else if(w >= K && w % K != 0){
           // int x = w % K;
            rw = w/K + 1;
           // System.out.println(w/K);
        }
        if(b >= K && b % K == 0){
            rb = b/K;
        }
        else if(b < K && b != 0){
            rb = 1;
        }
        else if(b >= K && b % K != 0){
            //int x = b % K;
            rb = b/K + 1;
        }
        return rw+rb;

    }

}
