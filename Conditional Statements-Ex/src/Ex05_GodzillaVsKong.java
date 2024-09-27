import java.util.Scanner;

public class Ex05_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statistics = Integer.parseInt(scanner.nextLine());
        double clothesPerPerson = Double.parseDouble(scanner.nextLine());

        double decor = 0.10 * budget;

        if (statistics > 150) {
            clothesPerPerson -= 0.10 * clothesPerPerson;
        }

        double neededMoney = statistics * clothesPerPerson + decor;

        if (budget < neededMoney) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", neededMoney - budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - neededMoney);
        }
    }
}
