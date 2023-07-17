package exercicio_for;

import java.util.Scanner;
import java.util.Locale;

//uri 1067
public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();

        for (int i = 1; i < entrada; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
