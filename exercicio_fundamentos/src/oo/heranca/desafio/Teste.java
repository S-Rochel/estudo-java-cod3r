package oo.heranca.desafio;

public class Teste {
    
    public static void main(String[] args) {
        
        Carro civic = new Civic();
        Carro ferrari = new Ferrari();


        System.out.println("Velocidade atual Civic: " + civic.velocidadeAtual);
        System.out.println("Velocidade autal Ferrari: " + ferrari.velocidadeAtual);

        
        // acelerar os carros.
        civic.acelerar();
        ferrari.acelerar();
        civic.acelerar();
        ferrari.acelerar();
        civic.acelerar();
        ferrari.acelerar();
        civic.acelerar();
        ferrari.acelerar();

        System.out.println();
        System.out.println("Velocidade final Civic: " + civic.velocidadeAtual);
        System.out.println("Velocidade final Ferrari: " + ferrari.velocidadeAtual);

        // frear os carros.
        civic.frear();
        ferrari.frear();        
        civic.frear();
        ferrari.frear();
        civic.frear();
        ferrari.frear();        
        civic.frear();
        ferrari.frear();
        civic.frear();
        ferrari.frear();        
        civic.frear();
        ferrari.frear();
        civic.frear();
        ferrari.frear();        
        civic.frear();
        ferrari.frear();
        civic.frear();
        ferrari.frear();        
        civic.frear();
        ferrari.frear();
        civic.frear();
        ferrari.frear();        
        civic.frear();
        ferrari.frear();
        civic.frear();
        ferrari.frear();        
        civic.frear();
        ferrari.frear();
        
        
        System.out.println();
        System.out.println("Velocidade final Civic: " + civic.velocidadeAtual);
        System.out.println("Velocidade final Ferrari: " + ferrari.velocidadeAtual);
    }
}
