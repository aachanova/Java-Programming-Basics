import java.util.Scanner;

public class T01_TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        1 чифт маратонки = 1/6 от цената на една тенис ракета

        double racketSinglePrice = Double.parseDouble(scanner.nextLine());
        int racketCounts = Integer.parseInt(scanner.nextLine());
        int sneakersCounts = Integer.parseInt(scanner.nextLine());

        double racketPrice = racketCounts * racketSinglePrice;
        double sneakersPrice = sneakersCounts * (racketSinglePrice / 6.0);
        double otherEquipmentPrice = 0.2 * (racketPrice + sneakersPrice);
        double totalPrice = racketPrice + sneakersPrice + otherEquipmentPrice;

        System.out.printf("Price to be paid by Djokovic %.0f%n", Math.floor(totalPrice / 8.0));
        System.out.printf("Price to be paid by sponsors %.0f", Math.ceil(totalPrice * 7 / 8.0));
    }
}
