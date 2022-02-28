package oo.heranca.desafio;

public class Ferrari extends Carro {
    
    // Sobreescrever método acelerar.
    
    @Override
    void acelerar() {
        super.acelerar();
        super.acelerar();
        super.acelerar();
    }
}
