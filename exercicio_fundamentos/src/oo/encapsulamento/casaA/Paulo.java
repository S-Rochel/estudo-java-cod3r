package oo.encapsulamento.casaA;

public class Paulo {
    
    // A classe Paulo e a classe Ana estão no mesmo pacote.
    
    Ana esposa = new Ana(); // instânciei o objeto Ana.

    // verificar oque o Paulo consegue acessar da Ana.
    void testeAcessos() {
        System.out.println("O Paulo tem acesso hà: " + esposa.facoDentroDeCasa);
        System.out.println("O Paulo tem acesso hà: " + esposa.formaDeFalar);
        System.out.println("O Paulo tem acesso hà: " + esposa.todosSabem);
        System.out.println("O Paulo não tem acesso hà: segredo");
        
    }
}
