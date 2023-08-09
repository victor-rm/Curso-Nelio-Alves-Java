import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int quantidade_alunos = sc.nextInt();

        double[] nota_media = new double[quantidade_alunos];
        String[] nomes = new String[quantidade_alunos];

        for (int i = 0; i < quantidade_alunos; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: %n", i+1);
            sc.nextLine();
            nomes[i] = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            nota_media[i] = ((nota1 + nota2) / 2.0);
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < quantidade_alunos; i++) {
            if (nota_media[i] >= 6.0) {
                System.out.println(nomes[i]);
            }
        }
        
    }
}
