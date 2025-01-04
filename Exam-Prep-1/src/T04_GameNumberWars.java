import java.util.Scanner;

public class T04_GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String player1 = scanner.nextLine();
        String player2 = scanner.nextLine();

        int pointsFirst = 0;
        int pointsSecond = 0;
        boolean isOver = false;

        String input = scanner.nextLine();

        while (!input.equals("End of game")) {
            int cardFirst = Integer.parseInt(input);
            int cardSecond = Integer.parseInt(scanner.nextLine());

            if (cardFirst > cardSecond) {
                pointsFirst += cardFirst - cardSecond;
            } else if (cardSecond > cardFirst) {
                pointsSecond += cardSecond - cardFirst;
            } else {
                System.out.println("Number wars!");
                isOver = true;

                int cardFirstPlayer = Integer.parseInt(scanner.nextLine());
                int cardSecondPlayer = Integer.parseInt(scanner.nextLine());

                if (cardFirstPlayer > cardSecondPlayer) {
                    System.out.printf("%s is winner with %d points", player1, pointsFirst);
                } else {
                    System.out.printf("%s is winner with %d points", player2, pointsSecond);
                }

                break;
            }

            input = scanner.nextLine();
        }

        if (!isOver) {
            System.out.printf("%s has %d points%n", player1, pointsFirst);
            System.out.printf("%s has %d points", player2, pointsSecond);
        }
    }
}
