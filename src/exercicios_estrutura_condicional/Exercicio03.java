package exercicios_estrutura_condicional;

import java.util.Scanner;
import java.util.Locale;
public class Exercicio03 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        if ( numero1 % numero2 == 0 || numero2 % numero1 == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao Sao Multiplos");
        }
    }
}
