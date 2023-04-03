public class Comissionado extends Empregado {

    double totalDeVendas;
    double taxaComissao;
    double salario;

    public Comissionado(String nome, String sobrenome, int cpf) {
        super(nome, sobrenome, cpf);
    }
    public double vencimento(double totalDeVendas, double taxaComissao){
        this.totalDeVendas = totalDeVendas;
        this.taxaComissao = taxaComissao;
        double salario ;
        salario = totalDeVendas+taxaComissao;
        this.salario = salario;
        return salario;
    }

    public String toString(){
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
