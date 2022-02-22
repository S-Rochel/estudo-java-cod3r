package classe;

public class ClasseProduto {
    
    // Atributos.
    String nome;
    double preco;
    static double desconto = 0.25;

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
