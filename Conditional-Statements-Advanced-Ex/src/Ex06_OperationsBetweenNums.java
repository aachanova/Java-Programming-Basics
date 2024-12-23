import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex06_OperationsBetweenNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0.0;
        String output = "";

        if (operator.equals("/") || operator.equals("%")) {
            if (num2 <= 0) {
                System.out.printf("Cannot divide %d by zero", num1);
            } else {
                switch (operator) {
                    case "/" -> result = num1 * 1.0 / num2;
                    case "%" -> result = num1 % num2;
                }

                if (operator.equals("/")) {
                    output = String.format("%d %s %d = %.2f", num1, operator, num2, result);
                } else {
                    output = String.format("%d %s %d = %.0f", num1, operator, num2, result);
                }
                System.out.println(output);
            }
        } else {
            switch (operator) {
                case "+" -> result = num1 + num2;
                case "-" -> result = num1 - num2;
                case "*" -> result = num1 * num2;
            }

            String evenOrOdd = result % 2 == 0 ? "even" : "odd";
            output = String.format("%d %s %d = %.0f - %s", num1, operator, num2, result, evenOrOdd);

            System.out.println(output);
        }
    }
}
