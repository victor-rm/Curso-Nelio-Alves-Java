package exercicio_while;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int coordenadax = 1;
        int coordenaday = 1;

        while (coordenadax != 0 && coordenadax != 0 ) {

            coordenadax = sc.nextInt();
            coordenaday = sc.nextInt();

            if (coordenadax > 0 && coordenaday > 0){
                System.out.println("primeiro");
            } else if (coordenadax < 0 && coordenaday > 0) {
                System.out.println("segundo");
            } else if (coordenadax < 0 && coordenaday < 0) {
                System.out.println("terceiro");
            } else if (coordenadax > 0 && coordenaday < 0) {
                System.out.println("quarto");
            } else {
               continue;
            }
        }
    }
}
