
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String fileName = scan.nextLine();

        ArrayList<Match> matches = readFromFile(fileName);
        System.out.println("Team: ");
        String teamName = scan.nextLine();

        ArrayList<Match> matchesOfATeam = new ArrayList<>();
        for (Match match : matches) {

            if (teamName.equals(match.getHomeTeam()) || teamName.equals(match.getVisitorTeam())) {
                matchesOfATeam.add(match);
            }

        }

        System.out.println("Games: " + matchesOfATeam.size());

        ArrayList<Match> winsOfATeam = new ArrayList<>();
        for (Match match : matches) {

            if (teamName.equals(match.getHomeTeam()) && match.getHomeTeamPoints() > match.getVisitorTeamPoints() || teamName.equals(match.getVisitorTeam()) && match.getHomeTeamPoints() < match.getVisitorTeamPoints() ) {
                winsOfATeam.add(match);
            }

        }

        System.out.println("Wins: " + winsOfATeam.size());
        System.out.println("Losses: " + (matchesOfATeam.size() - winsOfATeam.size()));

    }

    public static ArrayList<Match> readFromFile(String fileName) {
        ArrayList<Match> matches = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {

                String[] parts = scanner.nextLine().split(",");
                String homeTeam = parts[0];
                String visitorTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitorTeamPoints = Integer.valueOf(parts[3]);

                matches.add(new Match(homeTeam, visitorTeam, homeTeamPoints, visitorTeamPoints));
            }
        }

        catch (Exception e) {
            System.out.println("File not found");
        }

        return matches;
    }

}
