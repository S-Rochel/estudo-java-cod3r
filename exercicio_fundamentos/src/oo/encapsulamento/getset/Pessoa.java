package oo.encapsulamento.getset;

public class Pessoa {
    
    private int idade;
    private String nome;

    //construtor
    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade);
        if(novaIdade >= 0 && novaIdade <= 120) {
            this.idade = novaIdade;
        }    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
