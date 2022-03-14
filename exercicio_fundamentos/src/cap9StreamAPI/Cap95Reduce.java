// Cap 9.5 - Reduce e Stream
package cap9StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import lambda.Predicado;

public class Cap95Reduce {
    
    public static void main(String[] args) {
        
        // Reduce - transforma uma sequência de dados/objetos dentro de uma stream em outra coisa totalmente diferente, obs: Reduce é uma função terminadora.


        // Exercício 1, somar todos os elementos de uma lista utilizando o Reduce:
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);        
        BinaryOperator<Integer> soma = (acum, numAtual) -> acum + numAtual;
        Integer total = nums.stream().reduce(0, soma); // resp: 45
        /** Exemplo: 1
         * Integer total = nums.stream().reduce(100, soma);    resp: 145
         */ 

         /** Exemplo: 2
          * int total = nums.stream().reduce(soma).get(); resp: 45  
          */
        
        /** Exemplo: 3
         * System.out.println(nums.stream().reduce((x, n) -> x + n).toString()); resp: Optional[45]
         */
        
        // Exemplo: 4        
        nums.stream()
            .filter(n -> n > 5)
            .reduce(soma)
            .ifPresent(System.out::println); // resp: 30


        // Exercício 2, usando a classe "Cap95ReduceAluno", mais filter, map e reduce:
        Cap95ReduceAluno a1 = new Cap95ReduceAluno("Ana", 7.1);
        Cap95ReduceAluno a2 = new Cap95ReduceAluno("Luna", 6.1);
        Cap95ReduceAluno a3 = new Cap95ReduceAluno("Gui", 8.1);
        Cap95ReduceAluno a4 = new Cap95ReduceAluno("Gabi", 10);

        List<Cap95ReduceAluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Cap95ReduceAluno> alunoAprovado = aluno -> aluno.nota >= 7;

        Function<Cap95ReduceAluno, Double> apenasNota = aluno -> aluno.nota;
        
        BinaryOperator<Double> somatorio = (a, b) -> a + b;

        alunos.stream()
            .filter(alunoAprovado)
            .map(apenasNota)
            .reduce(somatorio)
            .ifPresent(System.out::println); // resp: 25.2

    }
}
