package collections;

import java.util.ArrayList;

public class Lista {
    
    public static void main(String[] args) {
         
        // Lista pode ser heterogênea, lista pode ser homogênea, pode aceitar objetos duplicados, será ordenada, será indexada.

        // Criar uma Lista do tipo Usuario.
        ArrayList<Usuario> lista = new ArrayList<>();

        // Adicionar elementos à lista.
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        // Verificar os itens da lista pelo com o laço for.
        for(Usuario nome: lista) {
            System.out.println(nome.nome); // Carlos
                                           // Lia
                                           // Bia
                                           // Manu
        }
        // Verificar os itens da lista pelo index.
        System.out.println("No index 2 está: " + lista.get(2));

        // Remover item da lista apartir de um indíce.
        lista.remove(1);
        System.out.println(lista);

        // Remover item da lista apartir de um objeto.
        lista.remove(new Usuario("Manu"));
        System.out.println(lista); 

        // Verificar se a lista contêm um elemento.
        System.out.println(lista.contains(new Usuario("Bia")));

        
    }
}
