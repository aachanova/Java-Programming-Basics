import java.util.Scanner;

public class Ex02_ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badGrades = Integer.parseInt(scanner.nextLine());
        String taskName = scanner.nextLine();
        String currentTask = "";
        int solvedTasks = 0;
        double gradeSum = 0;
        int failedCount = 0;
        boolean isFailed = false;

        while (!taskName.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());

            if (grade > 4) {
                solvedTasks++;

            } else {
                failedCount++;

                if (failedCount == badGrades) {
                    System.out.printf("You need a break, %d poor grades.", badGrades);
                    isFailed = true;
                    break;
                }
            }

            gradeSum += grade;
            currentTask = taskName;
            taskName = scanner.nextLine();
        }

        if (!isFailed) {
            System.out.printf("Average score: %.2f%n", gradeSum / (solvedTasks + failedCount));
            System.out.printf("Number of problems: %d%n", solvedTasks + failedCount);
            System.out.printf("Last problem: %s", currentTask);
        }
    }
}
