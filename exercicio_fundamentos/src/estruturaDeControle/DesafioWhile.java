package estruturaDeControle;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class DesafioWhile {
    
    public static void main(String[] args) {
        
        /* Usúario digita uma nota de 0 à 10, validar;
         * Armazenar as notas em uma variável chamada total, de maneira que a variável total armazene a soma de todas as notas.
         * Usar também uma variável para armazenar quantas notas foram digitadas.
         * No final do programa informar a média.
         * -1 encerra o programa.
        */
       
        Scanner entrada = new Scanner(System.in);
        Double nota = 0.0;
        Double total = 0.0;
        int contador = 0;

        do{
            System.out.println("Informe uma nota de 0 à 10: ");
            nota = entrada.nextDouble();
            while(nota >= 0 && nota <= 10) {
                total += nota;
                contador ++;
                break;
            }
        } while(nota != -1);

        System.out.printf("O valor da soma de todas as notas é: %.2f\nE foram informadas %d notas.", total, contador);        
        entrada.close();
    }
}
/** JOptionPane não aceita ponto flutuante, verificar "locale".
 * String nota = "0.0";  
        double total = 0;
        int contador = 0;
        do {
            nota = JOptionPane.showInputDialog("Informe uma nota de 0 à 10.");

            while(Double.parseDouble(nota) >= 0 && Double.parseDouble(nota) <= 10) {
                total += Double.parseDouble(nota);
                contador ++;
                break;
            }
        } while(Integer.parseInt(nota) != -1);

        System.out.printf("O valor da soma de todas as notas é: %d\nE foram informadas %d notas.", total, contador);
 */