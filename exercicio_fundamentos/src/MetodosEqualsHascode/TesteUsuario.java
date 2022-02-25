package MetodosEqualsHascode;

import java.util.Date;

public class TesteUsuario {
    
    public static void main(String[] args) {
        // COMPARANDO COM EQUALS

        // Criando objetos.
        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Pedro Silva";
        u2.email = "pedro.silva@gmail.com";

        Usuario u3 = new Usuario();
        u3.nome = "Pedro Silva";
        u3.email = "pedro.silva@gmail.com";

        Usuario u4 = new Usuario();
        u4.nome = "Pedro Silva";
        u4.email = "pedro.silva@gmail.com";


        // Fazendo comparação usando "==", retorna false porque compara endereços de memória, sendo que cada objeto está referênciado em um endereço diferente de outros.
        System.out.println("Comparação usando == :" + (u1 == u2));

        // Fazendo comparação usando ".equals()", com o equals sem receber nenhuma imprementação, a comparação vai ser igual à ==.
        System.out.println("Comparação usando .equals :" + u1.equals(u2));

        System.out.println("Está comparação retornará false: " + u1.equals(new Date())); // retorna false, pois Date é um tipo diferente de Usuario.
    }
}
