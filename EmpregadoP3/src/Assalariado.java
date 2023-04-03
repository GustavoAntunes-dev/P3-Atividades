public class Assalariado extends Empregado {

    double salario;

    public Assalariado(String nome, String sobrenome, int cpf) {
        super(nome, sobrenome, cpf);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double vencimento(double salario) {
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
