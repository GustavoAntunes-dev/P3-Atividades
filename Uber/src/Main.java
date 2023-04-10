import java.util.Scanner;

public class Main {

    private static final String Nao = null;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String chamada = "";

        Passageiro P1 = new Passageiro();
        P1.setName("Joao");
        P1.setNota(9.5);
        P1.setTelefone(98764555);

        Passageiro P2 = new Passageiro();
        P2.setName("Aline");
        P2.setNota(9.0);
        P2.setTelefone(98987898);

        Motorista M1 = new Motorista();
        M1.setName("Carlos");
        M1.setNota(9.8);
        M1.setSaldo(0.0);

        System.out.println("Vc deseja chamar o Uber ? Sim ou Nao");

        chamada = sc.nextLine();
        double A, a, B, b, distancia;

        if (chamada.equalsIgnoreCase("Nao")) {
            System.out.println("Uber cancelado");

        } else {
            System.out.println("Digite os pontos X e Y onde o passageiro está");

            A = sc.nextDouble();
            a = sc.nextDouble();
            System.out.println("Digite o ponto X e Y de destino final ");

            B = sc.nextDouble();
            b = sc.nextDouble();

            double X1 = (B - A);
            double Y1 = (b - a);
            double X = Math.pow(X1, 2);
            double Y = Math.pow(Y1, 2);
            distancia = Math.sqrt(X + Y);
            System.out.println("A distancia entre passageiro e o destino é : " + distancia);

            System.out.println("Viagem Finalizada");
            System.out.println("Digite a nota do motorista :");

            double Nota01 = sc.nextDouble();
            M1.setNota(Nota01);

            double Saldo = distancia * 10;
            M1.setSaldo(Saldo);

            System.out.println();
            System.out.println(P1.toString());
            System.out.println(M1.toString());

        }

    }

}
