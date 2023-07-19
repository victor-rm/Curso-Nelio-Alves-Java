package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dollarsBought = sc.nextDouble();

        double moneyConverted = CurrencyConverter.Converter(dollarPrice,dollarsBought);

        System.out.printf("Amount to be paid in reais %.2f", moneyConverted);

        sc.close();
    }
}