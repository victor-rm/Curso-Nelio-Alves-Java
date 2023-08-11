import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos o vetor terá? ");
        int quantidade_elementos = sc.nextInt();

        double[] vetor = new double[quantidade_elementos];
        double media_dos_vetores = 0;

        for (int i = 0; i < quantidade_elementos; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
            media_dos_vetores += vetor[i];
        }

        media_dos_vetores /= quantidade_elementos;
        System.out.printf("MEDIA DO VETOR = %.3f%n", media_dos_vetores);

        for (int i = 0; i < quantidade_elementos; i++) {
            if (vetor[i] < media_dos_vetores) {
                System.out.println(vetor[i]);
            }
        }

        System.out.println();

        sc.close();
    }
}
