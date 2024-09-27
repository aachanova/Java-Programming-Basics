import java.util.Scanner;

public class Ex06_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecordInSec = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timePer1meter = Double.parseDouble(scanner.nextLine());

        double time = distanceInMeters * timePer1meter;
        double delays = Math.floor(distanceInMeters / 15);
        time += delays * 12.5;

        if (time < worldRecordInSec) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", time);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", time - worldRecordInSec);
        }

    }
}
