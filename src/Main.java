// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //int arr [][] = {{1,7,2,5},{5,12,3,6},{100,9,23,16},{16,4,5,9}};
        int arr [][] = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int m = arr.length-1;
        int n = arr[0].length-1;
        System.out.println(n+"==>>"+m);
        System.out.println(maximum_Cost(arr,m,n));

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

    };

    static int maximum_Cost(int [][] arr,int m,int n) {
        int res = 0;
        int i = n;
        int j = m;
        boolean boundry_i = false;
        boolean boundet_j = false;
        int sum = arr[i][j];

        while(i >  0  && j > 0){
           // System.out.println(sum+"==>>"+i+"==>>"+j);
           int val1 = arr[i-1][j];
           int val2 = arr[i][j-1];
           if(val1 >=val2){
               i = i-1;
               sum = sum + val1;
           }
           else{
               j = j-1;
               sum = sum + val2;
           }

        }
      //  System.out.println((i +"<<<===ggggg===>>>"+j));
        while(i > 0){
            sum = sum + arr[i-1][j];
            i--;
        }
        while(j > 0){
           sum = sum + arr[i][j-1];
           j--;
        }

     return sum;
    }
}