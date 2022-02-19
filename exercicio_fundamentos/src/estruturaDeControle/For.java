package estruturaDeControle;

public class For {
    
    public static void main(String[] args) {
        
        // for 1, crescente.
        for(int c = 1; c <= 4; c++) {
            System.out.printf("Este é o %dº laço.\n", c);
        }

        // for 2, decrescente.
        int a = 0;
        for( int c = 10; c >= 0; c -= 2) {
            a += 1;
            System.out.printf("%dº decremento =  %d\n", a, c);
        }
        

        // for 3, um laço dentro do outro.
        for(int i = 1; i <= 3; i++) {
            System.out.printf("este é o %dº laço i.\n", i);
            for(int j = 1; j <= 3; j++) {
                System.out.printf("este é o %dº laço j.\n", j);
            }
        }
    }
}
