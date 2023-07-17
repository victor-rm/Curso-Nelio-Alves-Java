package exercicios_estrutura_condicional;

import java.util.Scanner;
import java.util.Locale;
public class Exercicio06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double entrada = sc.nextDouble();

        if(entrada >=0 && entrada < 26){
            System.out.println("Intervalo [0,25]");
        } else if (entrada > 25 && entrada <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (entrada > 50 && entrada <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (entrada > 75 && entrada <=100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora do intervalo");
        }
    }
}