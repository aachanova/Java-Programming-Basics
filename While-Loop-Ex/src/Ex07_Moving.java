import java.util.Scanner;

public class Ex07_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        boolean isLeft = true;

        int space = width * length * height;

        while (!input.equals("Done")) {
            int bags = Integer.parseInt(input);
            space -= bags;

            if (space <= 0) {
                isLeft = false;
                break;
            }

            input = scanner.nextLine();
        }

        if (isLeft) {
            System.out.printf("%d Cubic meters left.", space);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(space));
        }
    }
}
