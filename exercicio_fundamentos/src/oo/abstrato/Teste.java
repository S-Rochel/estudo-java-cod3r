package oo.abstrato;

public class Teste {
    
    public static void main(String[] args) {
        
        // Só posso estânciar uma classe concleta.

        // No nivel Animal só tenho o método mover().
        Animal rex1 = new Cachorro();
        System.out.println(rex1.mover());

        // No nivel Mamifero tenho os métodos mover() e mamar().
        Mamifero rex2 = new Cachorro();
        System.out.println(rex2.mover());
        System.out.println(rex2.mamar());
    }
}
