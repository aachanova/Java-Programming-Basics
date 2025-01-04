import java.util.Scanner;

public class T03_Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String equipment = scanner.nextLine();

        double difficulty = 0.0;
        double performance = 0.0;

        switch (country) {
            case "Russia":
                switch (equipment) {
                    case "ribbon":
                        difficulty = 9.100;
                        performance = 9.400;
                        break;
                    case "hoop":
                        difficulty = 9.300;
                        performance = 9.800;
                        break;
                    case "rope":
                        difficulty = 9.600;
                        performance = 9.000;
                        break;
                }
                break;
            case "Bulgaria":
                switch (equipment) {
                    case "ribbon":
                        difficulty = 9.600;
                        performance = 9.400;
                        break;
                    case "hoop":
                        difficulty = 9.550;
                        performance = 9.750;
                        break;
                    case "rope":
                        difficulty = 9.500;
                        performance = 9.400;
                        break;
                }
                break;
            case "Italy":
                switch (equipment) {
                    case "ribbon":
                        difficulty = 9.200;
                        performance = 9.500;
                        break;
                    case "hoop":
                        difficulty = 9.450;
                        performance = 9.350;
                        break;
                    case "rope":
                        difficulty = 9.700;
                        performance = 9.150;
                        break;
                }
                break;
        }

        double rate = difficulty + performance;
        double difference = 20 - rate;
        double percent = difference / 20.0 * 100;

        System.out.printf("The team of %s get %.3f on %s.%n", country, rate, equipment);
        System.out.printf("%.2f%%", percent);
    }
}
