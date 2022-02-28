package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
    
    // A classe Pedro herda da classe Ana, mas estão em pacotes diferentes.
    // Ana mae = new Ana();

    // Oque a classe Pedro consegue acessar da classe Ana.
    void testeAcessos() {
        System.out.println("O Pedro tem acesso hà: " + this.todosSabem);
        System.out.println("O Pedro tem acesso hà: " + this.formaDeFalar);
        System.out.println("O Pedro não tem acesso hà: segredo");
        System.out.println("O Pedro tem acesso hà: façoDentroDeCasa");
    }
}
