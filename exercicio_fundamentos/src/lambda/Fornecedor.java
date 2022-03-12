// Funções Lambdas - Interfaces Funcionais - Supplier
package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    
    public static void main(String[] args) {
        
        // Interface funcional "Supplier" não recebe nenhum parâmetro e retorna alguma coisa.

        // Retorna através do generics uma lista de Strings:
        Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");

        // Testando:
        System.out.println(umaLista.get());
    }
}
