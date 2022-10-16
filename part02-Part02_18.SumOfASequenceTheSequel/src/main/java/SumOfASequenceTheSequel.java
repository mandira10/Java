
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.println("First number? ");
        int firstInput = Integer.valueOf(scanner.nextLine());

        System.out.println("Last number? ");
        int secondInput = Integer.valueOf(scanner.nextLine());

        while (firstInput <= secondInput) {
            sum = sum + firstInput;
            firstInput++;
        }
        System.out.println("The sum is " + sum);

    }
}
