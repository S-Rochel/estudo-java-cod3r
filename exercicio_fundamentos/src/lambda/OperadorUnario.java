// Funções Lambdas - Operador Unário
package lambda;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    
    public static void main(String[] args) {
        
        // O Unary Operator pode ser utilizado para fazer encadeamento de várias chamadas, pois o tipo de parâmetro de entrada e o mesmo tipo de retorno gerado.

        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        // Usando a composição "andThen" (e então - lê da esquerda para a direita):
        System.out.println(maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(2)); // 2 * 2   4 * 2  8 * 8

        // Usando a composição "compose" (compor - antes de executar a execute b, lê da direita para a esquerda):
        System.out.println(aoQuadrado.compose(vezesDois).compose(maisDois).apply(2));  // 2 * 2   4 * 2  8 * 8

    }
}
