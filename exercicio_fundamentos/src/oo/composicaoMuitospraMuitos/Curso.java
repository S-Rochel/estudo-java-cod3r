package oo.composicaoMuitospraMuitos;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    
    // cada curso criado terá sua própria lista de alunos.

    final String nome;
    final List<Aluno> alunos = new ArrayList<>(); // // "final" torna a lista constante, ou seja com um endereço de memória fixo, mas seu conteúdo é variado.

    // construtor
    Curso(String nome) {
        this.nome = nome;
    }

    // método para adicionar aluno 
    void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(this); // cria aqui uma relação bidirecional
    }

    public String toString() {
        return nome;
    }
}
