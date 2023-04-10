import java.util.Scanner;

public class testeAgenda{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        contatoBasico contato1 = new contatoBasico();
        contato1.setNome("Pedro");
        contato1.setTelefone(98763456);
        contato1.setEmail("Pedro@123.com");

        contatoComercial contato2 = new contatoComercial();
        contato2.setEmail("jk@hotmail.com");
        contato2.setNome("Julia");
        contato2.setFuncao("Advogada");
        contato2.setTelefone(98787878);

        Agenda[] agenda = new Agenda[2];
        agenda[0] = contato1;
        agenda[1]= contato2;

       
            System.out.println(contato1.toString());
            System.out.println(contato2.toString());

        }
    }
