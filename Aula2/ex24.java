import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite o montante");
        double montante = sc.nextDouble();
        System.out.print("digite a taxa");
        double taxa = sc.nextDouble() * 0.01;

        for(int cont = 1; cont <= 3 ; cont++){
            montante = montante * (1+taxa);
        }
        
        System.out.println("valor final: " + montante);
     sc.close();
    }
}
