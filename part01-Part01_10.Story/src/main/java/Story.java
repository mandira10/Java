
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("I will tell you a story, but I need some information first."); 
        System.out.println("What is the main character called?");
        String first = scanner.nextLine();

        System.out.println("What is their job?");
        String second = scanner.nextLine();

        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + first + ", who was " + second + ".");
        System.out.println("On the way to work, " + first + " reflected on life.");
        System.out.println("Perhaps " + first + " will not be " + second + " forever.");

    }
}
