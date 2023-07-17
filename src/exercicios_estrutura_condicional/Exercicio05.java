package exercicios_estrutura_condicional;

import java.util.Scanner;
import java.util.Locale;
import java.util.HashMap;

    public class Exercicio05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Double> cardapio = new HashMap<>();

        cardapio.put(1,4.0);
        cardapio.put(2,4.5);
        cardapio.put(3,5.0);
        cardapio.put(4,2.0);
        cardapio.put(5,1.5);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        double preco = cardapio.get(codigo) * quantidade;

        System.out.printf("Total: R$ %.2f", preco);
    }
}