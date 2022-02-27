package oo.composicaoMuitospraMuitos;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    // para cada aluno criado terá sua própria lista de cursos.

    final String nome;
    final List<Curso> cursos = new ArrayList<>(); // "final" torna a lista constante, ou seja com um endereço de memória fixo, mas seu conteúdo é variado.

    // construtor
    Aluno(String nome) {
        this.nome = nome;
    }

    // método para adicionar curso
    void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this); // criar relação bidirecional
    }

    // método para converter um objeto para o formato string.
    public String toString() {
        return nome;
    }
}
