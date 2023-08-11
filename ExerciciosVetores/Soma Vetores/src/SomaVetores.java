import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores cada vetor terá? ");
        int quantidade_numeros = sc.nextInt();

        int[] vetorA = new int[quantidade_numeros];
        int[] vetorB = new int[quantidade_numeros];

        System.out.println("Digite os valores do Vetor A:");
        for (int i = 0; i < quantidade_numeros; i++) {
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do Vetor B:");
        for (int i = 0; i < quantidade_numeros; i++) {
            vetorB[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < quantidade_numeros; i++) {
            System.out.println(vetorA[i] + vetorB[i]);
        }

        sc.close();
    }
}
