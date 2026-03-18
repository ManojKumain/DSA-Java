// This is my wrong code which is wrong

// import java.util.HashSet;

// public class Challenge2 {
//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 2, 3, 4, 4, 5 };

//         HashSet<Integer> set = new HashSet<>();

//         for (int i = 0; i < arr.length; i++){
//             int num = arr[i];

//             if(set.contains(num)) {
//                 return;
//             } else {
//                 set.add(num);
//             }
//         }
//         System.out.println(set.size());
//     }
// }


// This is the right code"


import java.util.HashSet;

public class Challenge2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num); // duplicates automatically ignored
        }

        System.out.println(set.size());
    }
}