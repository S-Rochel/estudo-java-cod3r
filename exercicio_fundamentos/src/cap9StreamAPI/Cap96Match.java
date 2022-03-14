// Cap 9.6 - Match (All, Any e None)
package cap9StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Cap96Match {
    
    // Match - verifica a compatibilidade
    public static void main(String[] args) {
        
        Cap96MatchAluno a1 = new Cap96MatchAluno("Ana", 7.1);
        Cap96MatchAluno a2 = new Cap96MatchAluno("Luna", 6.1);
        Cap96MatchAluno a3 = new Cap96MatchAluno("Gui", 8.1);
        Cap96MatchAluno a4 = new Cap96MatchAluno("Gabi", 10);

        List<Cap96MatchAluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Cap96MatchAluno> aprovado = aluno -> aluno.nota >= 7;

        // Verificar com o Match se todos os alunos foram aprovados:
        System.out.println(alunos.stream().allMatch(aprovado)); // resp: false

        // Verificar com o Match se algum aluno foi aprovado:
        System.out.println(alunos.stream().anyMatch(aprovado)); // resp: true

        // Verificar com o Match se nenhum dos alunos foi aprovado:
        System.out.println(alunos.stream().noneMatch(aprovado)); // resp: false
    }
}
