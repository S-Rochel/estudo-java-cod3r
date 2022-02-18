package estruturaDeControle;

import java.util.Scanner;

public class Do_While {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String palavra = " ";
        do {
            System.out.println("Informe uma cor, ou \"sair\", para encerrar.");
            palavra = entrada.next();
            System.out.println("Sua resposta foi: " + palavra);
        }while(!palavra.equalsIgnoreCase("sair"));

        entrada.close();
    }
}
