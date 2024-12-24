import java.util.Scanner;

public class L04_EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                double output = Math.pow(2, i);
                System.out.printf("%.0f%n", output);
            }
        }
    }
}
