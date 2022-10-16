import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = Integer.valueOf(scanner.nextLine());

        printFromNumberToOne(input);


    }

    public static void printFromNumberToOne(int input) {
        

        while (input != 0) {
            System.out.println(input);
            input--;
        }
    }

}
