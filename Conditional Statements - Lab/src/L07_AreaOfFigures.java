import java.util.Scanner;

public class L07_AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        double result = 0;
        switch (type) {
            case "square":
                double length = Double.parseDouble(scanner.nextLine());
                result = length * length;
                break;
            case "rectangle":
                double side1 = Double.parseDouble(scanner.nextLine());
                double side2 = Double.parseDouble(scanner.nextLine());
                result = side1 * side2;
                break;
            case "circle":
                double radius = Double.parseDouble(scanner.nextLine());
                result = radius * radius * Math.PI;
                break;
            case "triangle":
                double lengthSide = Double.parseDouble(scanner.nextLine());
                double height = Double.parseDouble(scanner.nextLine());
                result = lengthSide * height / 2;
                break;
        }
        System.out.printf("%.3f", result);
    }
}
