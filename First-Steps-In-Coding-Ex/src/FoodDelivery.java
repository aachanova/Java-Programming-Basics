import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenuCount = Integer.parseInt(scanner.nextLine());
        int fishMenuCount = Integer.parseInt(scanner.nextLine());
        int vegetarianMenuCount = Integer.parseInt(scanner.nextLine());

        double neededMoney = chickenMenuCount * 10.35 + fishMenuCount * 12.40 + vegetarianMenuCount * 8.15;
        double desert = neededMoney * 0.20;
        double totalMoney = neededMoney + desert + 2.50;

        System.out.println(totalMoney);
    }
}
