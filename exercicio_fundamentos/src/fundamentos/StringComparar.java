package fundamentos;

public class StringComparar {
    
    public static void main(String[] args) {
        
        System.out.println("2" == "2"); // res: true

        String s1 = new String("2");
        System.out.println("2" == s1); // res: false, pois embora o valor sejam iguais s1 é um objeto.

        // Melhor sempre usar o método .equals(Objeto) quando for comparar strings, assim o resultado da comparação será mais confiável.

        System.err.println("2".equals(s1)); // res: true        
    }
}
