class Rectangle {

    int length;
    int width;

    int area() {
        return length * width;
    }
}

public class Challenge2 {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        r1.length = 5;
        r1.width = 10;
        int result = r1.area();
        System.out.println("Area = " + result);
    }
}