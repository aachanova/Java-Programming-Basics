import java.util.Scanner;

public class L08_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String student = scanner.nextLine();
        int classCounter = 0;
        double gradeSum = 0.0;
        boolean isFailed = false;

        while (classCounter < 12) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade >= 4) {
                gradeSum += grade;
            } else {
                if (isFailed) {
                    break;
                }

                isFailed = true;
            }

            classCounter++;
        }

        if (isFailed) {
            System.out.printf("%s has been excluded at %d grade", student, classCounter);
        } else {
            double averageGrade = gradeSum / classCounter;
            System.out.printf("%s graduated. Average grade: %.2f", student, averageGrade);
        }
    }
}
