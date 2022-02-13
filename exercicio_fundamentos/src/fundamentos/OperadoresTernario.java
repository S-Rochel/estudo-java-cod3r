package fundamentos;

public class OperadoresTernario {
    
    public static void main(String[] args) {
        // Sintaxe:  "expressão condicional" ? "true" : "false";

        double media = 7.6;
        String resultado = media >= 7.0 ? "Aprovado" : "Reprovado";
        System.out.println("O aluno está " + resultado);

        // Com uma expressão ternária uma dentro da outra.
        double mediaAluno = 8.1;
        String resultadoFinal = mediaAluno >=7.0 ? "Aprovado" : mediaAluno >= 5.0 ? "Recuperação" : "Reprovado";
        System.out.println("O aluno está " + resultadoFinal);

        // Outro exemplo.
        double nota = 9.9;
        boolean bomComportamento = false;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String res = temDesconto ? "Sim" : "Não";
    }
}
