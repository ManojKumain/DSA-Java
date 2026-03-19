public class Pattern {

    // 1. Increasing Triangle Pattern
    // public static void increasingTriangle(int n) {

    //     for (int row = 1; row <= n; row++){
    //         for (int col = 1; col <= row; col ++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    
    // 2. Decreasing Triangle Pattern
      // public static void decreasingTriangle(int n) {

    //     for (int row = 1; row <= n; row++){
    //         for (int col = n; col >= row; col--){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }


    // 3. Right-Aligned triangle

    public static void rightAlignedTriangle(int n) {
        for (int row = 1; row <= n; row ++) {
            for (int space = 1; space <= n - row; space++){
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // 4. Pyramid

    // public static void pyramid(int n){
    //     for (int row = 1; row <= n; row++) {
    //         for (int space = n; space > row; space--){
    //             System.out.print(" ");
    //         }
    //         for (int star = 1; star <= 2 * row - 1 ; star++){
    //             System.out.print("*");
    //         }
            
    //         System.out.println();
    //     }
    // }

    // 5. Inverted Pyramid

    public static void invPyramid(int n) {
        for (int row = 1; row <= n; row++){

            // Spaces
            for (int col = 1; col < row - 1; col++){
                System.out.print(" ");
            }

            // Star
            for (int col = 1; col <= 2 * (n -row) + 1; col++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // increasingTriangle(5);
        // decreasingTriangle(5);
        // rightAlignedTriangle(5);
        // pyramid(4);
        invPyramid(5);
    }
}