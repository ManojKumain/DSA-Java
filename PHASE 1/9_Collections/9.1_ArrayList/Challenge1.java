// Create an ArrayList storing numbers: 5, 10, 15, 20
// Loop through the list and print each number

import java.util.ArrayList;

public class Challenge1 {

    public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(10);
    numbers.add(15);
    numbers.add(20);
    for (int i = 0; i < numbers.size(); i++){
        System.out.println(numbers.get(i));
    }
    }
}