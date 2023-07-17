package exercicios_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double renda = sc.nextDouble();

        if (renda >= 0.0 && renda <= 2000.0) {
            System.out.println("Isento");
        } else if (renda > 2000.0 && renda <= 3000.0){
            System.out.printf("R$ %.2f", renda * 0.08);
        } else if (renda > 3000.0 && renda <= 4500.0) {
            System.out.printf("R$ %.2f", ((renda - 3000.0) * 0.18) + 80 );
        } else {
            System.out.printf("R$ %.2f", ((renda - 4500.0)* 0.28) + 80 + 270);
        }
    }
}
