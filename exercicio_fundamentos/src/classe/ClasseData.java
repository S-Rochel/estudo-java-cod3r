package classe;

public class ClasseData {
    
    // Criar atributos: dia, mes e ano.
    int dia;
    int mes;
    int ano;

    // método retornando uma data formatada como dia/mês/ano.
    String dataFormatada () {
        return  String.format("Está data é: %d/%d/%d", dia, mes, ano);
    }
}
