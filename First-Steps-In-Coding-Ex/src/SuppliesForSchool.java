import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int penPacks = Integer.parseInt(scanner.nextLine());
        int markerPacks = Integer.parseInt(scanner.nextLine());
        int detergentLiters = Integer.parseInt(scanner.nextLine());
        int discountPercent = Integer.parseInt(scanner.nextLine());

        double moneyWithoutDiscount = penPacks * 5.80 + markerPacks * 7.20 + detergentLiters * 1.20;
        double discount = moneyWithoutDiscount * (discountPercent / 100.0);
        double finalPrice = moneyWithoutDiscount - discount;
        System.out.println(finalPrice);
    }
}
