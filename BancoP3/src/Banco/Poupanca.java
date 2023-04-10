package Banco;

public class Poupanca extends Conta {

    protected double saldoPoupanca;

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

    public Poupanca(int numeroConta, String nome, double saldo, double saldoPoupanca) {
        super(numeroConta, nome, saldo);
        this.saldoPoupanca = saldoPoupanca;
    }

    public void contaCorrentaParaPoupanca(double tranferencia) {
        if (tranferencia <= saldo) {
            this.saldo = saldo - tranferencia;
            saldoPoupanca = saldoPoupanca + tranferencia;
            System.out.println("Transferencia realizada");
        } else {
            System.out.println("Voce nao possui esse saldo na conta corrente");
        }

    }
    public void PoupancaParaContaCorrente(double tranferencia) {
        if (tranferencia <= saldoPoupanca) {
            this.saldoPoupanca = saldoPoupanca - tranferencia;
            this.saldo = saldo + tranferencia;
            System.out.println("Transferencia realizada");
        } else {
            System.out.println("Voce nao possui esse saldo na conta corrente");
        }

    }

    public String toString() {
        return "Nome : " + nome + "\n" +
                "Conta : " + numeroConta + "\n" +
                "Saldo : " + saldo + "\n" +
                "Poupanca : " + saldoPoupanca;
    }

}
