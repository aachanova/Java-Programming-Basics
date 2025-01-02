import java.util.Scanner;

public class Ex02_EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        int evenSum = 0;
        int oddSum = 0;
        int temp;

        for (int i = num1; i <= num2; i++) {
            temp = i;
            while (i > 0) {
                int lastDigit = i % 10;
                evenSum += lastDigit;
                i = i / 10;

                int lastDigit1 = i % 10;
                oddSum += lastDigit1;
                i = i / 10;
            }

            if (evenSum == oddSum) {
                System.out.printf("%d ", temp);
            }

            i = temp;
            evenSum = 0;
            oddSum = 0;
        }
    }
}
