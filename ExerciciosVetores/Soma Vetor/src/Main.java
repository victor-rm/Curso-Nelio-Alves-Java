import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int quantidade_de_numeros = sc.nextInt();
		double[] numeros = new double[quantidade_de_numeros];
        double soma = 0;

        for (int i = 0; i < quantidade_de_numeros; i++) {
			numeros[i] = sc.nextDouble();
        }
        System.out.print("VALORES =");
        for (int i = 0; i < quantidade_de_numeros; i++) {
            System.out.printf(" %.1f", numeros[i]);
			soma += numeros[i];
        }
        System.out.println();
        System.out.printf("SOMA = %.1f\n",soma);
        System.out.printf("MEDIA = %.1f", soma / quantidade_de_numeros);
    }
}