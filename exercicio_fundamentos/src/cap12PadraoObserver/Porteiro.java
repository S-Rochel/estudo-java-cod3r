// Cap 12.4 - Padrão de Projeto Observer
package cap12PadraoObserver;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

// A Classe Porteiro representará o Subject, ou seja, é ele que vai detectar o evento e avisar todos os interessados:
public class Porteiro extends Thread {

    // Criar uma lista Observadores e registrar um observador:
    private List <ChegadaAniversarianteObserver> observadores = new ArrayList <ChegadaAniversarianteObserver>();

    public void addChegadaAniversarianteObserver(ChegadaAniversarianteObserver observer) {
        this.observadores.add(observer);
    }
    
    
    /* Iremos aqui simular o evento da sequinte maneira:
    *  - Quando o evento for falso apertaremos qualquer tecla do teclado.
    *  - Quando o evento for verdaderio apertaremos a tecla número 1 do teclado, disparando assim o evento:  
    */
    @Override
    public void run() {   
        // Capturar o evento pelo teclado:     
        Scanner entrada = new Scanner(System.in);

        // verificar o teclado:
        while(true) {
            int valor = entrada.nextInt();

            // Se a tecla digitada for igual a 1, o evento será disparado:
            if(valor == 1) {
                // Aqui estâncio um evento e passo como parâmetro para o construtor a data atual:
                ChegadaAniversarianteEvent event = new ChegadaAniversarianteEvent(new Date());

                // Depois de estânciar o evento vamos notificar o Observer que o evento ocorreu (Precisa do List):
                for(ChegadaAniversarianteObserver observer: this.observadores) {
                    observer.chegou(event);
                }
            } else {
                System.out.println("Alarme Falso");
            }
        }
    }
}
