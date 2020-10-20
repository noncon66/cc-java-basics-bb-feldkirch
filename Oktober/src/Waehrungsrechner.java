import java.util.Scanner;

public class Waehrungsrechner {

    public static void main(String[] args) {
        double amount;
        String currency;
        double exchangeRate;
        double calcCurrency;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Betrag eingeben (Ganzahl):");
        amount = scanner.nextDouble();

        System.out.println("Währung oder Kurs eingeben:");
        boolean isDouble = scanner.hasNextDouble(); // prüft ob der Scanner einen Double enthält
        if (isDouble) {
            exchangeRate = scanner.nextDouble();
            calcCurrency = calculateCurrencyAmount(exchangeRate, amount);
        } else {
            currency = scanner.next();
            calcCurrency = calculateCurrencyAmount(currency, amount);
        }
        System.out.println("Betrag: " + calcCurrency);
    }

    public static double calculateCurrencyAmount(String currency, double amount) {
        double exchangeRate = 0.0;

        switch (currency.toUpperCase()) {
            case "CHF" -> exchangeRate = 1.067;
            case "USD" -> exchangeRate = 1.135;
            default -> System.err.println("Kenne die Währung nicht!");
        }
        return calculateCurrencyAmount(exchangeRate, amount);
    }

    public static double calculateCurrencyAmount(double exchangeRate, double amount) {
        return exchangeRate * amount;
    }
}
