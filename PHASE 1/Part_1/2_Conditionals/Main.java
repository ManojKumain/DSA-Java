public class Main {

    public static void main(String[] args) {
        int temprature = 25;
        if (temprature > 30) {
            System.out.println("Weather is Hot" );
        }
        else if (temprature > 20 && temprature < 30) {
            System.out.println("Weather is Pleasant");
        }
        else {
            System.out.println("Weather is Cold");
        }
    }
}