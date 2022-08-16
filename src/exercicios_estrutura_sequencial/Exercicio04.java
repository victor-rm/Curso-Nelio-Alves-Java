package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		int id = sc.nextInt();
		int horas_trabalhadas = sc.nextInt();
		double valor_por_hora = sc.nextDouble();

		sc.close();

		double salario = horas_trabalhadas * valor_por_hora;

		System.out.println("NUMBER = " + id);
		System.out.printf("SALARY = U$ %.2f", salario);
	}

}
