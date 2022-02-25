package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoSetHeterogeneo {
    
    public static void main(String[] args) {
        
        // Definir um conjunto heterogêneo (que tem vários tipo).
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("teste");
        conjunto.add(1);
        conjunto.add("x");

        // Ver a quantidade de elementos de um conjunto.
        System.out.println("Tamanho do conjunto: " + conjunto.size()); // Tamanho do conjunto: 5

        conjunto.add(1);
        System.out.println("Tamanho do conjunto: " + conjunto.size()); // Tamanho do conjunto: 5, o set collections não aceita repetição, por isso continua tendo o tamanho 5


        // Remover elemenntos de dentro de um conjunto, retorna true se o elemento existir no conjunto ou false se o elemento não existir no conjunto.
        System.out.println(conjunto.remove(1.2)); // true

        System.out.println(conjunto.size()); // 4


        // Verificar se um determinado elemento existe no cconjunto.
        System.out.println(conjunto.contains("x")); // true
        System.out.println(conjunto.contains(1.2)); // false, pois foi excluído do conjunto


        // Outra forma de difinir um conjunto.
        Set conjuntoNums = new HashSet();
        conjuntoNums.add(1);
        conjuntoNums.add(2);
        conjuntoNums.add(3);

        // Verificar os conjuntos existentes.
        System.out.println("Conjunto com hashset: " + conjunto); // [teste, 1, x, true]
        System.out.println("Conjunto com set: " + conjuntoNums); // [1, 2, 3]

        // Fazer união de conjuntos.
        conjunto.addAll(conjuntoNums); 
        System.out.println("União dos conjuntos: " + conjunto); //  [teste, 1, 2, 3, x, true]

        // Interseção entre dois conjuntos.
        conjunto.retainAll(conjuntoNums);
        System.out.println(conjunto); // [1, 2, 3] 

        // Limpar conjunto.
        conjunto.clear();
        System.out.println(conjunto); // []
    }
}
