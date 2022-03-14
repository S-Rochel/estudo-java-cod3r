package cap9StreamAPI;

public class Cap97MinMaxAluno {
    
    final String nome;
    final double nota;
        
    public Cap97MinMaxAluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {        
        return nome + " tem nota: " + nota;
    }
}
