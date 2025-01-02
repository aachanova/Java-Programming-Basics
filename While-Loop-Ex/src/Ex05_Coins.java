import java.util.Scanner;

public class Ex05_Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amount = Double.parseDouble(scanner.nextLine());
        int amountInCents = (int) (amount * 100);
        int coinsCount = 0;

        while (amountInCents > 0) {
            if (amountInCents >= 200) {
                amountInCents -= 200;
                coinsCount++;
            } else if (amountInCents >= 100) {
                amountInCents -= 100;
                coinsCount++;
            } else if (amountInCents >= 50) {
                amountInCents -= 50;
                coinsCount++;
            } else if (amountInCents >= 20) {
                amountInCents -= 20;
                coinsCount++;
            } else if (amountInCents >= 10) {
                amountInCents -= 10;
                coinsCount++;
            } else if (amountInCents >= 5) {
                amountInCents -= 5;
                coinsCount++;
            } else if (amountInCents >= 2) {
                amountInCents -= 2;
                coinsCount++;
            } else if (amountInCents >= 1) {
                amountInCents -= 1;
                coinsCount++;
            }
        }

        System.out.println(coinsCount);
    }
}
