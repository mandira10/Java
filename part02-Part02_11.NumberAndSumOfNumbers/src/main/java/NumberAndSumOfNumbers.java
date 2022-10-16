
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNumbers = 0;
        int sumOfNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                System.out.println("Number of numbers: " + numberOfNumbers);
                System.out.println("Sum of the numbers: " + sumOfNumbers);
                break;

            } else {
                sumOfNumbers = sumOfNumbers + input;
                numberOfNumbers = numberOfNumbers + 1;
            }

        }

    }
}
