package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Digite o número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o nome do titular: ");
        String nomeTitular = sc.nextLine();

        System.out.print("Haverá um depósito inicial? (s/n)");
        char resposta = sc.next().charAt(0);

        if (resposta == 's') {
            System.out.print("Digite o valor inicial de depósito: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numeroConta, nomeTitular, depositoInicial);
        } else {
            conta = new Conta(numeroConta, nomeTitular);

        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Valor a depositar: ");
        double deposito = sc.nextDouble();

        conta.deposita(deposito);

        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Valor a sacar: ");
        double saca = sc.nextDouble();

        conta.saca(saca);

        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta);

        sc.close();
    }

}