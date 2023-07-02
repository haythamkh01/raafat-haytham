import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        LeagueManager leagueManager = new LeagueManager();
        int userChoice = 0;
        File file = new File("src/teams.csv");
        List<Team> teams = LeagueManager.makeTeams(file);
        while (userChoice != 4) {
            printMenu();
            userChoice = getUserChoice();

            switch (userChoice) {
                case 1:
                    leagueManager.generateLeagueSchedule(teams);
                    break;
                case 2:
                    leagueManager.thingsCanDo();
                    break;
                case 3:
                    leagueManager.calculateTeamStandings(teams);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("League Manager Menu");
        System.out.println("1. Generate League Schedule");
        System.out.println("2. Simulate League Matches");
        System.out.println("3. Calculate Team Standings");
        System.out.println("4. Exit");
        System.out.println("Please enter your choice:");
    }

    public static int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


}