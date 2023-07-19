package entidades;

import static java.lang.String.format;

public class Conta {
    private final int numeroConta;
    private String nomeDoTitular;
    private double saldo;

    public Conta(int numeroConta, String nomeDoTitular) {
        this.numeroConta = numeroConta;
        this.nomeDoTitular = nomeDoTitular;
    }
    public Conta(int numeroConta, String nomeDoTitular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeDoTitular = nomeDoTitular;
        deposita(depositoInicial);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double dinheiro){
        saldo += dinheiro;
    }
    public void saca(double dinheiro) {
        saldo -= dinheiro + 5.00;
    }

    @Override
    public String toString() {
        return format("Conta %d, Titular: %s, Saldo $ %.2f", numeroConta, nomeDoTitular, saldo);
    }
}
