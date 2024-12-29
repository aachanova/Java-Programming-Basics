import java.util.Scanner;

public class L04_Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int nextNum = 1;

        while (nextNum <= num) {
            System.out.println(nextNum);
            nextNum = 2 * nextNum + 1;
        }
    }
}
