package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    
    public static void main(String[] args) {
        
        // Map - trabalha com estrutura chave/valor.
        Map<Integer, String> mapa = new HashMap<>();


        // Adicionar valores no mapa (chave/valor).
        mapa.put(1, "A"); // put() - adiciona se o elemento não existir no Map, e se já existir ele substitui.
        mapa.put(2, "B");
        mapa.put(3, "C");
        mapa.put(4, "D");
        

        // Método para verificar o tamanho do Map.
        System.out.println("Tamanho do Map: " + mapa.size());



        // Método para verificar se um Map está vazio.
        System.out.println("Map está vazio? " + mapa.isEmpty());



        // Método para retornar o conjunto das chaves (todas).
        System.out.println("Retorna as chaves: " + mapa.keySet());



        // Método para retornar o conjunto dos valores (todos).
        System.out.println("Retornar os valores: " + mapa.values());



        // Método para retornar o conjunto das chaves e valores (todos).
        System.out.println("Reornar chave/valor: " + mapa.entrySet());



        // Método para verificar se o Map contêm uma determinada chave.
        System.out.println("Têm a chave 2? " + mapa.containsKey(2));



        // Método para verificar se o Map contêm um determinado valor.
        System.out.println("Têm o valor C? " + mapa.containsValue("C"));



        // Método para retornar um valor através da chave.
        System.out.println("Para a chave 3 o  valor é: " + mapa.get(3));



        // Uso do laço for para o Map.
        for (int chave : mapa.keySet()) {
            System.out.println(chave);
        }
        for(String valor : mapa.values()) {
            System.out.println(valor);
        }
        for(Entry<Integer, String> registro : mapa.entrySet()) {
            System.out.print(registro.getKey() + " => ");
            System.out.println(registro.getValue());
        }


        // Método para remover um elemento do Map.
        System.out.println("Remover elemento: " + mapa.remove(1));
        System.out.println("Remover elemento: " + mapa.remove(2, "B"));


        System.out.println("Tamanho Map: " + mapa.size());

    }
}
