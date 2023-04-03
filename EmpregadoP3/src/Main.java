public class Main {
    public static void main(String[] args) {

        Assalariado A = new Assalariado("Gustavo", "Antunes", 352352);
        A.vencimento(5000);
        System.out.println(A);
        System.out.println();

        Comissionado B = new Comissionado("Joana", "Marcela", 354634223);
        B.vencimento(7000, 3000);
        System.out.println(B);
        System.out.println();

        Horista C = new Horista("Pedro", "Manoel", 587382432);
        C.vencimento(60, 20);
        System.out.println(C);
        System.out.println();

        
    }
}
