
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here

        Scanner reader = new Scanner(System.in);

        System.out.println("Password?");
        String input = reader.nextLine();

        if (input.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
