import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("velocidade 1?");
        double v1 = sc.nextDouble();
        System.out.print("distancia 1?");
        double d1 = sc.nextDouble();
        System.out.print("velocidade 2?");
        double v2 = sc.nextDouble();
        System.out.print("distancia 2?");
        double d2 = sc.nextDouble();

        double t1 = d1 / v1;
        double t2 = d2 / v2;
        double velmedia = (d1 + d2)/(t1 + t2);

        System.out.println("velocidade media: " + velmedia);

        sc.close();

    }

}
