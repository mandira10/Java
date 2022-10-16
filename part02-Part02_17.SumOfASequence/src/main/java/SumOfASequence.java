
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.println("Last number? ");
        int input = Integer.valueOf(scanner.nextLine());

        int i = input;
        while (i != 0) {
            sum = sum + i;
            i--;
        }
        System.out.println("The sum is " + sum);
    }
}
