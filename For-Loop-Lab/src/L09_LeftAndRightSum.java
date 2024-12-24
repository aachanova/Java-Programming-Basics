import java.util.Scanner;

public class L09_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numsInGroup = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < numsInGroup; i++) {
            leftSum += Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < numsInGroup; i++) {
            rightSum += Integer.parseInt(scanner.nextLine());
        }

        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(leftSum - rightSum));
        }
    }
}
