package oo.heranca.desafio;

public class Ferrari extends Carro {
    
    // construtor 
    Ferrari() {
        this(312);
    }

    Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }
    
     // Sobreescrever método acelerar.
    @Override
    void acelerar() {
        super.acelerar();
        super.acelerar();
        super.acelerar();
    }
}
