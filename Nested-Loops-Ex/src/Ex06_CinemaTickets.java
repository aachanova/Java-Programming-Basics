import java.util.Scanner;

public class Ex06_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int totalTickets = 0;
        int standardCounter = 0;
        int studentCounter = 0;
        int kidCounter = 0;

        while (!input.equals("Finish")) {
            String movie = input;
            int seatsCount = Integer.parseInt(scanner.nextLine());

            int soldTickets = 0;
            String ticketsType = scanner.nextLine();

            while (!ticketsType.equals("End") && !ticketsType.equals("Finish")) {

                switch (ticketsType) {
                    case "standard" -> standardCounter++;
                    case "student" -> studentCounter++;
                    case "kid" -> kidCounter++;
                }

                soldTickets++;

                if (soldTickets >= seatsCount) {
                    break;
                }

                ticketsType = scanner.nextLine();
            }

            double totalPercent = soldTickets * 1.0 / seatsCount * 100;
            System.out.printf("%s - %.2f%% full.%n", movie, totalPercent);

            totalTickets += soldTickets;
            input = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentCounter * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardCounter * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", kidCounter * 1.0 / totalTickets * 100);
    }
}
