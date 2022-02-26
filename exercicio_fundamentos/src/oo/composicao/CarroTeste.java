package oo.composicao;

public class CarroTeste {
    
    public static void main(String[] args) {
        

        // Relação unidericional, sendo um para um, um carro tem um motor, e um motor tem um carro.
         
        // Criar um novo carro.
        Carro sandero = new Carro();

        // Verificar se o carro está ligado e o giro do motor.
        System.out.println("O carro está ligado? " + sandero.estaLigado());

        System.out.println("RPM do motor: " + sandero.motor.rotacaoMotor());

        // Ligar o motor.
        sandero.ligar();
        System.out.println("O carro está ligado? " + sandero.estaLigado());

        System.out.println("RPM do motor: " + sandero.motor.rotacaoMotor());

        // Acelerar.
        sandero.acelerar();
        sandero.acelerar();
        sandero.acelerar();
        sandero.acelerar();
        sandero.acelerar();
        sandero.acelerar();
        sandero.acelerar();
        sandero.acelerar();

        System.out.println("RPM do motor: " + sandero.motor.rotacaoMotor());


        // Frear.
        sandero.frear();
        sandero.frear();
        sandero.frear();
        sandero.frear();
        sandero.frear();
        sandero.frear();
        sandero.frear();
        
        System.out.println("RPM do motor: " + sandero.motor.rotacaoMotor());
    }
}
