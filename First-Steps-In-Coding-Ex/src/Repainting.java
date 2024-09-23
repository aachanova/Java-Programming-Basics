import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int razreditel = Integer.parseInt(scanner.nextLine());
        int workHours = Integer.parseInt(scanner.nextLine());

        double neededMoneyMaterials = (nylon + 2) * 1.50 + (paint * 1.10) * 14.50 + razreditel * 5.00 + 0.40;
        double neededMoneyForWork = workHours * (neededMoneyMaterials * 0.30);
        double totalMoney = neededMoneyMaterials + neededMoneyForWork;

        System.out.println(totalMoney);
    }
}
