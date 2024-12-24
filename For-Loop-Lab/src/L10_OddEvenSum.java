import java.util.Scanner;

public class L10_OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numsCount = Integer.parseInt(scanner.nextLine());
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numsCount; i++) {
            if (i % 2 == 0) {
                evenSum += Integer.parseInt(scanner.nextLine());
            } else {
                oddSum += Integer.parseInt(scanner.nextLine());
            }
        }

        if (evenSum == oddSum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", evenSum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(evenSum - oddSum));
        }
    }
}
