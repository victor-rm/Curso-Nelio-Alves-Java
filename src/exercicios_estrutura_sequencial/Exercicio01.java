package exercicios_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();

		sc.close();

		int soma = valor1 + valor2;

		System.out.println("SOMA = " + soma);
	}

}
