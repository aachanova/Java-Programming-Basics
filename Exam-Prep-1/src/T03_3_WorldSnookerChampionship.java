import java.util.Scanner;

public class T03_3_WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stage = scanner.nextLine();
        String ticketsType = scanner.nextLine();
        int ticketsCount = Integer.parseInt(scanner.nextLine());
        char picture = scanner.nextLine().charAt(0);
        double ticketPrice = 0.0;

        switch (stage) {
            case "Quarter final" -> {
                switch (ticketsType) {
                    case "Standard" -> ticketPrice = 55.50;
                    case "Premium" -> ticketPrice = 105.20;
                    case "VIP" -> ticketPrice = 118.90;
                }
            }
            case "Semi final" -> {
                switch (ticketsType) {
                    case "Standard" -> ticketPrice = 75.88;
                    case "Premium" -> ticketPrice = 125.22;
                    case "VIP" -> ticketPrice = 300.40;
                }
            }
            case "Final" -> {
                switch (ticketsType) {
                    case "Standard" -> ticketPrice = 110.10;
                    case "Premium" -> ticketPrice = 160.66;
                    case "VIP" -> ticketPrice = 400;
                }
            }
        }

        double price = ticketsCount * ticketPrice;

        if (picture == 'Y' && price <= 2500) {
            price += ticketsCount * 40;
        }

        if (price > 2500 && price <= 4000) {
            price -= 0.10 * price;

            if (picture == 'Y') {
                price += ticketsCount * 40;
            }

        } else if (price > 4000) {
            price -= 0.25 * price;
        }

        System.out.printf("%.2f", price);
    }
}
