import java.util.Scanner;

public class L02_NumbersFromNTo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
