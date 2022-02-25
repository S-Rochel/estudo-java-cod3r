package listaMatriz;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizExercicio {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        // Receber as entradas.
        System.out.println("Informe o número de alunos: ");
        int numAlunos = entrada.nextInt();
        System.out.println("Informe o número de notas por aluno: ");
        int numNotas = entrada.nextInt();

        // Iniciar a matriz.
        double[][] boletim = new double [numAlunos][numNotas];

        // Receber as notas.        
        for(int a = 0; a < boletim.length; a++){            
            for(int n = 0; n < numNotas; n++){                
                System.out.printf("Informe a %dª nota do %dª aluno: ", n + 1, a + 1);
                boletim[a][n] = entrada.nextDouble();
            }
        }

        
        for (double[] ds : boletim) {
            System.out.println(Arrays.toString(ds));
        }
        entrada.close();
    }
}
