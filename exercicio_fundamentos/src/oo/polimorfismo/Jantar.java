package oo.polimorfismo;

public class Jantar {
    
    public static void main(String[] args) {
        
        // Estânciar objetos.
        Pessoa convidado = new Pessoa(99.65);

        Arroz ingrediente1 = new Arroz(0.20);
        Feijao ingrediente2 = new Feijao(0.10);
        Sorvete sobremesa = new Sorvete(0.4);

        System.out.printf("Peso inicial convidado: %.3fKg", convidado.getPeso());

        // polimorfismo stático e dinâmico.
        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        
        
        System.out.println();
        System.out.printf("Peso do convidado após jantar: %.3fKg", convidado.getPeso());
       
        // polimorfismo stático e dinâmico.
        convidado.comer(ingrediente1);
        
        System.out.println();
        System.out.printf("Peso final do convidado: %.3fKg", convidado.getPeso());
    }
}
