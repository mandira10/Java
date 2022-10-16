
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberOfNumbers = 0;
        double sumOfNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                System.out.println("Average of the numbers: " + (sumOfNumbers / numberOfNumbers));
                break;

            } else {
                sumOfNumbers = sumOfNumbers + input;
                numberOfNumbers = numberOfNumbers + 1;
            }

        }

    }
}
