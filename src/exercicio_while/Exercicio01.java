package exercicio_while;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final int senha = 2002;
        int entrada;

        while ((entrada = sc.nextInt()) != senha) {
            System.out.println("Senha invalida");
        }
        System.out.println("Acesso permitido");
    }
}

