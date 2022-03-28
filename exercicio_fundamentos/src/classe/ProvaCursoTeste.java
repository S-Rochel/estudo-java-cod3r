package classe;

public class ProvaCursoTeste {
    
    public static void main(String[] args) {
        
        ProvaCurso c1 = new ProvaCurso("Ciencia da comp");
        c1.addDisciplina("AlgProgII");
        c1.addDisciplina("SO");
        c1.addDisciplina("Grafos");
        System.out.println(c1);
    }
}
