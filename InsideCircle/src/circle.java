import java.util.Scanner;

import javax.swing.plaf.synth.SynthToggleButtonUI;

public class circle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] vet = new double[5];
        double raio;
        double distancia;

        System.out.println("Entre com o raio do circulo");
        raio = sc.nextDouble();

        System.out.println("Entre com cinco equacoes de segundo grau, coloque os 3 coeficientes de cada uma.");
        for (int i = 0; i < vet.length; i++) {
            Bhaskara pontos = new Bhaskara();
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();

            double delta = pontos.delta(x, y, z);
            if (delta < 0) {
                System.out.println("Essa equacao nao possui raizes reais");

            } else {
                double raiz1 = pontos.raiz01(delta);
                double raiz2 = pontos.raiz02(delta);
                distancia = pontos.distancia(raiz1, raiz2);
                vet[i] = distancia;
                int index = i + 1;
                if (vet[i] < raio) {
                    System.out.printf("As raizes sao: %.2f  %.2f\n" , raiz1 , raiz2);
                    System.out.println();
                    System.out.println("A coordenada " + index + " está dentro do círculo");
                } else if (vet[i] > raio) {
                    System.out.printf("As raizes sao: %.2f  %.2f\n" , raiz1 , raiz2);
                    System.out.println();
                    System.out.println("A coordenada " + index + " está fora do círculo");
                } else if (vet[i] == raio) {
                    System.out.printf("As raizes sao: %.2f  %.2f\n" , raiz1 , raiz2);
                    System.out.println();
                    System.out.println("A coordenada " + index + " está em cima do raio");
                }
            }
        }
    }

}