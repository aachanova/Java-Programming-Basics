import java.util.Scanner;

public class Ex04_TrainAndTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int experts = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int presentationCounter = 0;
        double totalSumGrade = 0.0;

        while (!input.equals("Finish")) {
            String presentationName = input;
            presentationCounter++;
            double sumGrades = 0.0;

            for (int i = 0; i < experts; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                sumGrades += grade;
            }

            double avSumGrade = sumGrades / experts;
            totalSumGrade += avSumGrade;
            System.out.printf("%s - %.2f.%n", presentationName, avSumGrade);

            input = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", totalSumGrade / presentationCounter);
    }
}
