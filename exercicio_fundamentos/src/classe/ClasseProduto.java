package classe;

public class ClasseProduto {
    
    // Atributos.
    String nome;
    double preco;
    double desconto;

    // Construtores.
    ClasseProduto(String nomeInicial) {
        this.nome = nomeInicial;
    }

    ClasseProduto() {

    }

    // Métodos.
    double precoComDesconto() {
        return preco * (1 - desconto);
    }
}
