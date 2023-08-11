import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int numero_pessoas = sc.nextInt();

        double[] alturas = new double[numero_pessoas];
        char[] generos = new char[numero_pessoas];

        double menor_altura = 3;
        double maior_altura = 0;
        int numero_homens = 0;
        double soma_altura_mulheres = 0;

        for (int i = 0; i < numero_pessoas; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            alturas[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            generos[i] = sc.next().charAt(0);
            if (alturas[i] < menor_altura) {
                menor_altura = alturas[i];
            }
            if (alturas[i] > maior_altura) {
                maior_altura = alturas[i];
            }
            if (generos[i] == 'F') {
                soma_altura_mulheres += alturas[i];
            }
            if (generos[i] == 'M') {
                numero_homens += 1;
            }
        }

        System.out.printf("Menor altura = %.2f%n", menor_altura);
        System.out.printf("Maior altura = %.2f%n", maior_altura);
        System.out.printf("Media das alturas das mulheres = %.2f%n",
                soma_altura_mulheres / (numero_pessoas - numero_homens));
        System.out.printf("Numero de homens = %d%n", numero_homens);

        sc.close();
    }
}
