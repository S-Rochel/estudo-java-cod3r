package oo.composicao;

public class Carro {

    // Quando criar um objeto carro, um objeto motor será instânciado junto, relação de um para um do objeto carro com o objeto motor.
    Motor motor = new Motor();


    // Este método tem por objetivo aumentar a rotação do motor cada vez que este método for chamado.
    void acelerar() {        
        if(motor.fatorInjecao <= 2) {
            motor.fatorInjecao += 0.4;
        }
    }


    // Este método tem por objetivo diminuir a rotação do motor cada vez que este método for chamado.
    void frear() {        
        if(motor.fatorInjecao <= 0.4) {
            this.desligar();
        } else {
            motor.fatorInjecao -= 0.4;
        }
    }

    // Este método liga o motor.
    void ligar() {
        motor.motorLigado = true;
    }

    // Este método desliga o motor.
    void desligar() {
        motor.motorLigado = false;
    }


    // Este método é para saber se o motor já está ligado.
    boolean estaLigado() {
        return motor.motorLigado;
    }
}
