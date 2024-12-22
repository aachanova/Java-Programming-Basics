import java.util.Scanner;

public class L05_SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double money = 0.0;

        if (city.equals("Sofia")) {
            switch (product) {
                case "coffee" -> money = 0.50;
                case "water" -> money = 0.80;
                case "beer" -> money = 1.20;
                case "sweets" -> money = 1.45;
                case "peanuts" -> money = 1.60;
            }
        } else if (city.equals("Plovdiv")) {
            switch (product) {
                case "coffee" -> money = 0.40;
                case "water" -> money = 0.70;
                case "beer" -> money = 1.15;
                case "sweets" -> money = 1.30;
                case "peanuts" -> money = 1.50;
            }
        } else if (city.equals("Varna")) {
            switch (product) {
                case "coffee" -> money = 0.45;
                case "water" -> money = 0.70;
                case "beer" -> money = 1.10;
                case "sweets" -> money = 1.35;
                case "peanuts" -> money = 1.55;
            }
        }

        double total = quantity * money;
        System.out.println(total);
    }
}
