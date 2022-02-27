package oo.desafio.relacionamento;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    
    // Relacionamento - uma compra terá uma lista de itens.
    Produto precoP;
    final List<Item> listaItens = new ArrayList<>();

    // método para adicionar itens a lista de compras.
    void adicionarItem(Produto produto, int quantidade) {
        this.listaItens.add(new Item(produto, quantidade));
    }

    void adicionarItem(String nome, double preco, int qtde) {
        var produto = new Produto(nome, preco);
        this.listaItens.add(new Item(produto, qtde));
    }

    // método para calcular o valor total da compra.
    double obterValorTotal() {
        double total = 0;
        for (Item item : listaItens) {
            total += item.quantidadeProduto * item.produto.precoProduto;
        }
        return total;
    }
}
