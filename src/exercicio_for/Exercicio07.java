package exercicio_for;

import java.util.Locale;
import java.util.Scanner;

//uri 1143
public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            int quadrado = (int) Math.pow(i,2);
            int cubo = (int) Math.pow(i,3);

            System.out.printf("%d %d %d\n", i, quadrado, cubo);
        }
    }
}
