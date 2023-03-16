public class Bhaskara {
    private double a, b, c, raiz1, raiz2 ;
    

    public double distancia(double ponto01,  double ponto02){
     ponto01 = Math.pow(ponto01, 2);
     ponto02 = Math.pow(ponto02, 2);
    double distancia = Math.sqrt(ponto01 + ponto02);
    return distancia;
    }

    public double delta(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        Double delta = Math.pow(b, 2) + (-4 * a * c);

        return delta;
    }
    public double raiz01(double delta){
        raiz1 = ((-b) + Math.sqrt(Math.abs(delta))) / (2 * a);
      return raiz1;
    }
    public double raiz02(double delta){
        raiz2 =  ((-b) - Math.sqrt(Math.abs(delta))) / (2 * a);
        return raiz2;
    }

}
