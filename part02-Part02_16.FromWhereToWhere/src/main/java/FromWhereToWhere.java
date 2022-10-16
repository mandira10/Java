
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        System.out.println("Where to? " );
        int firstInput = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Where from? ");
        int secondInput = Integer.valueOf(scanner.nextLine());

       

        while (secondInput <= firstInput) {
            System.out.println(secondInput);
            secondInput++;
        }
    }
}
