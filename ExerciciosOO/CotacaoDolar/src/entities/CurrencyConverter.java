package entities;

public class CurrencyConverter {
    public static final double IOF = 1.06;

    public static double TaxApplication(double money) {
        return money * IOF;
    }

    public static double Converter(double dollarPrice,double money) {
        return TaxApplication(money) * dollarPrice;
    }
}
