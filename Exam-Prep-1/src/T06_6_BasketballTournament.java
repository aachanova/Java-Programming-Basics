import java.util.Scanner;

public class T06_6_BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().trim();
        int wins = 0;
        int lost = 0;
        int total = 0;

        while (!input.equals("End of tournaments")) {
            String tournamentName = input;
            int gamesCount = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= gamesCount; i++) {
                int teamPoints = Integer.parseInt(scanner.nextLine());
                int otherTeamPoints = Integer.parseInt(scanner.nextLine());

                if (teamPoints > otherTeamPoints) {
                    wins++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", i, tournamentName, teamPoints - otherTeamPoints);
                } else {
                    lost++;
                    System.out.printf("Game %s of tournament %s: lost with %d points.%n", i, tournamentName, otherTeamPoints - teamPoints);
                }
                total++;
            }

            input = scanner.nextLine().trim();
        }
        System.out.printf("%.2f%% matches win%n", wins * 1.0 / total * 100);
        System.out.printf("%.2f%% matches lost", lost * 1.0 / total * 100);
    }
}
