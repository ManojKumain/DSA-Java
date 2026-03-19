public class Challenge2 {
    
    public static void main(String[] args) {
        int[] arr = {3, 8, 2,10, 5};

        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("largest = " + largest);
    }
}