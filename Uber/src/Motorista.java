public class Motorista extends Uber {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        return "Motorista: " + super.getName() + "\n" + "Nota : " + String.format("%.2f",super.getNota()) +
        "\n" + "Saldo R$:" + String.format("%.2f", saldo)+ "\n" ;
    }

}
