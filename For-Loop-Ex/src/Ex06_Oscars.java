import java.util.Scanner;

public class Ex06_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actor = scanner.nextLine();
        double academyRate = Double.parseDouble(scanner.nextLine());
        int expertCount = Integer.parseInt(scanner.nextLine());
        double finalPoints = academyRate;

        for (int i = 0; i < expertCount; i++) {
            String expertName = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());

            finalPoints += expertName.length() * points / 2;

            if (finalPoints > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, finalPoints);
                break;
            }
        }

        if (finalPoints <= 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actor, 1250.5 - finalPoints);
        }
    }
}
