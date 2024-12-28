import java.util.Scanner;

public class Ex07_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupCount = Integer.parseInt(scanner.nextLine());
        int musalaPeak = 0;
        int montBlancPeak = 0;
        int kilimanjaroPeak = 0;
        int k2Peak = 0;
        int everestPeak = 0;

        for (int i = 0; i < groupCount; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());

            if (peopleInGroup <= 5) {
                musalaPeak += peopleInGroup;
            } else if (peopleInGroup <= 12) {
                montBlancPeak += peopleInGroup;
            } else if (peopleInGroup <= 25) {
                kilimanjaroPeak += peopleInGroup;
            } else if (peopleInGroup <= 40) {
                k2Peak += peopleInGroup;
            } else {
                everestPeak += peopleInGroup;
            }
        }

        int totalPeople = musalaPeak + montBlancPeak + kilimanjaroPeak + k2Peak + everestPeak;

        System.out.printf("%.2f%%%n", (musalaPeak * 1.0 / totalPeople * 100));
        System.out.printf("%.2f%%%n", montBlancPeak * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", kilimanjaroPeak * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", k2Peak * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%", everestPeak * 1.0 / totalPeople * 100);
    }
}
