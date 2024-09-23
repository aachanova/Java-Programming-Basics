import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogFoodPack = Integer.parseInt(scanner.nextLine());
        int catFoodPack = Integer.parseInt(scanner.nextLine());

        double neededMoney = dogFoodPack * 2.50 + catFoodPack * 4.0;
        System.out.printf("%.2f lv.", neededMoney);
    }
}
