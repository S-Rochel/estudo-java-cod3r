package classe;

import java.util.ArrayList;

import java.util.List;

public class ProvaCurso {
    
    private String nome;
    private List<String> disciplina = new ArrayList<>();

    public ProvaCurso(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }


    public void addDisciplina(String nome) {
        this.disciplina.add(nome);
    }
    
    @Override
    public String toString() {
        return disciplina.toString();
    }
}
