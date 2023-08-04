import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int pessoas = sc.nextInt();

        String[] nomes = new String[pessoas];
        int[] idades = new int[pessoas];
        String pessoa_mais_velha = "";
        int idade_mais_velha = 0;

        for (int i = 0; i < pessoas; i++) {
            System.out.printf("Dados da %da pessoa%n", i + 1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            if (idades[i] > idade_mais_velha) {
                idade_mais_velha = idades[i];
                pessoa_mais_velha = nomes[i];
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s", pessoa_mais_velha);

        sc.close();
    }
}
