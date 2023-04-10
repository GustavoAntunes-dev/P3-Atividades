package Banco;
public abstract class Banco {
    
    protected int numeroConta;
    protected String nome;
    
    public int getConta() {
        return numeroConta;
    }

    public void setConta(int conta) {
        this.numeroConta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Banco(int conta, String nome) {
        this.numeroConta = conta;
        this.nome = nome;
    }



}
