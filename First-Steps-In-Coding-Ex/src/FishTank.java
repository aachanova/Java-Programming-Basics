import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double waterInDm3 = (length * width * height) / 1000.0;
        double totalWaterInLiters = waterInDm3 - (percent * waterInDm3) / 100.0;
        System.out.println(totalWaterInLiters);
    }
}
