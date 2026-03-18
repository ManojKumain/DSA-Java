// Create a HashSet and store: 10, 20, 30, 40.

import java.util.HashSet;

public class Challenge1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(10);
        set.add(30);
        set.add(40);
        set.add(20);
        System.out.println(set);
        
        
    }
}