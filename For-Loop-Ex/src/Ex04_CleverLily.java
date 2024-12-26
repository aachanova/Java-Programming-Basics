import java.util.Scanner;

public class Ex04_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        double money = 0.0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                money += (i * 5) - 1;
            } else {
                money += toyPrice;
            }
        }

        if (money >= price) {
            System.out.printf("Yes! %.2f", money - price);
        } else {
            System.out.printf("No! %.2f", price - money);
        }
    }
}
