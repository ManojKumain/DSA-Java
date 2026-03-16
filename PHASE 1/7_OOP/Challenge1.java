class Student {
        String name;
        int marks;

        void printDetails() {
            System.out.println("Student: " + name);
            System.out.println("Marks: " + marks);
        }
    }


public class Challenge1 {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Manoj";
        s1.marks = 98;

        s1.printDetails();
    }
    
}