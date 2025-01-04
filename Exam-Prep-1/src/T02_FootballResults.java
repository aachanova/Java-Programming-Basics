import java.util.Scanner;

public class T02_FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wins = 0;
        int lost = 0;
        int drawn = 0;

        for (int i = 1; i <= 3; i++) {
            String result = scanner.nextLine();

            int teamRes = Integer.parseInt(String.valueOf(result.charAt(0)));
            int otherTeamRes = Integer.parseInt(String.valueOf(result.charAt(result.length() - 1)));

            if (teamRes > otherTeamRes) {
                wins++;
            } else if (teamRes < otherTeamRes) {
                lost++;
            } else {
                drawn++;
            }
        }

        System.out.printf("Team won %d games.%n", wins);
        System.out.printf("Team lost %d games.%n", lost);
        System.out.printf("Drawn games: %d", drawn);
    }
}
