package oo.composicao;

public class Motor {
    // Somente um exemplo para demonstrar uma relação de um para um da classe Motor com a classe Carro.

    // Condição inicial do motor.
    boolean motorLigado = false;
    double fatorInjecao = 1;

    // Conforme autera a injeção de combustível, autera a rotação do motor.
    int rotacaoMotor() {
        if(!motorLigado) {
            return 0;
        } else {
            return (int) Math.round(fatorInjecao * 3000);
        }
    }

}
