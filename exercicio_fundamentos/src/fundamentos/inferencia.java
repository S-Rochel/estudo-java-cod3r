package fundamentos;

public class inferencia {

    public static void main(String[] args) {
        
        // se não colocar o tipo da variável, o Java vai inferir o tipo conforme o valor atribuído a variável.
        var a = 4.5;
        var b = "Teste";
        
        System.out.println(a + b);
        // quando atribuimos um valor para a variável o java fixa (infere) o tipo da variável conforme aquele valor, daí pra frente não pode mais atribuir pra variável um outro tipo de dado. Ex: a = "texto" -> isso gera erro!!!
    }
    
}
