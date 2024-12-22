import java.util.Scanner;

public class L04_PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        String result = "";

        if (age < 16 && gender.equals("m")) {
            result = "Master";
        } else if (age < 16 && gender.equals("f")) {
            result = "Miss";
        } else if (age >= 16 && gender.equals("m")) {
            result = "Mr.";
        } else if (age >= 16 && gender.equals("f")) {
            result = "Ms.";
        }

        System.out.println(result);
    }
}
