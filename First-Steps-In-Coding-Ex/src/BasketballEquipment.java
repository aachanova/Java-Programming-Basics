import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int annualFee = Integer.parseInt(scanner.nextLine());
        double sneakers = 0.6 * annualFee;
        double clothing = 0.8 * sneakers;
        double ball = clothing / 4.0;
        double accessories = ball / 5.0;

        double neededMoney = annualFee + sneakers + clothing + ball + accessories;
        System.out.println(neededMoney);
    }
}
