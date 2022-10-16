
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] pieces = input.split(" ");

            if (input.equals("")) {
                break;
            }

            System.out.println(pieces[0]);

        }
    }
}