package lambda;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    
    public static void main(String[] args) {
        
        List<String> aprovados = Arrays.asList("Ana", "Lia", "Gui", "Bia");

        System.out.println("Forma tradicional...");
        for (String pessoa : aprovados) {
            System.out.println("Pessoa aprovado: " + pessoa);
        }

        System.out.println("\nLambda #01...");
        aprovados.forEach(nome -> System.out.println("Nome do aprovado: " + nome));

        System.out.println("\nMethod Reference...");
        aprovados.forEach(System.out::println);
    }
}
