package classe;

public class ClasseProdutoTeste {
    
    public static void main(String[] args) {
        
        // Criar intância de ClasseProduto.
        ClasseProduto p1 = new ClasseProduto();
        p1.nome = "Notebook";
        p1.preco = 4000.50;
        p1.desconto = 0.25;

        var p2 = new ClasseProduto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        // Acessar os objetos criados.
        System.out.println(p1.preco * (1 - p1.desconto));
        System.out.println(p2.preco * (1 - p2.desconto));
    }
}
