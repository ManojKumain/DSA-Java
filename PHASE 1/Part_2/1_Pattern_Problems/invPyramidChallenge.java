public class InvPyramidChallenge {

    public static void invPyramid(int n) {

        for (int row = 1; row <= n; row++) {

            // spaces (increase each row)
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(" ");
            }

            // numbers (decrease each row)
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        invPyramid(4);
    }
}