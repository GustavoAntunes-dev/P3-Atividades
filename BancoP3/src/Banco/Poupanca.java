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
        if (tranferencia <= saldo && tranferencia>0) {
            this.saldo = saldo - tranferencia;
            saldoPoupanca = saldoPoupanca + tranferencia;
            System.out.println("Transferencia realizada");
        } else {
            System.out.println("Voce nao possui esse saldo na conta corrente");
        }

    }

    public void PoupancaParaContaCorrente(double tranferencia) {
        if (tranferencia <= saldoPoupanca && tranferencia>0) {
            this.saldoPoupanca = saldoPoupanca - tranferencia;
            this.saldo = saldo + tranferencia;
            System.out.println("Transferencia realizada");
        } else {
            System.out.println("Voce nao possui esse saldo na poupanca");
        }

    }

    public String toString() {
        return "Nome : " + nome + "\n" +
                "Conta : " + numeroConta + "\n" +
                "Conta Corrente : " + saldo + "\n" +
                "Poupanca : " + saldoPoupanca;
    }

}
