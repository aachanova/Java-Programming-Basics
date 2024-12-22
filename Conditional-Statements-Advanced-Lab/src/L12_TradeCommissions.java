import java.util.Scanner;

public class L12_TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sells = Double.parseDouble(scanner.nextLine());
        double commission = 0.0;

        switch (city) {
            case "Sofia" -> {
                if (sells >= 0 && sells <= 500) {
                    commission = 0.05;
                } else if(sells > 500 && sells <= 1000) {
                    commission = 0.07;
                } else if(sells > 1000 && sells <= 10000) {
                    commission = 0.08;
                } else if(sells > 10000) {
                    commission = 0.12;
                }
            }
            case "Varna" -> {
                if (sells >= 0 && sells <= 500) {
                    commission = 0.045;
                } else if(sells > 500 && sells <= 1000) {
                    commission = 0.075;
                } else if(sells > 1000 && sells <= 10000) {
                    commission = 0.10;
                } else if(sells > 10000) {
                    commission = 0.13;
                }
            }
            case "Plovdiv" -> {
                if (sells >= 0 && sells <= 500) {
                    commission = 0.055;
                } else if(sells > 500 && sells <= 1000) {
                    commission = 0.08;
                } else if(sells > 1000 && sells <= 10000) {
                    commission = 0.12;
                } else if(sells > 10000) {
                    commission = 0.145;
                }
            }
            default -> city = "invalid";
        }

        if (!city.equals("invalid") && sells >= 0) {
            double output = sells * commission;
            System.out.printf("%.2f", output);
        } else {
            System.out.println("error");
        }
    }
}
