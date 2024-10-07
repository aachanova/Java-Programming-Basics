import java.util.Scanner;

public class Ex07_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videocardCount = Integer.parseInt(scanner.nextLine());
        int processorCount = Integer.parseInt(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());

        double videocardPrice = videocardCount * 250;
        double processorPrice = processorCount * (0.35 * videocardPrice);
        double ramPrice = ramCount * (0.10 * videocardPrice);


        double neededMoney = videocardPrice + processorPrice + ramPrice;

        if (videocardCount > processorCount) {
            neededMoney -= 0.15 * neededMoney;
        }

        if (budget >= neededMoney) {
            System.out.printf("You have %.2f leva left!", budget - neededMoney);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", neededMoney - budget);
        }
    }
}
