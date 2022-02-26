package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    
    public static void main(String[] args) {
        
        // QUEUE (Fila) - primeiro que entra, primeiro que sai (FIFO).
        Queue<String> fila = new LinkedList<>(); // linkedList - representa uma fila dentro do Java.


        // Métodos para adicionar elementos à fila.
        fila.add("A");    // Adiciona o elemento à fila, se a fila estiver cheia, lança uma excessão.

        fila.offer("B");  // Adiciona o elemento à fila, se a fila estiver cheia, retorna "false".
        fila.offer("C");
        fila.offer("D");



        // Métodos para pegar um elemento da fila.
        System.out.println(fila.peek()); // peek() - lê o primeiro elemento da fila, mas não remove este elemento. Se não tiver elemento na fila retorna "null".

        System.out.println(fila.element()); // element() - lê o primeiro elemento da fila, mas não remove este elemento. Se não tiver elemento na fila lança uma excessão.



        //  Método para saber o tamanho da fila.
        System.out.println(fila.size());



        // Método para limpar a fila.
        // fila.clear();



        // Método para saber se a fila está vazia.
        System.out.println(fila.isEmpty());



        // Método para retornar o primeiro elemento da fila já removendo este elemento.
        System.out.println(fila.poll()); // poll() - se não houver elementos retorna "null".

        System.out.println(fila.remove()); // remove() - se não houver elementos retorna uma excessão. 




        // Método para saber se um determinado elemento está na fila.
        System.out.println("D está na fila? " + fila.contains("D"));



        System.out.println(fila.size());
    }
}
