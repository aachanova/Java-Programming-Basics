import java.util.Scanner;

public class L09_FruitOrVegetables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String result = "";

        switch (product) {
            case "banana", "apple", "kiwi", "cherry", "lemon", "grapes" -> result = "fruit";
            case "tomato", "cucumber", "pepper", "carrot" -> result = "vegetable";
            default -> result = "unknown";
        }

        System.out.println(result);
    }
}
