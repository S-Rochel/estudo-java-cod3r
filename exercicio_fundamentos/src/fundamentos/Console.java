package fundamentos;

import java.util.Scanner; // Para poder capturar dados do teclado.

public class Console {
    
    public static void main(String[] args) {
        
        // Uso do terminal para mostrar informações:
        System.out.print("Bom dia!"); // Imprime sempre na mesma linha.
        System.out.println("Bom dia!"); // Imprime primeiro e depois vai para a outra linha.
        System.out.println("Bom \ndia!"); // Imprime Bom e quebra a linha e imprime dia!.

        System.out.printf("Megasena: %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6); // Imprime substituindo o simbólo %d por número inteiro, seguindo a ordem.
        System.out.printf("Salário: %.2f \n", 123.456); // Imprime subtituindo o simbólo %.2f pelo número formatando-o.
        

        // Capturar informações do teclado, através do console.
        Scanner entrada = new Scanner(System.in); // System.in escaneia o teclado.

        System.out.print("Digite seu nome: ");
        String nome =  entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade =  entrada.nextInt();

        System.out.printf("Seu nome e %s e voçê tem %d anos", nome, idade);

        entrada.close(); // Sempre devemos fechar o "Scanner" para não ficar ocupando recursos da máquina.
    }
}
