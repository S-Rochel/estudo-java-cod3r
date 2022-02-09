package fundamentos;

public class DesafioOperadoresAritmeticos {
    
    public static void main(String[] args) {
        
        /**
         * Resolver a sequinte equação:
         * 
         * (([6 * (3 + 2)]² / (3 * 2)) - (((1 - 5) * (2 - 7)) / 2)²)³ / 10³ = 125
         * 
         */

        double aa = 6 * (3 + 2);
        double ab = (Math.pow(aa, 2)) / (3 * 2);
        System.out.println(ab);

        double ba = ((1 - 5) * (2 - 7)) / 2;
        double bb = Math.pow(ba, 2);
        System.out.println(bb);

        double ca = ab - bb;
        double cb = Math.pow(ca, 3);
        System.out.println(cb);

        double res = cb / (Math.pow(10, 3));
        System.out.println("O resultado final é: " + (int) res);
    }
}
