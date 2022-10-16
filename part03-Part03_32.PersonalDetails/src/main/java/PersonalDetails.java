
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longest = " ";
        double avg = 0;
        int count = 0;
        int sum = 0;

        while (true) {
            String input = scanner.nextLine();
            String[] pieces = input.split(",");

            if (input.equals("")) {
                break;
            }

            for (int i = 0; i < pieces.length; i++) {
                sum = sum + Integer.valueOf(pieces[1]);
                count++;
                if (longest.length() < pieces[0].length()) {
                    longest = pieces[0];

                }

            }

        }
        avg = 1.0 * sum / count;
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + avg);
    }
}
