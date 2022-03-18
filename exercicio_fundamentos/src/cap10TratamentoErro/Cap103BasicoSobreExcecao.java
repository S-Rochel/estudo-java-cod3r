// Cap 10.3 - Básico Sobre Exceção
package cap10TratamentoErro;

public class Cap103BasicoSobreExcecao {
    
    public static void main(String[] args) {
        
        // Tray (Experimentar), catch (apanhar):
        try {
            System.out.println(7 / 0); // Erro
        } catch(Exception excecao) {
            System.out.println("Ocorreu um eero na linha 9!!!"); // Tratar erro
        }

        System.out.println("Fim");
    }
}
