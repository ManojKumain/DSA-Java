import java.util.HashMap;

public class Challenge1 {
    public static void main(String[] args) {
        HashMap<String, String> list = new HashMap<>();
        list.put("India", "Delhi");
        list.put("USA", "Washington");
        list.put("Japan", "Tokyo");

        String indiaCapital = list.get("India");
        System.out.println("Capital of India is: " + indiaCapital);
    }

}