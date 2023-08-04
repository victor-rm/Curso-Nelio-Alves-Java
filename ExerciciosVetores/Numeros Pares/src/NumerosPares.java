import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int quantidade_de_numeros = sc.nextInt();

        int[] numeros = new int[quantidade_de_numeros];
        int numeros_pares = 0;

        for (int i = 0; i < quantidade_de_numeros; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES");
        for (int i = 0; i < quantidade_de_numeros; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
                numeros_pares++;
            }
        }
        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + numeros_pares);
        sc.close();
    }
}
