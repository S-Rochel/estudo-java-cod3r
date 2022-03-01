package oo.interface1;

public class Ferrari extends Carro implements Esportivo {
    
    // Construtores.
    public Ferrari() {
        this(315);
    }

    public Ferrari( int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 15;
    }

    @Override
    public void ligarTurbo() {
        delta = 35;
    }

    @Override
    public void desligarTurbo() {
       delta = 15;
    }
}
