package cap9StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Cap97MinMax {
    
    public static void main(String[] args) {
        
        Cap97MinMaxAluno a1 = new Cap97MinMaxAluno("Ana", 7.1);
        Cap97MinMaxAluno a2 = new Cap97MinMaxAluno("Luna", 6.1);
        Cap97MinMaxAluno a3 = new Cap97MinMaxAluno("Gui", 8.1);
        Cap97MinMaxAluno a4 = new Cap97MinMaxAluno("Gabi", 10);

        List<Cap97MinMaxAluno> alunos = Arrays.asList(a1, a2, a3, a4);

        // Usando a Interface Funcional "Comparator":
        Comparator<Cap97MinMaxAluno> compararNota = (aluno1, aluno2) -> {
            if(aluno1.nota > aluno2.nota) return 1;
            if(aluno1.nota < aluno2.nota) return -1;
            return 0;
            };

        // Usando a Função Comparator para comparar os elementos de uma stream() e retornar o de maior valor:
        System.out.println(alunos.stream().max(compararNota).get()); // resp: Gabi tem nota: 10.0

        // Usando a Função Comparator para comparar os elementos de uma stream() e retornar o de menor valor:
        System.out.println(alunos.stream().min(compararNota).get()); // resp: Luna tem nota: 6.1
    }
}
