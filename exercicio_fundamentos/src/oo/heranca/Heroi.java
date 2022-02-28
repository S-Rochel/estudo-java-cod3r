package oo.heranca;

public class Heroi extends Jogador {
    
    // Heroi recebe todo o código de Jogador.

    // sobreescrever o método atacar.
    boolean atacar(Jogador oponente) {
        int deltax = Math.abs(x - oponente.x);
        int deltay = Math.abs(y - oponente.y);

        if(deltax == 0 && deltay == 1) {
            oponente.vida -= 20; // era 10 foi mudado para 20
            return true;
        } else if (deltax == 1 && deltay == 0) {
            oponente.vida -= 10;
            return true;
        }
        return false;
    }
}
