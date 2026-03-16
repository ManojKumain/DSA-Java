// Given an ArrayList: [4, 7, 2, 9, 1]
// Write a program that finds the largest number.

import java.util.ArrayList;

public class Challenge2 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(4);
        num.add(7);
        num.add(2);
        num.add(9);
        num.add(1);

        int largest = num.get(0);
        for(int i = 1; i < num.size(); i++) {
            if (largest < num.get(i)) {
                largest = num.get(i);
            }
        }
        System.out.println("Largest number is: " + largest);
        
    }
}