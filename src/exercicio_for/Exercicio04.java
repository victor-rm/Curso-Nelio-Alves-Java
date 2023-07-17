package exercicio_for;

import java.util.Scanner;
import java.util.Locale;

//uri 1116
public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quant_de_numeros = sc.nextInt();

        for (int i = 0; i < quant_de_numeros; i++) {
            int numerador = sc.nextInt();
            int denominador = sc.nextInt();

            if (denominador == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.printf("%.1f\n", (double) (numerador/denominador));
            }
        }
    }
}
