
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberOfPositiveNumbers = 0;
        double sumOfNumbers = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (numberOfPositiveNumbers == 0 && input == 0) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (input > 0) {
                sumOfNumbers = sumOfNumbers + input;
                numberOfPositiveNumbers = numberOfPositiveNumbers + 1;
            } else if (input == 0) {
                System.out.println((sumOfNumbers / numberOfPositiveNumbers));
                break;
            }

        }

    }
}
