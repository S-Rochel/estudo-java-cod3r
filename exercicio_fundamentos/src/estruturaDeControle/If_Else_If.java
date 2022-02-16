package estruturaDeControle;

import java.util.Scanner;

public class If_Else_If {

    public static void main(String[] args) {
        
        // Entrada de dados.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor da nota: ");
        double nota = entrada.nextDouble();


        // Lógica.
        if (nota > 10 || nota < 0) {
            System.out.println("Nota inválida!");
        } else if (nota >= 8.1) {
            System.out.println("Conceito A");
        } else if (nota >= 6.1) {
            System.out.println("Conceito B");
        } else if (nota >= 4.1) {
            System.out.println("Conceito C");
        } else if (nota >= 2.1) {
            System.out.println("Conceito D");
        } else {
            System.out.println("Conceito E");
        }
    }
}
