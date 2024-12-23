import java.util.Scanner;

public class Ex09_SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String rate = scanner.nextLine();
        double pricePerDay = 0.0;
        double totalPrice = 0.0;

        switch (roomType) {
            case "room for one person" -> {
                pricePerDay = 18.0;
                totalPrice = (days - 1) * pricePerDay;
            }
            case "apartment" -> {
                pricePerDay = 25.0;
                totalPrice = (days - 1) * pricePerDay;
                if (days < 10) {
                    totalPrice -= 0.3 * totalPrice;
                } else if (days >= 10 && days <= 15) {
                    totalPrice -= 0.35 * totalPrice;
                } else {
                    totalPrice -= 0.50 * totalPrice;
                }
            }
            case "president apartment" -> {
                pricePerDay = 35.0;
                totalPrice = (days - 1) * pricePerDay;
                if (days < 10) {
                    totalPrice -= 0.1 * totalPrice;
                } else if (days >= 10 && days <= 15) {
                    totalPrice -= 0.15 * totalPrice;
                } else {
                    totalPrice -= 0.20 * totalPrice;
                }
            }
        }

        if (rate.equals("positive")) {
            totalPrice += 0.25 * totalPrice;
        } else if (rate.equals("negative")) {
            totalPrice -= 0.10 * totalPrice;
        }

        System.out.printf("%.2f", totalPrice);
    }
}
