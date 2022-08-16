package exercicios_estrutura_sequencial;

import java.util.Scanner;
import java.util.Locale;


public class Exercicio06 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double pi = 3.14159;
        double area_triangulo = (a * c) / 2;
        double area_circulo = pi * (c*c);
        double area_trapezio = ((a + b) * c) / 2;
        double area_quadrado = b * b;
        double area_retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f\n", area_triangulo);
        System.out.printf("CIRCULO: %.3f\n", area_circulo);
        System.out.printf("TRAPEZIO: %.3f\n", area_trapezio);
        System.out.printf("QUADRADO: %.3f\n", area_quadrado);
        System.out.printf("RETANGULO: %.3f\n", area_retangulo);
    }
}
