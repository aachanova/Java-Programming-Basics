import java.util.Scanner;

public class L03_Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        x1 + x2 + x3 = n

        int num = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= num; j++) {
                for (int k = 0; k <= num; k++) {
                    if (i + j + k == num) {
                        counter++;
                    }
                }
            }
        }

        System.out.println(counter);
    }
}
