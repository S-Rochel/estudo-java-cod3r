// Cap 11.6 - Criando uma Estrutura Chave/Valor com Generics.
package cap11Generico;

public class Cap116GenericsComChaveValorTeste {
    // Teste:
    public static void main(String[] args) {
        
        Cap116GenericsComChaveValorPares <Integer, String> resultadoConcurso = new Cap116GenericsComChaveValorPares<>();
        resultadoConcurso.adicionar(1, "Maria");
        resultadoConcurso.adicionar(2, "Pedro");
        resultadoConcurso.adicionar(3, "Gui");
        resultadoConcurso.adicionar(4, "Ana");
        resultadoConcurso.adicionar(2, "Rebeca");

        System.out.println(resultadoConcurso.getValor(1)); // resp: Maria
        System.out.println(resultadoConcurso.getValor(2)); // resp: Rebeca
        System.out.println(resultadoConcurso.getValor(3)); // resp: Gui
        System.out.println(resultadoConcurso.getValor(4)); // resp: Ana
    }
}
