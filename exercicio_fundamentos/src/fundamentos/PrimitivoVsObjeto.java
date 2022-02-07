package fundamentos;

public class PrimitivoVsObjeto {
    
    public static void main(String[] args) {
        
        // Tirando os tipos primitivos (tipo primitivo é aquele que só carrega o próprio valor) todo o resto é um objeto, para saber se algo é um objeto basta colocar a notação ponto na frente, se for um objeto terá os metodos, ex:
        String s = "texto";
        System.out.println(s.length());

        String y = new String("texto");
        System.out.println(y.length());


    }
}
