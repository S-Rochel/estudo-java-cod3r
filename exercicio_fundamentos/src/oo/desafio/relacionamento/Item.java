package oo.desafio.relacionamento;


public class Item {
    
    // Relacionamento - um item terá um produto, e um produto estará em vários itens.
    // terá o atributo quantidade.
    final Produto produto;
    final int quantidadeProduto;
    
    // construtor.
    Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidadeProduto = quantidade;
    }

    
    

}
