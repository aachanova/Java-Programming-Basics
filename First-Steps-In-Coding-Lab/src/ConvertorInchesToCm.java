import java.util.Scanner;

public class ConvertorInchesToCm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1 inch = 2.54 cm
        double inches = Double.parseDouble(scanner.nextLine());
        double cm = inches * 2.54;
        System.out.println(cm);
    }
}
