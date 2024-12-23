import java.util.Scanner;

public class Ex07_HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double studioPrice = 0.0;
        double apartPrice = 0.0;

        switch (month) {
            case "May", "October" -> {
                studioPrice = 50;
                apartPrice = 65;

                if (days > 7 && days <= 14) {
                    studioPrice -= 0.05 * studioPrice;
                } else if (days > 14) {
                    studioPrice -= 0.30 * studioPrice;
                }
            }
            case "June", "September" -> {
                studioPrice = 75.20;
                apartPrice = 68.70;

                if (days > 14) {
                    studioPrice -= 0.20 * studioPrice;
                }
            }
            case "July", "August" -> {
                studioPrice = 76;
                apartPrice = 77;
            }
        }

        if (days > 14) {
            apartPrice -= 0.10 * apartPrice;
        }

        System.out.printf("Apartment: %.2f lv.%n", days * apartPrice);
        System.out.printf("Studio: %.2f lv.", days * studioPrice);
    }
}
