import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos o vetor terá? ");
        int elementos = sc.nextInt();

        double[] pares = new double[elementos];
        double media_pares = 0;
        int quant_pares = 0;

        for (int i = 0; i < elementos; i++) {
            System.out.print("Digite um número: ");
            int entrada = sc.nextInt();
            if (entrada % 2 == 0) {
                pares[i] = entrada;
                media_pares += entrada;
                quant_pares ++;
            }
        }
        media_pares /= quant_pares;

        if (media_pares > 0) {
            System.out.printf("MEDIA DOS PARES = %.1f", media_pares);
        }

        sc.close();
    }
}
