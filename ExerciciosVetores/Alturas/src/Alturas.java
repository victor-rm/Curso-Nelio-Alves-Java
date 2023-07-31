import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int quantidade_de_pessoas = sc.nextInt();

        String[] nomes = new String[quantidade_de_pessoas]; 
        double[] alturas = new double[quantidade_de_pessoas]; 
        double[] idades = new double[quantidade_de_pessoas]; 

        String nome;

        int idade;
        int pessoas_com_menos_de_16_anos = 0;

        double altura;
        double soma_alturas = 0;
        
        for (int i = 0; i < quantidade_de_pessoas; i++) {
            System.out.printf("Dados da %da pessoa: %n", i + 1);
            System.out.print("Nome: ");
            nome = sc.next();
            nomes[i] = nome;
            System.out.print("Idade: ");
            idade = sc.nextInt();
            idades[i] = idade;
            if (idade < 16) {
                pessoas_com_menos_de_16_anos++;
            }
            System.out.print("Altura: ");
            altura = sc.nextDouble();
            soma_alturas += altura;
            alturas[i] = altura;
        }

        System.out.println();
        System.out.printf("Altura média: %.2f%n", soma_alturas / quantidade_de_pessoas);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", pessoas_com_menos_de_16_anos*100.0 / quantidade_de_pessoas);

        for (int i = 0; i < quantidade_de_pessoas; i++) {
            if(idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }
        

            
    }
}
