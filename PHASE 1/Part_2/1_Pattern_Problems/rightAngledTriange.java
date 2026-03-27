public class rightAngledTriange {
    
    public static void pattern1(int n){
        for (int row = 1; row <= n; row++){
            for (int col = row; col < 2*row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    

    public static void main(String[] args) {
        pattern1(4);
    }
}
