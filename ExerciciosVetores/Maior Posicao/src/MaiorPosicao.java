import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int quantidade_de_numeros = sc.nextInt();

        double[] numeros = new double[quantidade_de_numeros];
        double maior_valor = 0;
        int posicao_maior_valor = 0;

        for (int i = 0; i < quantidade_de_numeros; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextDouble();
            if (numeros[i] > maior_valor) {
                maior_valor = numeros[i];
                posicao_maior_valor = i;
            }
        }
        System.out.printf("MAIOR VALOR = %.1f%n", maior_valor);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicao_maior_valor);

        sc.close();
    }
}
