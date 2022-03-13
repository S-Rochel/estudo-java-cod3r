// Cap 9.3 - Map e Stream, desafio
package cap9StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Cap93MapDesafio {
    
    public static void main(String[] args) {
        
        // Definir um lista de números inteiros:
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9); 
        Consumer<String> imprimir = System.out::println;

        /**
         * 1. Converter cada número da lista para uma string binária, ex: 6 => "110";
         * 2. inverter a string, ex: "110" => "011";
         * 3. Converter a string para inteiro, ex: "011" => 3.
         */

        // Inverter uma string:
        UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();

        // Converter de string para inteiro:
        Function<String, Integer> converter = s -> Integer.parseInt(s, 2);

         // Resolução do desafio:
         nums.stream()
         .map(n -> n.toBinaryString(n))
         .map(inverter)  
         .map(converter)      
         .forEach(System.out::println);

         
    }
}
