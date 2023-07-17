package exercicio_for;

import java.util.Locale;
import java.util.Scanner;

//uri 1153
public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();

        if (valor == 0) {
            System.out.println(1);
        } else {
            int fatorial = 1;

            for (int i = valor; i > 0; i--) {
                fatorial *= i;
            }
            System.out.println(fatorial);
        }

    }
}
