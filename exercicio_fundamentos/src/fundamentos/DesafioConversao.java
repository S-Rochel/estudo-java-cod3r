package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    
    public static void main(String[] args) {
        
        // Desafio: Com o uso do Scanner pegar os últimos três salários de um funcionário em formato de string, apartir daí calcular a média dos últimos três salários e apresentar no terminal usando duas casas decimais.

        Scanner entrada = new Scanner(System.in); // System.in = teclado.
        System.out.print("Digite o primeiro salário: ");
        String sal1 = entrada.nextLine().replace(",", "."); // .replace vai pegar quando tiver ponto e substituir por virgula.

        System.out.print("Digite o segundo salário: ");
        String sal2 = entrada.nextLine().replace(",", ".");

        System.out.print("Digite o terceiro salário: ");
        String sal3 = entrada.nextLine().replace(",", ".");

        double sal1n = Double.parseDouble(sal1);
        double sal2n = Double.parseDouble(sal2);
        double sal3n = Double.parseDouble(sal3);

        double salMedia = (sal1n + sal2n + sal3n)/ 3;

        System.out.printf("A media do salário é %.2f", salMedia);
        entrada.close();
    }
}
