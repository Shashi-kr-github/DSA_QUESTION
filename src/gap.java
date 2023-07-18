public class gap {
    public static void main(String[] args) {
        int [][] arr = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
        for(int g = 0; g < arr.length; g++){
            for(int i = g, j = g; j < arr.length; j++){

                System.out.print(i+""+j+"<<-->>");
            }
            System.out.println();
        }
    }
}
