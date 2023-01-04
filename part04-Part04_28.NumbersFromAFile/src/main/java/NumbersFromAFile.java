
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;


public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList<Integer> list = new ArrayList<Integer>();


        System.out.print("File? ");
        String file = scanner.nextLine();

        try (Scanner scanner2 = new Scanner(Paths.get(file))) {
            while (scanner2.hasNextLine()) {
                list.add(Integer.valueOf(scanner2.nextLine()));
            }
            
        } catch (Exception E) {
            System.out.println("Reading the file " + file + "failed.");
        }

        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            if (Integer.valueOf(list.get(i)) >= lowerBound && Integer.valueOf(list.get(i)) <= upperBound) {
                count++;
            }
        }

        System.out.println("Numbers: " + count);

    }

}
