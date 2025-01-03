import java.util.Scanner;

public class Ex05_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            int temp = i;
            boolean isSpecial = true;

            while (temp > 0) {
                int lastDigit = temp % 10;

                if (lastDigit == 0 || num % lastDigit != 0) {
                    isSpecial = false;
                    break;
                }

                temp = temp / 10;
            }

            if (isSpecial) {
                System.out.printf("%d ", i);
            }
        }
    }
}
