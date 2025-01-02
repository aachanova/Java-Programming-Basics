import java.util.Scanner;

public class L06_Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int roomsPerFloor = Integer.parseInt(scanner.nextLine());

        for (int i = floors; i >= 1; i--) {
            for (int j = 0; j < roomsPerFloor; j++) {
                if (i == floors) {
                    System.out.printf("L%d%d ", i, j);
                    continue;
                } else {
                    if (i % 2 == 0) {
                        System.out.printf("O%d%d ", i, j);
                    }

                    if (i % 2 != 0) {
                        System.out.printf("A%d%d ", i, j);
                    }
                }
            }

            System.out.println();
        }
    }
}

