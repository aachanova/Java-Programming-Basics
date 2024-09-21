import java.util.Scanner;

public class ConvertorFromUSDToBGN {
    public static void main(String[] args) {
        // 1 USD = 1.79549 BGN
        Scanner scanner = new Scanner(System.in);
        double dollars = Double.parseDouble(scanner.nextLine());
        double levs = dollars * 1.79549;
        System.out.println(levs);
    }
}
