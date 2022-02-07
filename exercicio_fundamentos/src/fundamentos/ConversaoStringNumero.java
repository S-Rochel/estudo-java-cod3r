package fundamentos;

// JOptionPane é uma classe visual, onde vai aparecer uma telinha. showInputDialog e uma funcionalidade, ou seja vai capturar o valor digitado.
import javax.swing.JOptionPane;

public class ConversaoStringNumero {

    public static void main(String[] args) {
        
        // todo número pode ser uma string, ex: "123" =  string, mas nem toda string pode ser um número, ex: d != número.

        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");

        System.out.println(valor1 + valor2); // como valor1 e valor2 são string elas serão concatenadas.

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        
        System.out.println(numero1 + numero2);
    }
    
}
