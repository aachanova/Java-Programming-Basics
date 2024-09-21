import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int period = Integer.parseInt(scanner.nextLine());
        double apr =Double.parseDouble(scanner.nextLine());

        double sum = money + period * ((money * (apr / 100)) / 12);
        System.out.println(sum);
    }
}
