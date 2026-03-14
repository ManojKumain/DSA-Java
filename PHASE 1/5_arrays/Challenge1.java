// Write a Java Program that finds the sum of all elements in an array.

// THIS IS MY SOLUTION
// public class challenge1 {

//     public static void main(String[] args) {
//         int[] array = { 5, 10, 15, 20 };
//         int sum = 0;
//         for (int i = 0; i < array.length; i++) {
//             sum = sum + array[i];
//             System.out.println(sum);
//         }
//         ;
//     }
// }

// THIS IS CHATGPT SOLUTION
public class Challenge1 {

    public static void main(String[] args) {

        int[] array = {5,10,15,20};
        int sum = 0;

        for(int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        System.out.println("Sum = " + sum);
    }
}