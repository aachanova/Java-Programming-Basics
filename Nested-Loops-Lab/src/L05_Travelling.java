import java.util.Scanner;

public class L05_Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        double neededMoney = 0.0;
        double sum = 0.0;

        while (!destination.equals("End")) {
            if (sum == 0) {
                neededMoney = Double.parseDouble(scanner.nextLine());

            }

            if (sum >= neededMoney) {
                System.out.printf("Going to %s!%n", destination);

                sum = 0.0;
                destination = scanner.nextLine();
                continue;
            }

            double currentMoney = Double.parseDouble(scanner.nextLine());
            sum += currentMoney;
        }
    }
}
