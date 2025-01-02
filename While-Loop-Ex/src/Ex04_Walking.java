import java.util.Scanner;

public class Ex04_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int totalSteps = 0;
        boolean isReached = false;

        while (totalSteps < 10000 || input.equals("Going home")) {
            if (input.equals("Going home")) {
                totalSteps += Integer.parseInt(scanner.nextLine());
                break;
            }

            int steps = Integer.parseInt(input);
            totalSteps += steps;

            if (totalSteps >= 10000) {
                break;
            }

            input = scanner.nextLine();
        }

        if (totalSteps < 10000) {
            System.out.printf("%d more steps to reach goal.", 10000 - totalSteps);
        } else {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", totalSteps - 10000);
        }
    }
}
