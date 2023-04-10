package Banco;

public class Conta extends Banco {

    protected double saldo = 0.0;

    public Conta(int numeroConta, String nome, double saldo) {
        super(numeroConta, nome);

        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double deposito) {
        if (deposito > 0)
            this.saldo = saldo + deposito;
        System.out.println("Deposito realizado");
        if (deposito < 0)
            System.out.println("Operacao nao pode ser executada");
    }

    public void saque(double saque) {
        if (saque > saldo) {
            System.out.println("Saque maior que o valor da conta, valor sacado: " + this.saldo);
            this.saldo = 0.0;
        }

        if (saque < saldo) {
            this.saldo = saldo - saque;
            System.out.println("Saque realizado");
        }
        else {
            this.saldo = 0;
            System.out.println("Saque realizado");
        }

    }

    public String toString() {
        return "Nome : " + nome + "\n" +
                "Conta : " + numeroConta + "\n" +
                "Conta Corrente : " + saldo;
    }

}
