// Cap 11.6 - Criando uma Estrutura Chave/Valor com Generics.
package cap11Generico;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;


public class Cap116GenericsComChaveValorPares <C extends Number, V>{

    // Criar um atributo Set do tipo par, de maneira que seja respeitado a ordem de inserção (TreeSet()) assim:
    // private final Set <Cap116GenericsComChaveValorPar<String, Boolean>> itens = new TreeSet<>();
    // ou assim: "obs, assim precisa colocar a notação de tipo Generics na classe (<C extends Number, V>), extends Number restringe que a chave só poderá ser do tipo Number"
    private final Set<Cap116GenericsComChaveValorPar<C, V>> itens = new LinkedHashSet(); // obs: Set não aceita duplicidade


    public void adicionar(C chave, V valor) {
        if(chave == null) return; // ou seja se a chave for null sai do método.
        // verificar se já contém o valor, se tiver atualiza o valor:
        Cap116GenericsComChaveValorPar <C, V> novoPar = new Cap116GenericsComChaveValorPar <C, V>(chave, valor);
        if(itens.contains(novoPar)) {
            itens.remove(novoPar); // se contém remove oque estiver
        }
        itens.add(novoPar);
    }
         
        // Verificar se a chave está setada, ou seja que não há dentro da estrutura nenhum valor associado a chave passada:
    public V getValor(C chave) {              
        if(chave == null) return null;
            
        Optional<Cap116GenericsComChaveValorPar <C, V>> parOpcional = itens.stream()
            .filter(par -> chave.equals(par.getChave()))
            .findFirst();
        return parOpcional.isPresent() ? parOpcional.get().getValor() : null;
            
    }   
}
