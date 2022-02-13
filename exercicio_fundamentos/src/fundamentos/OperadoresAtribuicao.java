package fundamentos;

public class OperadoresAtribuicao {
    
    public static void main(String[] args) {
        
        int a = 3; // a recebe 3.
        int b = a; // b recebe o valor da variável a.
        int c = 3 + 2; // c recebe a expressão "3 + 2".

        c += b; // c = c + b;
        c -= a; // c = c - a;
        c *= b; // c = c * b;
        c /= a; // c = c / a;
        c %= 2; // c = c % 2; resulta em 0 ou 1.
    }
}
