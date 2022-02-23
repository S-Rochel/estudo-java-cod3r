package classe;

public class DesafioModuloJantar {
    
    public static void main(String[] args) {
     
       DesafioModuloPessoa pessoa = new DesafioModuloPessoa("Pedro", 30);

       DesafioModuloComida prato1 = new DesafioModuloComida("Arroz", .100);
       DesafioModuloComida prato2 = new DesafioModuloComida("Feijão", .110);

        System.out.println(pessoa.apresentar());    
        pessoa.comer(prato1);  
        System.out.println(pessoa.apresentar());  
        pessoa.comer(prato2);   
        System.out.println(pessoa.apresentar());                     
    }
}
