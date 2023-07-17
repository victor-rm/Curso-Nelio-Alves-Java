package exercicios_estrutura_condicional;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();
        String saida = "";

        if (entrada >= 0) {
            saida = "NAO NEGATIVO";
        } else {
            saida = "NEGATIVO";
        }
        System.out.println(saida + "\n");

    }
}
