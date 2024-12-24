import java.util.Scanner;

public class L08_NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numsCount = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (int i = 0; i < numsCount; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if (currentNum > maxNum) {
                maxNum = currentNum;
            }

            if (currentNum < minNum) {
                minNum = currentNum;
            }
        }

        System.out.printf("Max number: %d%n", maxNum);
        System.out.printf("Min number: %d", minNum);
    }
}
