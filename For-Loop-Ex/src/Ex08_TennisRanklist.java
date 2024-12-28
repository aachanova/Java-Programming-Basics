import java.util.Scanner;

public class Ex08_TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sets = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());
        int points = startPoints;
        int winsCounter = 0;

        for (int i = 0; i < sets; i++) {
            String state = scanner.nextLine();

            switch (state) {
                case "W" -> {
                    points += 2000;
                    winsCounter++;
                }
                case "F" -> points += 1200;
                case "SF" -> points += 720;
            }
        }

        System.out.printf("Final points: %d%n", points);
        System.out.printf("Average points: %.0f%n", Math.floor((points - startPoints) * 1.0 / sets));
        System.out.printf("%.2f%%", winsCounter * 1.0 / sets * 100);
    }
}
