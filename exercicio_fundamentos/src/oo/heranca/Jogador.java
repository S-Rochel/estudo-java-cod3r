package oo.heranca;

public class Jogador {
    
    // posição do jogador no tabuleiro.
    int x;
    int y;

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
}
