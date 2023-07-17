package exercicio_for;

import java.util.Scanner;
import java.util.Locale;

//uri 1072
public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int in = 0;
        int out = 0;
        int entrada = 0;

        for (int i = 0; i < n; i++) {
            entrada = sc.nextInt();
            if (entrada >= 10 && entrada <= 20) {
                in++;
            }else {
                out++;
            }
        }
        System.out.printf("%d in\n" , in);
        System.out.printf("%d out", out);
    }
}
