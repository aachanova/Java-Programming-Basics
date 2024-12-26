import java.util.Scanner;

public class Ex03_Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int countTo200 = 0;
        int countTo400 = 0;
        int countTo600 = 0;
        int countTo800 = 0;
        int countOver800 = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num < 200) {
                countTo200++;
            } else if (num < 400) {
                countTo400++;
            } else if (num < 600) {
                countTo600++;
            } else if (num < 800) {
                countTo800++;
            } else {
                countOver800++;
            }
        }

        double pTo200 = countTo200 * 1.0 / n * 100;
        double pTo400 = countTo400 * 1.0 / n * 100;
        double pTo600 = countTo600 * 1.0 / n * 100;
        double pTo800 = countTo800 * 1.0 / n * 100;
        double pOver800 = countOver800 * 1.0 / n * 100;

        System.out.printf("%.2f%%%n", pTo200);
        System.out.printf("%.2f%%%n", pTo400);
        System.out.printf("%.2f%%%n", pTo600);
        System.out.printf("%.2f%%%n", pTo800);
        System.out.printf("%.2f%%", pOver800);
    }
}
