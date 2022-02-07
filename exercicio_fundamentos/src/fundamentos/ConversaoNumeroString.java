package fundamentos;

public class ConversaoNumeroString {
    
    public static void main(String[] args) {
        
        Integer num1 = 10000; // variável usando o wrapper
        System.out.println(num1.toString().length());

        int num2 = 10000; // variável usando o tipo primitivo
        System.out.println(Integer.toString(num2).length());

        System.out.println(("" + num2).length()); // quando concateno uma string com qualquer valor o resultado será uma string.
    }
}
