package estruturaDeControle;

import javax.swing.JOptionPane;

public class If_Else {
    
    public static void main(String[] args) {
        // Verificar se um número informado é par ou impar.

        // Entrada de dados.
        String valor = JOptionPane.showInputDialog(null, "Informe um número: ");

        // Lógica.
        int numero = Integer.parseInt(valor);
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número é par", "PAR OU IMPAR", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "O número é impar", "PAR OU IMPAR", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
