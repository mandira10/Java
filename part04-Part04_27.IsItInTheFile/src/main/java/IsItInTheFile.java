
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;


public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();


        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner scanner2 = new Scanner(Paths.get(file))) {
            while (scanner2.hasNextLine()) {
                String name = scanner2.nextLine();
                list.add(name);
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + file + "failed.");
        }

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        if (list.contains(searchedFor)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
    }
}
