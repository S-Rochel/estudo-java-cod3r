// Cap 12.3 - Padrão de Projeto Observer
package cap12PadraoObserver;

import java.util.Scanner;

// A classe Namorada implementa a interface ChegadaAniversarianteObserver
public class Namorada implements ChegadaAniversarianteObserver {
    
    // Como a classe imlementa a interface, temos que obrigatóriamente implementar o método contido na interface, o método chegou vai ser chamado sempre que o evento ocorrer, e neste método que o ambiente da surpresa é preparado:
    @Override
    public void chegou(ChegadaAniversarianteEvent event) {
        System.out.println("Apagar as luzes...");
        System.err.println("Fazer silêncio...");
        System.out.println("Surpresa!!!");        
    }
}
