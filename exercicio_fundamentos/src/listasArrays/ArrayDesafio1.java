package listasArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDesafio1 {
    
    public static void main(String[] args) {
        
        // O desafio e calcular a média das notas de um aluno, com o usuário passando as notas e quantas notas vai informar.

        double media = 0;
        Scanner entrada = new Scanner(System.in);

        // Receber número de notas
        System.out.println("Qantas notas voçê irá informar? ");
        int numNotas = entrada.nextInt();

        // Inicializar um array com a quantidade de notas que será informado.
        double[] notas = new double[numNotas];

        // Obter as notas.
        for(int i = 0; i < notas.length; i++){
            System.out.printf("Informe a %d nota: ", i + 1);
            notas[i] = entrada.nextDouble();
        }

        // Fazer a média das notas.
        for (double d : notas) {
            media += d;
        }

        System.out.println(">>>>" + Arrays.toString(notas));
        System.out.println("A média do aluno é: "  + media / numNotas);
        entrada.close();
    }
}
