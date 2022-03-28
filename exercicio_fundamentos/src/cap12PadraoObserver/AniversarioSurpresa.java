// Cap 12 - Padrão de Projeto Observer
package cap12PadraoObserver;
/**
 * Em Java o Padrão Observer e chamado de Listener.
 * Com o Padrão Observer um Subject fica monitorando o evento e quando ele acontece notifica o Observer.
 * 
 * Exemplo:
 * Nome do Evento: Aniversário Surpresa.
 * 
 * Personagens:
 * - A Namorada -> Possue o papel de Observer.
 * - O Porteiro -> Possue o papel de subject, ele vai detectar o evento e notificar os interessados (os Observers).
 * - O Evento -> O evento à ser obersavado é a chegada do aniversáriante.
 * - A Histária -> Todos os convidados estão no apartamento esperando o aniversáriante chegar para fazer a surpresa.
 * 
 * 
 * Neste cenário há duas possibilidades de a Namorada se preparar para a chegada do aniversáriante, uma possibilidade sem usar o padrão observer, e outra possibilidade usando o padrão observer.
 * 
 * Sem o Padrão Observer:
 * A namorada fica na janela esperando o aniversáriante chegar, note qu ela precisa ficar o tempo todo olhando a rua e não aproveita a festa, em outras palavras ela fica em loop aguardando.
 * 
 * Com o Padrão Observer:
 * A namorada delega ao porteiro a tarefa de verificar a hora que o aniversáriante chega, e enquanto o porteiro não avisa da chgada do aniversáriante ela pode fazer outras tarefas e curtir a festa.
 * Neste cenário quando o aniversáriante chega, o porteiro interfona para a namorada e avisa da chegada, assim o evento surpresa pode ser preparado.
 * 
 * Resumindo:
 * Sem o Padrão Observer temos um caso Síncrono, que é quando o sistema fica travado esperando um resposta.
 * Com o Padrão Observer temos um caso Assíncrono, que é quando o sistema fica livre para fazer outras tarefas enquanto a resposta não chega.
 * 
 * Estrutura do sistema:
 * Projeto: Aniversário Surpresa
 * # AniversarioSurpresa
 *      # src
 *          # observer (pacote)
 *              # AniversarioSurpresa (Classe main)
 *              # ChegadaAniversarianteEvent (Classe)
 *              # ChegadaAniversarianteObserver(Interface)
 *              # Namorada (Classe)
 *              # Porteiro (Classe)
 */
public class AniversarioSurpresa {
    
    public static void main(String[] args) {
        
        // Para executar o evento, vamos primeiramente estânciar:
        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        // Após estânciar a namorada e o porteiro, registrar a namorada no porteiro, para que ela seja notificada da chegada do namorado:
        porteiro.addChegadaAniversarianteObserver(namorada);

        // Por último fazer o porteiro monitorar os eventos:
        porteiro.start(); 
    }
}
