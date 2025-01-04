import java.util.Scanner;

public class T05_5_FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());

        int backCounter = 0;
        int chestCounter = 0;
        int legsCounter = 0;
        int absCounter = 0;
        int shakeCounter = 0;
        int barCounter = 0;

        for (int i = 0; i < people; i++) {
            String action = scanner.nextLine();

            switch (action) {
                case "Back" -> backCounter++;
                case "Chest" -> chestCounter++;
                case "Legs" -> legsCounter++;
                case "Abs" -> absCounter++;
                case "Protein shake" -> shakeCounter++;
                case "Protein bar" -> barCounter++;
            }
        }

        int buyProductsPeople = shakeCounter + barCounter;
        int workOutPeople = people - buyProductsPeople;

        System.out.printf("%d - back%n", backCounter);
        System.out.printf("%d - chest%n", chestCounter);
        System.out.printf("%d - legs%n", legsCounter);
        System.out.printf("%d - abs%n", absCounter);
        System.out.printf("%d - protein shake%n", shakeCounter);
        System.out.printf("%d - protein bar%n", barCounter);

        System.out.printf("%.2f%% - work out%n", workOutPeople * 1.0 / people * 100);
        System.out.printf("%.2f%% - protein", buyProductsPeople * 1.0 / people * 100);
    }
}
