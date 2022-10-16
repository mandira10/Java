
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int input = Integer.valueOf(scanner.nextLine());

        int factorial = 1;
        while (input != 0) {
            factorial = factorial * input;
            input--;
        }

        System.out.println("Factorial: " + factorial);
    }
}
