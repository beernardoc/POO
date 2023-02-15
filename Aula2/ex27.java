import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("digite o valor de x1");
        double x1 = sc.nextDouble();
        System.out.print("digite o valor de y1");
        double y1 = sc.nextDouble();
        System.out.print("digite o valor de x2");
        double x2 = sc.nextDouble();
        System.out.print("digite o valor de y2");
        double y2 = sc.nextDouble();

        double cat1 = Math.abs(x1 - x2);
        double cat2 = Math.abs(y1 - y2);

        double distancia = Math.sqrt( Math.pow(cat1,2) + Math.pow(cat2,2));

        System.out.println("Distancia: " + distancia);


        sc.close();




    }

}
