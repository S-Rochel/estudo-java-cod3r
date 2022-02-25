package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoSetHomogeneo {
    
    public static void main(String[] args) {
        
        // Definir um conjunto homogêneo, ou seja com todos os dados do mesmo tipo. Com <..> obriga o conjunto a ter um tipo definido de dados.
        Set<String> lista = new HashSet<String>();
        lista.add("Ana");        
        lista.add("Carlos");        
        lista.add("Lucas");        
        lista.add("Pedro");  
        
        // Sabento o tipo dos elementos podemos usar o laço For.
        for(String i: lista){
            System.out.println(i); // Ana
                                   // Lucas
                                   // Pedro
                                   // Carlos não fica ordenado porque o HasSet e um conjunto não ordenado
        }
    }
}
