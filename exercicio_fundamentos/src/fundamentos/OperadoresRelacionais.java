package fundamentos;

public class OperadoresRelacionais {
    
    public static void main(String[] args) {
        
        // Operador relacional de igualdade.
        int a = 97;
        int b = 'a'; // Vai pegar o valor do caracter unicode
        System.out.println("Igual a \"==\": " + (a == b));

        // Operador relacional de diferença.
        System.out.println("Diferente  de \"!=\": " + (3 != a));

        // Operador relacional de grandeza.
        System.out.println("Maior que \">\": " + (3 > 3)); // res: false 
        System.out.println("Maior ou igual que\">=\": " + (3 >= 3)); // res: true 
        System.out.println("Menor que \"<\": " + (3 < 3)); // res: false 
        System.out.println("Menor ou igual \"<=\": " + (3 <= 3)); // res: true 

        
    }
}
