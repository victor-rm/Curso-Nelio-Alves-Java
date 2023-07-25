import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int quantidade_numeros = sc.nextInt();
        int[] numeros = new int[quantidade_numeros];
        sc.nextLine();
        for (int i = 0; i < quantidade_numeros; i++){
            numeros[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS");

        for (int j = 0; j < quantidade_numeros; j++) {
            if (numeros[j] < 0){
                System.out.printf("%d\n", numeros[j]);
            }
        }

        sc.close();
    }
}