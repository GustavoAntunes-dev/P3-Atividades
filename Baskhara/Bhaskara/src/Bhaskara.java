import java.util.Scanner;

public class Bhaskara {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();

        Double resultado1;
        Double resultado2;

        Double delta = Math.pow(b, 2) + (-4 * a * c);
        
        if(delta>=0){
        resultado1 = ((-b) + Math.sqrt(Math.abs(delta))) / (2 * a);
        resultado2 = ((-b) - Math.sqrt(Math.abs(delta))) / (2 * a);

        System.out.printf("Raiz 1 : %.3f%n", resultado1);
        System.out.printf("Raiz 2 : %.3f%n", resultado2);
        }else{
            System.out.println("Não possui raizes");
        }
    }

}
