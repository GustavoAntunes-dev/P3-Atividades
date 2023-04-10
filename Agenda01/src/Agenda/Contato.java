package Agenda;

public class Contato {

    private String nome;
    private String telefone;
    private String email;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }
    public String obterInfo(){
        return  "Nome :" + nome +
                " telefone : " + telefone +
                " Email : " + email ;
    }
}