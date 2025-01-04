import java.util.Scanner;

public class T06_HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int finalHeight = Integer.parseInt(scanner.nextLine());

        int height = finalHeight - 30;
        int attemptedHeight = 0;
        int fail = 0;
        int total = 0;
        boolean isFailed = false;

        while (attemptedHeight <= finalHeight || height <= finalHeight) {
            attemptedHeight = Integer.parseInt(scanner.nextLine());

            if (attemptedHeight > finalHeight && height == finalHeight) {
                total++;
                break;
            }

            if (attemptedHeight > height) {
                total++;
                fail = 0;
                height += 5;
            } else {
                fail++;
                total++;

                if (fail == 3) {
                    isFailed = true;
                    break;
                }
            }
        }

        if (isFailed) {
            System.out.printf("Tihomir failed at %dcm after %d jumps.", height, total);
        } else {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", height, total);
        }
    }
}
