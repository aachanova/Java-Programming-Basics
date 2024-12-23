import java.util.Scanner;

public class Ex05_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        String type = "";
        double price = 0.0;

        if (budget <= 100) {
            destination = "Bulgaria";
            switch (season) {
                case "summer" -> {
                    type = "Camp";
                    price = 0.3 * budget;
                }
                case "winter" -> {
                    type = "Hotel";
                    price = 0.7 * budget;
                }
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            switch (season) {
                case "summer" -> {
                    type = "Camp";
                    price = 0.4 * budget;
                }
                case "winter" -> {
                    type = "Hotel";
                    price = 0.8 * budget;
                }
            }
        } else {
            destination = "Europe";
            type = "Hotel";
            price = 0.9 * budget;
        }

        System.out.printf("Somewhere in %s\n", destination);
        System.out.printf("%s - %.2f", type, price);
    }
}
