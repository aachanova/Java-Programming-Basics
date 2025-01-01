import java.util.Scanner;

public class Ex03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());
        int totalDays = 0;
        int spendDays = 0;
        boolean isAchieved = true;

        while (currentMoney < neededMoney) {
            String action = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());
            totalDays++;

            if (action.equals("spend")) {
                currentMoney = Math.max(0, currentMoney - amount);
                spendDays++;

                if (spendDays == 5) {
                    isAchieved = false;
                    break;
                }
            } else {
                currentMoney += amount;
                spendDays = 0;
            }
        }

        if (isAchieved) {
            System.out.printf("You saved the money for %d days.", totalDays);
        } else {
            System.out.println("You can't save the money.");
            System.out.println(totalDays);
        }
    }
}
