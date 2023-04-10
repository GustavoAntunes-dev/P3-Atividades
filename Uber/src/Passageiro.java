public class Passageiro extends Uber {

    private int telefone;

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String toString() {
        return "Passageiro: " + super.getName() + "\n" +"Nota : " + String.format("%.2f",super.getNota()) 
        + "\n" + "Telefone :" + this.telefone + "\n" ;
    }

}
