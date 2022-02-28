package oo.heranca;

public class Monstro extends Jogador {
    
    // Monstro herda todo o códiigo de Heroi.

    // this chama o construtor de baixo e este chama o construtor padrão da classe pai, assim posso construir o monstro passando diretamente o valor para o construtor padrão ou atribuindo o valor depois.
    Monstro() {
        this(0, 0);
    }

    Monstro(int x, int y) {
        super(x, y);
    }
    
}
