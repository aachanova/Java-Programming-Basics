import java.util.Scanner;

public class ConvertorFromRadToDeg {
    public static void main(String[] args) {
        // degree = rad * 180 / π
        Scanner scanner = new Scanner(System.in);
        double radians = Double.parseDouble(scanner.nextLine());
        double degrees = radians * (180 / Math.PI);
        System.out.println(degrees);
    }
}
