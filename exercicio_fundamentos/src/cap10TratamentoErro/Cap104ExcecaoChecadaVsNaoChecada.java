// Cap 10.4 - Exceção Checada vs Exceção não Checada.
package cap10TratamentoErro;

public class Cap104ExcecaoChecadaVsNaoChecada {
    
    public static void main(String[] args) {
        // throw: lançar erro.
        try {
            geraErro1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
           
        try {
            geraErro2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       

        System.out.println("Fim do programa");
        
    }

    // Exceção não checada ou não verificada:
    static void geraErro1() {
        throw new RuntimeException("Erro #1");
    }

    // Exceção checada ou verificada, neste caso e necessário indicar na assinatura do método a palavra "throws Exception"
     static void geraErro2() throws Exception {
        throw new Exception("Erro #2");
     }
}
