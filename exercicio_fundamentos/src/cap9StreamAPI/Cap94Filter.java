// Cap 9.4 - Filter e Stream
package cap9StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Cap94Filter {
    
    public static void main(String[] args) {
        
         // Implemmentar uma lista de alunos:
    Cap94FilterAluno a1 = new Cap94FilterAluno("Ana", 7.8);
    Cap94FilterAluno a2 = new Cap94FilterAluno("Bia", 5.8);
    Cap94FilterAluno a3 = new Cap94FilterAluno("Daniel", 9.8);
    Cap94FilterAluno a4 = new Cap94FilterAluno("Gui", 6.8);
    Cap94FilterAluno a5 = new Cap94FilterAluno("Rebeca", 7.1);
    Cap94FilterAluno a6 = new Cap94FilterAluno("Pedro", 8.8);

    List<Cap94FilterAluno> listaAlunos = Arrays.asList(a1, a2, a3, a4, a5, a6);


    // Filtrar os alunos com nota maior que 7 e mostrar uma lista dos aprovados:
    listaAlunos.stream()
    .filter(aluno -> aluno.nota >= 7)
    .map(aluno -> "Parabéns " + aluno.nome + " ! Voçê foi aprovado!")
    .forEach(System.out::println);
    /**
     * resp:
     * Parabéns Ana ! Voçê foi aprovado!
     * Parabéns Daniel ! Voçê foi aprovado!
     * Parabéns Rebeca ! Voçê foi aprovado!
     * Parabéns Pedro ! Voçê foi aprovado!
     */
    }
    
}
