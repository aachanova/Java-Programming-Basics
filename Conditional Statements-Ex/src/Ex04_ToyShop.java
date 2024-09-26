import java.util.Scanner;

public class Ex04_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripMoney = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollCount = Integer.parseInt(scanner.nextLine());
        int bearCount = Integer.parseInt(scanner.nextLine());
        int minionCount = Integer.parseInt(scanner.nextLine());
        int truckCount = Integer.parseInt(scanner.nextLine());

        double money = puzzleCount * 2.60 + dollCount * 3 + bearCount * 4.10 + minionCount * 8.20 + truckCount * 2;
        int toyCount = puzzleCount + dollCount + bearCount + minionCount + truckCount;

        if (toyCount >= 50) {
            money -= 0.25 * money;
        }

        money -= 0.10 * money;

        if (money >= tripMoney) {
            System.out.printf("Yes! %.2f lv left.", money - tripMoney);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", tripMoney - money);
        }
    }
}
