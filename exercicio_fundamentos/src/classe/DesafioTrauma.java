package classe;

public class DesafioTrauma {
    
    int a = 3; // acessar a variável sem mexer aqui...
    static int b = 4;
    public static void main(String[] args) {
        
        DesafioTrauma instancia = new DesafioTrauma(); 
        
        System.out.println(instancia.a);
        System.out.println(b);

    }
}
