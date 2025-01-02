import java.util.Scanner;

public class Ex01_NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int currentNum = 0;
        boolean isReached = false;


        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", ++currentNum);

                if (currentNum == num) {
                    isReached = true;
                    break;
                }
            }

            if (isReached) {
                break;
            }

            System.out.println();
        }
    }
}
