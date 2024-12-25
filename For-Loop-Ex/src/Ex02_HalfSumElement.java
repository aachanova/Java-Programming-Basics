import java.util.Scanner;

public class Ex02_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nums = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < nums; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum += currentNum;

            if (currentNum > maxNum) {
                maxNum = currentNum;
            }
        }

        sum -= maxNum;

        if (sum == maxNum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sum);
        } else {
            int diff = Math.abs(sum - maxNum);

            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }
    }
}
