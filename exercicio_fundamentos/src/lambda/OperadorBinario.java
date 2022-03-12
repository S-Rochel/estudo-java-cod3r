// Funções Lambdas - Binary Operator e BiFunction
package lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperadorBinario {
    
    public static void main(String[] args) {
        
        // O operador Binário recebe dois parâmetros de entrada e retorna um, pode ser usado para ser encadeado com um Operador Unário.

        // Os dois parâmetros de entrada e a saída são do mesmo tipo:
        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        // Testando:
        System.out.println(media.apply(5.0, 5.0));


        // O Operador BiFunction recebe dois parâmetros de entrada e retorna uma saída, posso usar tipos diferentes para os parâmetros:
        BiFunction<Double, Double, String>  resultado = (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";
        // Testando:
        System.out.println(resultado.apply(7.8, 8.0));
    }
}
