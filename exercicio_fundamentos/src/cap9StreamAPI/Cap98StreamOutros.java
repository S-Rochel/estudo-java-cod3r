// Cap 9.8 - Stream API Outros
package cap9StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Cap98StreamOutros {
    
    public static void main(String[] args) {
        
        Cap98StreamOutrosAlunos a1 = new Cap98StreamOutrosAlunos("Ana", 7.1);
        Cap98StreamOutrosAlunos a2 = new Cap98StreamOutrosAlunos("Luana", 6.1);
        Cap98StreamOutrosAlunos a3 = new Cap98StreamOutrosAlunos("Gui", 8.1);
        Cap98StreamOutrosAlunos a4 = new Cap98StreamOutrosAlunos("Gabi", 10);
        Cap98StreamOutrosAlunos a5 = new Cap98StreamOutrosAlunos("Ana", 7.1);
        Cap98StreamOutrosAlunos a6 = new Cap98StreamOutrosAlunos("Luana", 6.1);
        Cap98StreamOutrosAlunos a7 = new Cap98StreamOutrosAlunos("Gui", 8.1);
        Cap98StreamOutrosAlunos a8 = new Cap98StreamOutrosAlunos("Gabi", 10);

        List<Cap98StreamOutrosAlunos> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);


        // Distinct() - remove elementos duplicados (é necessário implementar o eguals() e hascode() para que o distinct() funcione corretamente):
        alunos.stream().distinct().forEach(System.out::println);; 
        /** resp:
         * Aluno: Ana  Nota: 7.1
         * Aluno: Luana  Nota: 6.1
         * Aluno: Gui  Nota: 8.1
         * Aluno: Gabi  Nota: 10.0
        */

        System.out.println("\n\n");
        // Skip / Limit - faz a páginação dentro de um stream(), ou seja pode pular elementos:
        alunos.stream().distinct().skip(2).limit(2).forEach(System.out::println);
        /** resp:
         * Aluno: Gui  Nota: 8.1
         * Aluno: Gabi  Nota: 10.0 
         */

        System.out.println("\n\n");
         // TakeWhile - pega elementos enquanto acontecer determinada condição:
         alunos.stream().distinct().skip(2).takeWhile(aluno -> aluno.nota >= 7).forEach(System.out::println);
         /** resp:
          * Aluno: Gui  Nota: 8.1
          * Aluno: Gabi  Nota: 10.0 
          */
    }
}
