package estruturaDeControle;

public class DesafioFor {
    
    public static void main(String[] args) {
        
        // Sequir o código do professor e fazer com que o resultado seja:
        /**
         * #
         * ##
         * ###
         * ####
         * #####
         */

         // versão do professor.
         String valor = "#";
         for(int i = 1; i <= 5; i++) {
             System.out.println(valor);
             valor += "#";
         }

         // Imprementar uma versão que não use valor numerico para controlar o laço.
         // minha versão.
              
         for(String v = "#"; !v.equals("######"); v += "#") {
            System.out.println(v);
            
        }


    }
}
