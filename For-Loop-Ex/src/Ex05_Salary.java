import java.util.Scanner;

public class Ex05_Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabs = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());
        String tabTitle = "";

        for (int i = 0; i < tabs; i++) {
            tabTitle = scanner.nextLine();
            switch (tabTitle) {
                case "Facebook" -> salary -= 150;
                case "Instagram" -> salary -= 100;
                case "Reddit" -> salary -= 50;
            }

            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }

        if (salary != 0) {
            System.out.printf("%.0f", salary);
        }
    }
}
