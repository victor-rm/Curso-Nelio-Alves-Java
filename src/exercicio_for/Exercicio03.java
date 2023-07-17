package exercicio_for;

import java.util.Scanner;
import java.util.Locale;

//uri 1079
public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quant_casos_de_teste = sc.nextInt();

        double media_ponderada;

        for (int i = 0; i < quant_casos_de_teste; i++) {
            double valor1 = sc.nextDouble();
            double valor2 = sc.nextDouble();
            double valor3 = sc.nextDouble();

            media_ponderada = ((valor1 * 2) + (valor2 * 3) + (valor3 * 5)) / 10;
            System.out.printf("%.1f", media_ponderada);
        }
        sc.close();
    }
}
