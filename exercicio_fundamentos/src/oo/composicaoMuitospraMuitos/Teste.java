package oo.composicaoMuitospraMuitos;

public class Teste {
    
    public static void main(String[] args) {
        
        // Ccriar os objetos.
        Aluno aluno1 = new Aluno("Maria");
        Aluno aluno2 = new Aluno("Pedro");
        Aluno aluno3 = new Aluno("João");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("JavaScript");
        Curso curso3 = new Curso("Python");

        // Fazer o relacionamento entre os objetos.
        aluno1.adicionarCurso(curso1);

        aluno2.adicionarCurso(curso1);
        aluno2.adicionarCurso(curso2);

        aluno3.adicionarCurso(curso1);
        aluno3.adicionarCurso(curso2);
        aluno3.adicionarCurso(curso3);

        for (Curso cursos : aluno3.cursos) {
            System.out.println ("O aluno 3 está matriculado no curso: " + cursos.nome);            
        }

        System.out.println();

        for (Aluno alunos : curso1.alunos) {
            System.out.println("O curso 1 tem o aluno: " + alunos.nome);
        }

        System.out.println();
        // apartir de um aluno, pegar o primeiro curso deste aluno, e apartir deste curso pegar todos os alunos deste curso.
        System.out.println(aluno1.cursos.get(0).alunos);

        // apartir de um curso, pegar o primeiro aluno deste aluno, e apartir deste aluno pegar todos os cursos deste aluno.
        System.out.println(curso3.alunos.get(0).cursos);
    }
}
