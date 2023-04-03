public class Horista extends Empregado {

    double precoHora;
    double horasTrabalhadas;
    double salario;

    public Horista(String nome, String sobrenome, int cpf) {
        super(nome, sobrenome, cpf);
    }

    public double vencimento(double horasTrabalhadas, double precoHora) {
        this.precoHora = precoHora;
        this.horasTrabalhadas = horasTrabalhadas;
        double salario = precoHora * horasTrabalhadas;
        this.salario = salario;
        return salario;
    }

    public String toString() {
        return "Nome : " +
                nome + "\n" +
                "Sobrenome : " +
                sobrenome + "\n" +
                "Cpf : " +
                cpf + "\n" +
                "Salario : "
                + salario;

    }
}
