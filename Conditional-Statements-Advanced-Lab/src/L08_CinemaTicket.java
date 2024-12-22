import java.util.Scanner;

public class L08_CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int result = 0;

        switch (day) {
            case "Monday", "Tuesday", "Friday" -> result = 12;
            case "Wednesday", "Thursday" -> result = 14;
            case "Saturday", "Sunday" -> result = 16;
        }

        System.out.println(result);
    }
}
