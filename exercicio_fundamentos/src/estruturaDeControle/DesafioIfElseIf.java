package estruturaDeControle;

import java.util.Scanner;

public class DesafioIfElseIf {
    
    public static void main(String[] args) {
        
        // Desafio receber o dia da semana por extenso e retornar um valor númerico referente ao dia da semana.

        // Entrada de dados.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o dia da semana por extenso: ");
        String diaSemana = entrada.next();

        // Lógica.
        if ("DOMINGO".equals(diaSemana.toUpperCase())) {
            System.out.println(1);
        } else if ("SEGUNDA-FEIRA".equals(diaSemana.toUpperCase())) {
            System.out.println(2);
        } else if ("TERÇA-FEIRA".equals(diaSemana.toUpperCase())) {
            System.out.println(3);
        } else if ("QUARTA-FEIRA".equals(diaSemana.toUpperCase())) {
            System.out.println(4);
        } else if ("QUINTA-FEIRA".equals(diaSemana.toUpperCase())) {
            System.out.println(5);
        } else if ("SEXTA-FEIRA".equals(diaSemana.toUpperCase())) {
            System.out.println(6);
        } else if ("SABADO".equals(diaSemana.toUpperCase())) {
            System.out.println(7);
        } else {
            System.out.println("Erro ao digitar o dia da semana!");
        } 
        
        entrada.close();
    }         
}
