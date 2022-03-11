package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    
    public static void main(String[] args) {
        
        Consumer<Produto> imprimir = p -> System.out.println(p.nome); 
        Produto p1 = new Produto("Caneta", 12.34, .09);
        Produto p2 = new Produto("Caderno", 19.90, .03);
        Produto p3 = new Produto("Borracha", 7.8, .18);
        Produto p4 = new Produto("Lápis", 4.39, .19);
        Produto p5 = new Produto("Notebbok", 2987.99, .09);
        imprimir.accept(p1);



        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        produtos.forEach(imprimir);

        produtos.forEach(System.out::println);
    }
}
