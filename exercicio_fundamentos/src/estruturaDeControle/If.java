package estruturaDeControle;

import java.util.Scanner;

public class If {
    
    public static void main(String[] args) {
        
        // Entrada de dados.
        Scanner entrada = new Scanner(System.in);

        System.err.println("Informe a média do aluno: ");
        double media = entrada.nextDouble();

        // Lógica.
        if (media >= 7.0 && media <= 10.0) {
            System.out.println("Aluno aprovado!");
            System.out.println("Parabéns!");
        }

        if (media >= 4.5 && media < 7) {
            System.out.println("Aluno em recuperação!");
        }

        if (media < 4.5) {
            System.out.println("Aluno reprovado!");
        }

        entrada.close();
    }
}
