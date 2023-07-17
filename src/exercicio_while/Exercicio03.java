package exercicio_while;

import java.util.Scanner;
import java.util.Locale;
public class Exercicio03 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

		int combustivel = 0;

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (combustivel != 4) {

            combustivel = sc.nextInt();

            if (combustivel == 1) {
                alcool += 1;
            } else if (combustivel == 2) {
                gasolina += 1;
            } else if (combustivel == 3) {
                diesel += 1;
            } else {
                continue;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\n", alcool);
        System.out.printf("Gasolina: %d\n", gasolina);
        System.out.printf("Diesel: %d\n", diesel);
    }
}
