import java.util.Scanner;

public class Waehrungsrechner {

    public static void main(String[] args) {
        double amount = 0.0;
        String currency = "";
        double factor = 0.0;
        double calcCurrency = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Betrag eingeben (Ganzahl):");
        amount = scanner.nextDouble();

        System.out.println("Währung oder Kurs eingeben:");
        boolean isDouble = scanner.hasNextDouble();
        if (isDouble) {
            factor = scanner.nextDouble();
            calcCurrency = calculateCurrencyAmount(factor, amount);
        } else {
            currency = scanner.next();
            calcCurrency = calculateCurrencyAmount(currency, amount);
        }

        System.out.println("Betrag: " + calcCurrency);
    }

    public static double calculateCurrencyAmount(String currency, double amount) {
        double factor = 0.0;

        switch (currency.toUpperCase()) {
            case "CHF":
                factor = 1.067;
                break;
            case "USD":
                factor = 1.135;
                break;
            default:
                System.err.println("Kenne die Währung nicht!");
                break;
        }

        return calculateCurrencyAmount(factor, amount);
    }

    public static double calculateCurrencyAmount(double factor, double amount) {
        return factor * amount;
    }

}
