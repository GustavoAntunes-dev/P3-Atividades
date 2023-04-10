public class contatoBasico extends Agenda{
   
    private String nome;
    
    private int telefone;
  
  
    public String getNome() {
        return nome;
    }
    public String toString() {
        return " Nome :" + this.nome + " Telefone :" + this.getTelefone() + " Email: " + super.getEmail()
        + " palavraChave:" + super.getPalavraChave(); 
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    
}
