import java.util.Scanner;

public class T04_4_Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String player = scanner.nextLine();
        String input = scanner.nextLine();

        int startPoints = 301;
        int success = 0;
        int fail = 0;
        boolean isWin = false;

        while (!input.equals("Retire")) {
            String field = input;
            int points = Integer.parseInt(scanner.nextLine());

            switch (field) {
                case "Double" -> points *= 2;
                case "Triple" -> points *= 3;
            }

            startPoints -= points;

            if (startPoints < 0) {
                fail++;
                startPoints += points;
            } else if (startPoints > 0) {
                success++;
            } else {
                success++;
                isWin = true;
                break;
            }

            input = scanner.nextLine();
        }

        if (isWin) {
            System.out.printf("%s won the leg with %d shots.", player, success);
        } else {
            System.out.printf("%s retired after %d unsuccessful shots.", player, fail);
        }
    }
}
