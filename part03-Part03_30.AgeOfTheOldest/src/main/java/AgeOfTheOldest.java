
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;

        while (true) {
            String input = scanner.nextLine();
            String[] pieces = input.split(",");

            if (input.equals("")) {
                break;
            }

            

            for (int i = 0; i < pieces.length; i++) {
                if (oldest < Integer.valueOf(pieces[1])) {
                    oldest = Integer.valueOf(pieces[1]);
                }
            }

            System.out.println("Name of the oldest: " + oldest);
        }
    }
}
