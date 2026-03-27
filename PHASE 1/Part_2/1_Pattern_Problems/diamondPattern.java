public class diamondPattern {
    public static void diaPattern(int n) {
        for (int row = 1; row <= n; row++) {

            // Space
            for (int col = 1; col <= row; col++) {
                System.out.print("-");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row =1; row <= n; row++) {


        }
    }
}
