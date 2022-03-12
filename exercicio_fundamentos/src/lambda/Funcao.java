// Funções Lambdas - Interfaces Funcionais - Function
package lambda;

import java.util.function.Function;

public class Funcao {
    
    public static void main(String[] args) {
        // Interface funcional "Function" recebe através do generics um valor e retorna um outro valor.

        // Recebendo um Integer e retornando uma String
        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";
        // teste
        System.out.println(parOuImpar.apply(10));

        // Recebendo uma String e retornando uma String
        Function<String, String> oResultatoE = valor -> "O resultado é: " + valor;
        
        Function<String, String> empolgado = valor -> valor + "!!!";

        // Testando usando encadeamento de funções:
        String resultadoFinal = parOuImpar
        .andThen(oResultatoE)
        .andThen(empolgado)
        .apply(30);
        System.out.println(resultadoFinal);

        // Obs: no encadeamento de função a saída de um método deve ser do mesmo tipo da entrada do outro.
    }
}
