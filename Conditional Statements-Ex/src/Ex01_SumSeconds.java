import java.util.Scanner;

public class Ex01_SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int time1 = Integer.parseInt(scanner.nextLine());
        int time2 = Integer.parseInt(scanner.nextLine());
        int time3 = Integer.parseInt(scanner.nextLine());

        int sumSec = time1 + time2 + time3;
        int min = sumSec / 60;
        int sec = sumSec % 60;

        System.out.printf("%d:%02d", min, sec);
    }
}
