
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int number = Integer.valueOf(scan.nextLine());

        if (number < 0) {
            System.out.println("Grade: impossible!");
        } else if (number < 50 && number >= 0) {
            System.out.println("Grade: failed");
        } else if (number < 60 && number >= 50) {
            System.out.println("Grade: 1");
        } else if (number < 70 && number >= 60) {
            System.out.println("Grade: 2");
        } else if (number < 80 && number >= 70) {
            System.out.println("Grade: 3");
        } else if (number < 90 && number >= 80) {
            System.out.println("Grade: 4");
        } else if (number <= 100 && number >= 90) {
            System.out.println("Grade: 5");
        } else if (number > 100) {
            System.out.println("Grade: incredible!");
        }

    }
}
