import java.util.Scanner;

public class Dp_check_No_Palindromic_Substring {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println(no_Of_Palindromic_Substring(s));
    }
    static int no_Of_Palindromic_Substring (String s){
        int res = 0;
        boolean [][] dp = new boolean[s.length()][s.length()];
        for(int g = 0; g < s.length(); g++){
            for(int i = 0,j = g; j < dp.length; i++,j++){
                if(g == 0){
                    dp[i][j] = true;
                    res++;
                }
                else if(g == 1){
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = true;
                        res++;
                    }else{
                        dp[i][j] = false;
                    }
                }
                else{
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == true){
                       dp[i][j] = true;
                       res++;

                    }else{
                        dp[i][j] = false;
                    }
                }

            }
        }

        return res;
    }
}
