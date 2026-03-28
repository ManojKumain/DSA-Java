// Find max element

public class Challenge2 {
    public static void main(String[] args) {
        int[] num = { 1, 4, 6, 40, 8 };

        int max = num[0];

        for (int i = 1; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        System.out.println("The largest number in array is: " + max);
    }
}
