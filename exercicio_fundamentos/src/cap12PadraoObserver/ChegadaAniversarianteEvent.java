// Cap 12.1 - Padrão de Projeto Observer
package cap12PadraoObserver;

import java.util.Date;

public class ChegadaAniversarianteEvent {

    // Esta classe possui todas as informações relevantes do evento, ou seja, ela carrega os dados do evento.

    // Atributos:
    private final Date horaDaChegada;
    
    // Construtor, que recebe como parâmetro a hora da chegada:
    public ChegadaAniversarianteEvent(Date date) {   this.horaDaChegada = date;   
    }

    // Método Get:
    public Date getHoraDaChegada() {
        return horaDaChegada;
    }    

}
