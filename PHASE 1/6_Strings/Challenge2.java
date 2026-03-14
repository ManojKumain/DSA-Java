// Write a program to count vowels in a string

// 1. Define a string
// 2. Loop through characates in that string
// 3. Check if a character is a, e, i, o, u.
// 4. Increase counter

public class Challenge2 {
    public static void main(String[] args) {
        String word = "education";
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            
            char ch = word.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("Vowels = " + count);
    }
}