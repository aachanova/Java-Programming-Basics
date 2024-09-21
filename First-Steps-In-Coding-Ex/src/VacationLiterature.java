import java.util.Scanner;

public class VacationLiterature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pagesCount = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int pagesPerDay = pagesCount / days;
        int neededHours = pagesPerDay / pagesPerHour;

        System.out.println(neededHours);

    }
}
