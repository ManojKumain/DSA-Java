import java.util.HashMap;

public class Challenge2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4};

        HashMap <Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if(freq.containsKey(num)) {
                freq.put(num, freq.get(num) + 1);
            } else {
                freq.put(num, 1);
            }
        }
        System.out.println(freq);
    }
}