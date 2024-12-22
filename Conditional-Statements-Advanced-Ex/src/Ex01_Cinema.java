import java.util.Scanner;

public class Ex01_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        switch (type) {
            case "Premiere" -> price = 12.00;
            case "Normal" -> price = 7.50;
            case "Discount" -> price = 5.00;
        }

        double total = rows * cols * price;
        System.out.printf("%.2f leva", total);
    }
}
