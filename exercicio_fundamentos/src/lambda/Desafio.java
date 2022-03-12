// Funções Lambdas - Desafio
package lambda;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Desafio {
    
    public static void main(String[] args) {
        
        Produto p = new Produto("iPad", 3235.89, 0.13);

        /**
         * 1. Apartir do produto calcular o preço real (com desconto)
         * 2. Imposto Municipal: >= 2500 (8.5%) / < 2500 (isento)
         * Frete: >= 3000 (100) / < 3000 (50)
         * 4. Arredondar: Deixar duas casas decimais
         * 5. Formatar: R$ 1234, 56
         */

         // Calculando o preço real:
         BinaryOperator<Double> precoReal = (n1, n2) -> n1 * (1 - n2);

         // Calculanndo e descontando o imposto Municipal:
         UnaryOperator<Double> precoImposto = valor -> valor >= 2500 ? valor * (1 + 0.085) : valor;

         // Calcular o frete:
         UnaryOperator<Double> precoComFrete = valor -> valor >= 3000 ? valor + 100 : valor + 50;

         double precoFinal = precoReal.andThen(precoImposto).andThen(precoComFrete).apply(p.preco, p.desconto);

         // Testando:
         System.out.printf("Valor final do produto: R$ %.2f", precoFinal);
    }
}
