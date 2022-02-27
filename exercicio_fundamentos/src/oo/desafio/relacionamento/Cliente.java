package oo.desafio.relacionamento;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    
    // Relacionamento - um cliente terá uma lista de compras.
    // Criar um método para retornar quanto o cliente gastou.
    final String nome;
    final List<Compra> listaCompras = new ArrayList<>();

    // construtor.
    Cliente(String nome) {
        this.nome = nome;
    }

    // método para obter o valor total de todas as compras do cliente.
    double obterValorTotal() {
        double total = 0;
        for (Compra compraTotal : listaCompras) {
            total += compraTotal.obterValorTotal();
        }
        return total;
    }
}
