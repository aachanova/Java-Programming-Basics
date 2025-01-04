import java.util.Scanner;

public class T05_TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int games = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());
        int points = initialPoints;
        int wins = 0;
        double winsPoints = 0.0;

        for (int i = 0; i < games; i++) {
            String stage = scanner.nextLine();

            switch (stage) {
                case "W" -> {
                    points += 2000;
                    wins++;
                }
                case "F" -> points += 1200;
                case "SF" -> points += 720;
            }
        }

        System.out.printf("Final points: %d%n", points);
        System.out.printf("Average points: %.0f%n", Math.floor((points - initialPoints) * 1.0 / games));
        System.out.printf("%.2f%%", wins * 1.0 / games * 100);
    }
}
