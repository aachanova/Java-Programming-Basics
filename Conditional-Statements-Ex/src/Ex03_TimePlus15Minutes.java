import java.util.Scanner;

public class Ex03_TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        min += 15;
        if (min> 59) {
            hour++;
            min -= 60;
        }

        if (hour > 23) {
            hour = 0;
        }

        System.out.printf("%d:%02d", hour, min);
    }
}
