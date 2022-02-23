package classe;

public class DesafioModuloPessoa {
    
    // Declaração de variáveis.
    String nomePessoa;
    double pesoPessoa;

    // Método construtor.
    DesafioModuloPessoa(String nome, double peso) {
        this.nomePessoa = nome;
        this.pesoPessoa = peso;
    }

    // Método acrescentar o peso da comida ao peso da pessoa.
    void comer(DesafioModuloComida comida) {
       if(comida != null){
           this.pesoPessoa += comida.pesoComida;
       }       
    }
    String apresentar() {
        return "Olá eu sou o " + nomePessoa + " e tenho " + pesoPessoa + "Kg";
    }
}
