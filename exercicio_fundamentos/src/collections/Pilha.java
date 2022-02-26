package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    
    public static void main(String[] args) {
        
        // Stack (Pilha) - Primeiro que entra é o último que sai(LIFO)
        Deque<String> pilha = new ArrayDeque<>(); // ArrayDeque - Implementa uma pilha em Java.



        // Métodos para adicionar elementos na pilha.
        pilha.add("A");    // retorna booleano.
        pilha.push("B");   // retorna uma excessão se a pilha estiver cheia.
        pilha.push("C");

        

         // Uso do foreach.
         for (String elemento : pilha) {
            System.out.println(elemento);
        }

        

        // Métodos que lê o elemento na pilha mas não o retira.
        System.out.println("peek(): " + pilha.peek());
        System.out.println("element(): " + pilha.element());



        // Métodos para remover elementos da pilha.
        System.out.println("poll(): " + pilha.poll()); // Se não houver elementos para remover retornará "null".
        System.out.println("remove(): " + pilha.remove()); // Se não houver elementos para remover retornará uma excessão.
        System.out.println("pop(): " + pilha.pop()); // Se não houver elementos para remover retornará uma excessão.



        // Outros métodos:
        // pilha.size() - tamanho da pilha.
        // pilha.clear() - limpar a pilha.
        // pilha.contains() - verifica se um elemento está na pilha, retorna booleano.
        // pilha.isEmpty(); - verifica se uma pilha está vazia.



       
    }
}
