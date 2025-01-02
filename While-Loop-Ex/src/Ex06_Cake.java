import java.util.Scanner;

public class Ex06_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int cakeSize = width * length;

        while (!input.equals("STOP")) {
                int pieces = Integer.parseInt(input);
                cakeSize -= pieces;

                if (cakeSize < 0) {
                    break;
                }

            input = scanner.nextLine();
        }

        if (cakeSize >= 0) {
            System.out.printf("%d pieces are left.", cakeSize);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakeSize));
        }
    }
}
