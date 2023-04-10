public class contatoComercial extends Agenda {
    private String nome;
    private int telefone;
    private String funcao;

    public String toString() {
        return "Nome: " + this.nome + " Telefone : " + this.telefone + " Funcao :" + this.funcao + " Email: " + super.getEmail()
        + " palavraChave:" + super.getPalavraChave(); 
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

}
