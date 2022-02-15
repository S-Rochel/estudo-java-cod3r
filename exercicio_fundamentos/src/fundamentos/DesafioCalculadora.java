package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    
    public static void main(String[] args) {
        
        // Ler num1
        // Ler num2
        // informar a operação + - * / %

        // Declaração das variáveis.
        double num1 = 0;
        double num2 = 0;
        String operador = " ";
        

        // Entrada dos dados.
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        num1 = entradaTeclado.nextDouble();

        System.out.println("Informe o segundo número: ");
        num2 = entradaTeclado.nextDouble();

        System.out.println("Qual operação deseja realizar (+ - * / %)? ");
        operador = entradaTeclado.next();

        // Minha Lógica.        
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;
        double modulo = num1 % num2;

        double res = operador.equals("+") ? soma : operador.equals("-") ? subtracao : operador.equals("*") ? multiplicacao : operador.equals("/") ? divisao : modulo;
        
         /* Lógica do Professor.
        double res = "+".equals(operador) ? num1 + num2 : 0;
        res = "-".equals(operador) ? num1 - num2 : res;
        res = "*".equals(operador) ? num1 * num2 : res;
        res = "/".equals(operador) ? num1 / num2 : res;
        res = "%".equals(operador) ? num1 % num2 : res;
        */

        // Saída do sistema.
        System.out.printf("O resultado da operação %.2f %s %.2f = %.2f", num1, operador, num2, res);
        
        // Encerra o Scanner.
        entradaTeclado.close();
    }
}
