package cap13PadraoObserverNoSwing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
    
    public static void main(String[] args) {
        
        // Criar uma intância de janela gráfica:
        JFrame janela = new JFrame("Observador");

        // Indicar que a operação padrão da janela seja encerrar a aplicação quando fechar a janela, se não fizer isso quando fechamos a janela a aplicação continua rodando:
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Definir tamanho da tela:
        janela.setSize(600, 200);

        /**
         * Centralizar a janela:
         * - janela.setLocationRelativeTo(null); será centralizada a janela com relação a tela do computador.
         * - 
         */
        janela.setLocationRelativeTo(null);

        // Criar botão;
        JButton botao = new JButton("Clicar");

        // Adicionar o botão na tela, por padrão ele ocupará a tela inteira:
        janela.add(botao);

        // Ajustar o layout do botão:
        janela.setLayout(new FlowLayout());

        // Implementar o padrão observer, vai ficar escutando o botão e toda vez que houver um evento no botão executára a ação que estiver na Lambda Expression:
        botao.addActionListener(eventoNoBotao -> System.out.println("Ação executada..."));

        // Tornar a janela visivel:
        janela.setVisible(true);


        // 
    }
}
