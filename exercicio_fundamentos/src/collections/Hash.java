package collections;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<>();
        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Guilherme"));
        usuarios.add(new Usuario("Luiz"));


        // Fazer uma pesquisa com hashset.
        boolean resultado = usuarios.contains(new Usuario("Luiz"));
        System.out.println(resultado);
    }    
}
