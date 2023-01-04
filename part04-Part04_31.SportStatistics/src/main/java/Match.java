
public class Match {

    private String homeTeam;
    private String visitorTeam;
    private int homeTeamPoints;
    private int visitorTeamPoints;

    public Match(String homeTeam, String visitorTeam, int homeTeamPoints, int visitorTeamPoints) {
        this.homeTeam = homeTeam;
        this.visitorTeam = visitorTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitorTeamPoints = visitorTeamPoints;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public int getHomeTeamPoints() {
        return homeTeamPoints;
    }

    public String getVisitorTeam() {
        return visitorTeam;
    }

    public int getVisitorTeamPoints() {
        return visitorTeamPoints;
    }



}
