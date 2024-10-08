import java.util.Scanner;

public class Ex02_BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if (score <= 100) {
            bonus = 5;
        } else if (score < 1000) {
            bonus = 0.2 * score;
        } else {
            bonus = 0.1 * score;
        }

        if (score % 2 == 0) {
            bonus += 1;
        }

        if (score % 10 == 5) {
            bonus += 2;
        }

        System.out.println(bonus);
        System.out.println(score + bonus);
    }
}

