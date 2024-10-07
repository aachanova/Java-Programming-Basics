import java.util.Scanner;

public class L01_DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayNumber = Integer.parseInt(scanner.nextLine());
        String result;

        switch (dayNumber) {
            case 1 -> result = "Monday";
            case 2 -> result = "Tuesday";
            case 3 -> result = "Wednesday";
            case 4 -> result = "Thursday";
            case 5 -> result = "Friday";
            case 6 -> result = "Saturday";
            case 7 -> result = "Sunday";
            default -> result = "Error";
        }

        System.out.println(result);
    }
}
