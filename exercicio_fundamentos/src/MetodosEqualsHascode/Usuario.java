package MetodosEqualsHascode;

public class Usuario {
    
    String nome;
    String email;

    // Fazer comparação usando o ".equals()" mas implementado.
    @Override
    public boolean equals(Object obj) {
        // Posso verificar se obj recebido é uma instância de Usuario.
        if (obj instanceof Usuario){
            Usuario outro = (Usuario) obj;
            
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        } else {
            return false;
        }
    }        
}
