package estruturaDeControle;

import java.util.Scanner;

public class While {
    
    public static void main(String[] args) {
        
        // while Determinado.
        int contador = 1;
        while(contador <= 4) {
            System.out.printf("Este é o %dº laço.\n", contador);
            contador ++;
        }


        // while indeterminado.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe uma cor ou \"sair\", para finalizar.");
        String palavra = entrada.next();
        System.out.println("Sua resposta foi: " + palavra);

        while(!palavra.equalsIgnoreCase("sair")) {
            
            System.out.println("Informe uma cor ou \"sair\", para finalizar.");
            palavra = entrada.next();
            System.out.println("Sua resposta foi: " + palavra);
        }

        entrada.close();
    }
}
