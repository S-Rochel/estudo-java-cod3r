package oo.interface1;

public class Teste {
    
    public static void main(String[] args) {
        
        Ferrari carro1 = new Ferrari();

        System.out.println("Velocidade inicial: " + carro1.velocidadeAtual + "Km/h");

        carro1.acelerar();
        System.out.println("Aceleração 1: " + carro1.velocidadeAtual + "Km/h");
        carro1.acelerar();
        System.out.println("Aceleração 2: " + carro1.velocidadeAtual + "Km/h");
        carro1.acelerar();
        System.out.println("Aceleração 3: " + carro1.velocidadeAtual + "Km/h");

        carro1.ligarTurbo();

        carro1.acelerar();
        System.out.println("Aceleração 4 (turbo): " + carro1.velocidadeAtual + "Km/h");
        carro1.acelerar();
        System.out.println("Aceleração 5 (turbo): " + carro1.velocidadeAtual + "Km/h");

        
    }
}
