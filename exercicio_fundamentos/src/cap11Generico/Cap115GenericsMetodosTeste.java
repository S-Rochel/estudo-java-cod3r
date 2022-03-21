// Cap 11.5 - Usando Generics em Métodos Teste
package cap11Generico;

import java.util.Arrays;
import java.util.List;

public class Cap115GenericsMetodosTeste {
    public static void main(String[] args) {
        
        // Testando o uso do Generics em um método:
        // Exemplo 1:
        List <String> fruta = Arrays.asList("Uva", "Pera", "Maça", "Banana");
        String ultimaFruta = Cap115GenericsMetodos.getUltimoDaLista(fruta);
        System.out.println(ultimaFruta); // resp: Banana



        // Exemplo 2: 
        List <Double> numeros = Arrays.asList(0.1, 0.2, 0.3, 0.4, 0.5, 0.6);
        Double ultimoNumero = Cap115GenericsMetodos.getUltimoDaLista(numeros);
        System.out.println(ultimoNumero); // resp: 0.6

        // Resumindo foi construido um método com um tipo genérico associado, assim o método vai retornar o tipo que receber na invocação do método.
    }
}
