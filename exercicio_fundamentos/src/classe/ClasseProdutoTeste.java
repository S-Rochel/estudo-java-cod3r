package classe;

public class ClasseProdutoTeste {
    
    public static void main(String[] args) {
        
        // Criar intância de ClasseProduto.
        ClasseProduto p1 = new ClasseProduto("Notebook");
        //p1.nome = "Notebook";
        p1.preco = 4000.00;
        // ClasseProduto.desconto = 0.25;

        var p2 = new ClasseProduto("Caneta Preta");
        //p2.nome = "Caneta Preta";
        p2.preco = 100.00;
        // ClasseProduto.desconto = 0.50;

        // Acessar os objetos criados.
        System.out.println(p1.precoComDesconto());
        System.out.println(p2.precoComDesconto());
    }
}
