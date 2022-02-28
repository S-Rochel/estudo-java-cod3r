package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
    
    // A classe Julia não está no mesmo pacote que a classe Ana.
    Ana sogra = new Ana();

    // Oque a classe Julia consegue acessar da classe Ana.
    void testeAcessos() {
        System.out.println("A Julia consegue acessar da Ana: " + sogra.todosSabem);        
    }
}
