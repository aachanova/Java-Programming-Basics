import java.util.Scanner;

public class T02_2_Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minC = Integer.parseInt(scanner.nextLine());
        int secC = Integer.parseInt(scanner.nextLine());
        double lengthInMeters = Double.parseDouble(scanner.nextLine());
        int secPer100Meters = Integer.parseInt(scanner.nextLine());

        int timeInSecC = minC * 60 + secC;

        double delay = lengthInMeters / 120.0 * 2.5;
        double time = lengthInMeters / 100.0 * secPer100Meters - delay;

        if (time <= timeInSecC) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", time);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", time - timeInSecC);
        }
    }
}
