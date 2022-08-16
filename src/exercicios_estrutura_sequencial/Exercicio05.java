package exercicios_estrutura_sequencial;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio05 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int peca = sc.nextInt();
        int numero_de_pecas = sc.nextInt();
        double preco = sc.nextDouble();

        int peca2 = sc.nextInt();
        int numero_de_pecas2 = sc.nextInt();
        double preco2 = sc.nextDouble();

        double valor = (numero_de_pecas * preco) + (numero_de_pecas2 * preco2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", valor);
    }
}
