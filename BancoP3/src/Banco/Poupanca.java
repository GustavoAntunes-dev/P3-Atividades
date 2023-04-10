package Banco;
public class Poupanca extends Conta  {

    protected double saldoPoupanca;

    public Poupanca(int numeroConta, String nome, double saldo, double saldoPoupanca) {
        super(numeroConta, nome, saldo);
        this.saldoPoupanca = saldoPoupanca;
    }

public String toString() {
        return "Nome : " + nome + "\n" +
                "Conta : " + numeroConta + "\n" +
                "Saldo : " + saldo + "\n" + 
                "Poupanca : " + saldoPoupanca;
    }


    
    



    
    
    
}
