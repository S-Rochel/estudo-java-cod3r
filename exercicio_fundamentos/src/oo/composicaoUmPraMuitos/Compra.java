package oo.composicaoUmPraMuitos;

import java.util.ArrayList;

public class Compra {
    // Relação de um pra muitos, uma compra pra muitos itens e muitos itens para uma compra.

    String cliente; 
    ArrayList<Item> itens = new ArrayList<>();


    double obterValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.quantidade * item.preco;
        }
        return total;
    }
}
