import java.util.Scanner;

public class T01_1_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tax = Integer.parseInt(scanner.nextLine());

        double sneakersPrice = 0.6 * tax;
        double outfit = 0.8 * sneakersPrice;
        double ball = outfit / 4.0;
        double accessories = ball / 5.0;

        double neededMoney = tax + sneakersPrice + outfit + ball + accessories;
        System.out.printf("%.2f", neededMoney);
    }
}
