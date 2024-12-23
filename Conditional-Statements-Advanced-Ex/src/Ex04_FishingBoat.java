import java.util.Scanner;

public class Ex04_FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        switch (season) {
            case "Spring" -> price = 3000;
            case "Summer", "Autumn" -> price = 4200;
            case "Winter" -> price = 2600;
        }

        if (fishermen <= 6) {
            price = 0.9 * price;
        } else if (fishermen >= 7 && fishermen <= 11) {
            price = 0.85 * price;
        } else {
            price = 0.75 * price;
        }

        if (fishermen % 2 == 0 && !season.equals("Autumn")) {
            price = 0.95 * price;
        }

        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", budget - price);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", price - budget);
        }
    }
}
