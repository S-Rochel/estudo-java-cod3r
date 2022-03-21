// Cap 11.5 - Usando Generics em Métodos
package cap11Generico;

import java.util.List;

public class Cap115GenericsMetodos {
    
    // Fazer uma função com um tipo <T> associado a ela, na pratica o T será substituido pelo tipo passado na Lista.
    public static <T> T getUltimoDaLista(List<T> lista) {
        return lista.get(lista.size() - 1);
    }
}
