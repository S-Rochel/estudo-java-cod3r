package oo.heranca;

public class Jogador {
    
    // posição do jogador no tabuleiro.
    int vida = 100;
    int x;
    int y;

    // Construtor explícito
    Jogador() {
        this(0, 0);
    }

    Jogador(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // método para saber se o jogador andou ou nãp.
    boolean andar(Direcao direcao) {
        if(direcao == Direcao.NORTE) {
            y--;
        } else if (direcao == Direcao.LESTE) {
            x++;
        } else if (direcao == Direcao.SUL) {
            y++;
        } else if (direcao == Direcao.OESTE) {
            x--;
        }
        return true;
    }

    // método atacar.
    boolean atacar(Jogador oponente) {
        int deltax = Math.abs(x - oponente.x);
        int deltay = Math.abs(y - oponente.y);

        if(deltax == 0 && deltay == 1) {
            oponente.vida -= 10;
            return true;
        } else if (deltax == 1 && deltay == 0) {
            oponente.vida -= 10;
            return true;
        }
        return false;
    }
}
