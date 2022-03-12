// Cap 9.1 - List / Iterator / Stream

package cap9StreamAPI;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class cap91ListIteratorStream {

    public static void main(String[] args) {
        // Criando uma "List":
        List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");

        // Formas de apresentar a List no console usando o laço for foreach:
        for(int i = 0; i < aprovados.size(); i++) {
            System.out.println(aprovados.get(i));
        } /* resp:
            Lu
            Gui
            Luca
            Ana
          */
        for (String nomeAprovado : aprovados) {
            System.out.println(nomeAprovado);
        } /* resp:
            Lu
            Gui
            Luca
            Ana
          */

        // Formas de apresentar a List no console usando o Iterator:
        Iterator<String> iteracao = aprovados.iterator();
        while(iteracao.hasNext()) {                // tem próximo?
            System.out.println(iteracao.next());   // me de a próxima string
        } /* resp:
            Lu
            Gui
            Luca
            Ana
          */

        // Formas de apresentar a List no console usando o Stream (laço fica interno e não precisa ser implentado):
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);
          /* resp:
            Lu
            Gui
            Luca
            Ana
          */
    }
}
