package classe;

public class ClasseData {
    
    // Criar atributos: dia, mes e ano.
    int dia;
    int mes;
    int ano;

    // Criar um construtor que receba dia, mês e ano e um construtor padrão de forma explicita com a data 01/01/1970.
    ClasseData(){
        this.dia = 01;
        this.mes = 01;
        this.ano = 1970;
    }

    ClasseData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // método retornando uma data formatada como dia/mês/ano.
    String dataFormatada () {
        String formato = "Está data é: %d/%d/%d";
        return  String.format(formato, dia, mes, ano);
    }
}
