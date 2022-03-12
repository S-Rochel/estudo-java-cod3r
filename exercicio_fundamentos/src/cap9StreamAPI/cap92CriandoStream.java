// Cap 9.2 - Criando Stream
package cap9StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class cap92CriandoStream {
    
    public static void main(String[] args) {
        
        /*
            Usar aqui o "Metod "Reference", pegar o System.out::print e atribuir para uma variável usando a interface funcional "Consumer", isso porque o "Consumer" recebe um parâmetro de um tipo e não retorna nada.
        */
        Consumer<String> imprimirConsole = System.out::print;


        // Criando uma Stream usando o método estático "of":
        Stream<String> limguagens = Stream.of("Java ", "Lua ", "JS\n");
        // Imprimir:
        limguagens.forEach(imprimirConsole); // resp: Java Lua JS

        // Criando uma Stream apartir de um Array:
        String[] maisLinguagens = {"Python ", "Lisp ", "Perl ", "Go\n"};

        Stream.of(maisLinguagens).forEach(imprimirConsole); // resp: Python Lisp Perl Go

        // Criando Streams através do Arrays:
        Arrays.stream(maisLinguagens).forEach(imprimirConsole); // resp: Python Lisp Perl Go
        Arrays.stream(maisLinguagens, 1, 3).forEach(imprimirConsole); // resp: Lisp Perl, pega um sub conjunto

        // Criando Stream através das colections:
        List<String> outrasLinguagens = Arrays.asList("C ", "PHP ", "Kotlin\n");
        outrasLinguagens.stream().forEach(imprimirConsole); // resp: C PHP Kotlin
        outrasLinguagens.parallelStream().forEach(imprimirConsole); /* 
                             resp:
                             PHP Kotlin
                             C
                             "não exibe na sequência porque o stream foi feito de forma paralela"
                          */
    }
}
