import java.util.Scanner;

public class Ex01_NumbersEndingIn7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 1000; i++) {
            int number = i;
            int lastDigit = number % 10;
            if (lastDigit == 7) {
                System.out.println(number);
            }
        }
    }
}
