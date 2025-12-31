
package AgendaEletronica;


public class Contato {
    private String cpf;
    private String nome;
    private String email;
    private String telefone;
    
    public Contato (String cpf, String nome, String email, String telefone){
    this.cpf= cpf;
    this.nome=nome;
    this.email= email;
    this.telefone= telefone;
    }
    
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    public boolean validaCampos(Contato contato){
     if (cpf.isEmpty()|| email.isEmpty()||nome.isEmpty() || telefone.isEmpty()){
        return false;
     }
     return true;
    }
    
}
