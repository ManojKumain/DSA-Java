public class hollowDiamond {

    public static void hollowDiamondPattern(int n) {

        // Upper Diamond
        for (int row = 1; row <= n; row++) {

            // Space
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            // Star
            for (int col = 1; col <= 2 * row - 1; col++) {
                int last = 2 * row - 1;
                if (col == 1 || col == last || row == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();

        }

        // Lower Diamond
        for (int row = n - 1; row >= 1; row--) {

            // Space
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            // Star
            for (int col = 1; col <= 2 * row - 1; col++) {
                int last = 2 * row - 1;
                if (col == 1 || col == last || row == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowDiamondPattern(5);
    }
}