package oo.encapsulamento.getset;

public class PessoaTeste {
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Pedro", -30);

        System.out.println(p1.getIdade());

        // alterar idade
        p1.setIdade(20);
        System.out.println(p1.getNome() + " " + p1.getIdade());
    }
}
