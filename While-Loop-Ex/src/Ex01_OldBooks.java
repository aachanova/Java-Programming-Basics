import java.util.Scanner;

public class Ex01_OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();
        String book = scanner.nextLine();
        int counter = 0;

        while (!book.equals("No More Books")) {
            if (book.equals(searchedBook)) {
                System.out.printf("You checked %d books and found it.", counter);
                break;
            }

            counter++;
            book = scanner.nextLine();
        }

        if (!book.equals(searchedBook)) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", counter);
        }
    }
}
