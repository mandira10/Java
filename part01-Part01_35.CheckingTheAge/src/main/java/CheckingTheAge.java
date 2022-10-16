
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you? ");
        int age = Integer.valueOf(scan.nextLine());

        if (age > 120 || age < 0) {
            System.out.println("Impossible!");
        }   else {
            System.out.println("OK");
        }





    }
}
