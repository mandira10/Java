import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int input = Integer.valueOf(scanner.nextLine());

        printUntilNumber(input);


    }

    public static void printUntilNumber(int input) {
        

        for (int i = 1; i <= input; i++) {
            System.out.println(i);
        }
    }

}
