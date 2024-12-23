import java.util.Scanner;

public class Ex03_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0.0;
        double totalPrice = 0.0;

        switch (flowers) {
            case "Roses" -> {
                price = 5.00;
                if (quantity > 80) {
                    totalPrice = 0.9 * (quantity * price);
                }
            }
            case "Dahlias" -> {
                price = 3.80;
                if (quantity > 90) {
                    totalPrice = 0.85 * (quantity * price);
                }
            }
            case "Tulips" -> {
                price = 2.80;
                if (quantity > 80) {
                    totalPrice = 0.85 * (quantity * price);
                }
            }
            case "Narcissus" -> {
                price = 3.00;
                if (quantity < 120) {
                    totalPrice = 1.15 * (quantity * price);
                }
            }
            case "Gladiolus" -> {
                price = 2.50;
                if (quantity < 80) {
                    totalPrice = 1.20 * (quantity * price);
                }
            }
        }

        if (totalPrice == 0) {
            totalPrice = quantity * price;
        }

        if (budget >= totalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flowers,
                    budget - totalPrice);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", totalPrice - budget);
        }
    }
}
