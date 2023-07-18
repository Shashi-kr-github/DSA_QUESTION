public class Is_CbNumber {
        public static void main(String[] args) {
            String num = "692239";
            print_Substring_pattern(num);
        }

        static void print_Substring_pattern(String s){
            int i = 0;
            int c = 1;
            int j = i+c;
            while(c < s.length()){
                //System.out.println(c);
                if(j > s.length()){
                    c = c +1;
                    i = 0;
                    j = i+c;
                    // System.out.println("jkfkgdfk");
                }
                String s1 = s.substring(i,j);
                i++;
                j++;
                System.out.println(s1);

                // System.out.println(s1+"==="+i+"<<>>"+j+"<<=======>>"+c);
            }
        }
        static boolean is_Visites (boolean [] vist, int i, int j){
            for(int k = i; k <= j; k++){
                if(vist[k] == true){
                    return false;
                }
            }
            return true;
        }

    }

