// Cap 9.3 - Map e Stream
package cap9StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class cap93Map {
    
    public static void main(String[] args) {
        
        /*
            Usar aqui o "Metod "Reference", pegar o System.out::print e atribuir para uma variável usando a interface funcional "Consumer", isso porque o "Consumer" recebe um parâmetro de um tipo e não retorna nada.
        */
        Consumer<String> imprimir = System.out::println;

        // Criar um "List":
        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda");

        // stream() - Construindo a Stream + map() - função intermediária + foreach() - função final:
        marcas.stream().map(n -> n.toUpperCase()).forEach(imprimir); /*
                      resp:
                      BMW 
                      AUDI
                      HONDA
                    */  

        // Construir funções intermediárias, recebendo e retornando uma "string":
        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + ""; // necessário concatenar com uma string vazia para gerar uma string como retorno.
        UnaryOperator<String> enfase = n -> n + "!!!";
        
        // Usando composição:
        marcas.stream().map(maiuscula).map(primeiraLetra).map(enfase).forEach(imprimir);
        /*
            resp:
            B!!! 
            A!!!
            H!!!
        */  

        // Não é mexida na lista original:
        marcas.forEach(imprimir); 
        /*
            resp:
            BMW 
            Audi
            Honda
        */  

    }
}
