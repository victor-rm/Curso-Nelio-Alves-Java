package exercicios_estrutura_condicional;

import java.util.Scanner;
import java.util.Locale;
public class Exercicio04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        final int HORAS_POR_DIA = 24;
        int duracao = 0;

        if (horaInicial < 0 || horaInicial >= HORAS_POR_DIA || horaFinal < 0 || horaFinal >= HORAS_POR_DIA){
            System.out.println("Horas inválidas.");
            return;
        }

        if (horaInicial <= horaFinal) {
            duracao = (horaFinal + HORAS_POR_DIA) - horaInicial;
        } else {
            duracao = horaInicial - horaFinal;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
    }
}