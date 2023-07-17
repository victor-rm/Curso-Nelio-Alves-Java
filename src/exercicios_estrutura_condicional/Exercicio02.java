package exercicios_estrutura_condicional;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();
        String saida;

        if (entrada % 2 == 0) {
            saida = "PAR";
        } else {
            saida = "IMPAR";
        }
        System.out.println(saida + "\n");

    }
}
