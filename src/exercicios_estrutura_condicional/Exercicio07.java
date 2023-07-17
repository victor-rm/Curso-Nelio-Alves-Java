package exercicios_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double coordenadax = sc.nextDouble();
        double coordenaday = sc.nextDouble();

        if (coordenadax > 0 && coordenaday > 0) {
            System.out.println("Q1");
        } else if (coordenadax < 0 && coordenaday > 0) {
            System.out.println("Q2");
        } else if (coordenadax < 0 && coordenaday < 0) {
            System.out.println("Q3");
        } else if (coordenadax > 0 && coordenaday < 0){
            System.out.println("Q4");
        } else {
            System.out.println("Origem");
        }
    }
}
