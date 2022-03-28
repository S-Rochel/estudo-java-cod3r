// Cap 12.2 - Padrão de Projeto Observer
package cap12PadraoObserver;

// Interface
public interface ChegadaAniversarianteObserver {

    // Esté método deverá ser chamado sempre que o evento ocorrer, ou seja, quando o aniversáriante chegar:
    public void chegou(ChegadaAniversarianteEvent event);
}
