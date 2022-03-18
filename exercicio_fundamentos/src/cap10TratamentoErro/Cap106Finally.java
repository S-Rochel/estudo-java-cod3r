// Cap 10.6 - Finally
package cap10TratamentoErro;

import java.util.Scanner;

public class Cap106Finally {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        try {            
            System.out.println(7 / entrada.nextInt());          

        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Este bloco semple será executado!!!");
            entrada.close();
        }

        System.out.println("Fim");
    }
}
