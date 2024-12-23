import java.util.Scanner;

public class Ex08_OnTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int arrHour = Integer.parseInt(scanner.nextLine());
        int arrMin = Integer.parseInt(scanner.nextLine());

        int examTimeInMin = examHour * 60 + examMin;
        int arrTimeInMin = arrHour * 60 + arrMin;

        int difference = arrTimeInMin - examTimeInMin;

        if (difference > 0) {
            System.out.println("Late");
            if (difference < 60) {
                System.out.printf("%d minutes after the start", difference);
            } else {
                int hours = difference / 60;
                int mins = difference % 60;
                System.out.printf("%d:%02d hours after the start", hours, mins);
            }
        } else if (difference >= -30) {
            System.out.println("On time");
            if (difference != 0) {
                System.out.printf("%d minutes before the start", Math.abs(difference));
            }
        } else {
            System.out.println("Early");
            int absDifference = Math.abs(difference);
            if (absDifference < 60) {
                System.out.printf("%d minutes before the start", absDifference);
            } else {
                int hours = absDifference / 60;
                int mins = absDifference % 60;
                System.out.printf("%d:%02d hours before the start", hours, mins);
            }
        }
    }
}
