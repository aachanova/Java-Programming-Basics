import java.util.Scanner;

public class Ex08_LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String series = scanner.nextLine();
        int episodeTime = Integer.parseInt(scanner.nextLine());
        int lunchBreakTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = lunchBreakTime * (1 / 8.0);
        double relaxTime = lunchBreakTime * (1 / 4.0);

        double remainingTime = lunchBreakTime - lunchTime - relaxTime;

        if (remainingTime >= episodeTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", series, Math.ceil(remainingTime - episodeTime));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", series, Math.ceil(episodeTime - remainingTime));
        }
    }
}
