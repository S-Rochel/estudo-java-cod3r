package listasArrays;

import java.util.Arrays;

public class ArrayExercicio {
    
    public static void main(String[] args) {
        
        // 1-Criando um array de uma dimensão.
        double[] notasAlunoA = new double[3];

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        // Mostrar o array.
        String resultado =  Arrays.toString(notasAlunoA);
        System.out.println(resultado);

        // Percorrer o array imprimindo cada posição do array.
        for(int i = 0; i < notasAlunoA.length; i++){
            System.out.println(notasAlunoA[i]);
        }


        // 2-Criando um array de uma dimensão.
        double[] notasAlunoB = {6.9, 5.5, 10};
        System.out.println(Arrays.toString(notasAlunoB));


        
    }
}
