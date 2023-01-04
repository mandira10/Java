
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics statistics = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();

        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the
        // exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers,
        // and lastly the one that tracks the sum of odd numbers!

        System.out.println("Enter numbers:");

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            } else if (input % 2 == 0) {
                statistics.addNumber(input);
                statisticsEven.addNumber(input);
            } else {
                statistics.addNumber(input);
                statisticsOdd.addNumber(input);
            }

        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sumof even numbers: " + statisticsEven.sum());
        System.out.println("Sum of odd numbers: " + statisticsOdd.sum());

    }
}
