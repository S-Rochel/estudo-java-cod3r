package classe;

public class ClasseProduto {
    
    // Atributos.
    String nome;
    double preco;
    double desconto;

    double precoComDesconto() {
        return preco * (1 - desconto);
    }
}
