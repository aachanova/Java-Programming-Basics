import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int projectsCount = Integer.parseInt(scanner.nextLine());
        int neededHours = projectsCount * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, neededHours, projectsCount);
    }
}