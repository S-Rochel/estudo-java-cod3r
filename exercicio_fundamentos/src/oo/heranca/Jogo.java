package oo.heranca;

public class Jogo {
    
    public static void main(String[] args) {
        
        Jogador j1 = new Heroi(10, 10);

        // Jogador j3 = new Monstro(0, 0); // 
      
        Jogador j2 = new Monstro(); // herança
        j2.x = 10;
        j2.y = 11;
        
        System.out.println("Antes do ataque!");
        System.out.println("Heroi " + j1.vida + " vidas");
        System.out.println("Monstro " + j2.vida + " vidas");

        j1.atacar(j2);

        System.out.println();
        System.out.println("Após o ataque!");
        System.out.println("Heroi " + j1.vida + " vidas");
        System.out.println("Monstro " + j2.vida + " vidas");
    }
}
