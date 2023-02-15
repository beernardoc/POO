import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("digite o valor do cateto A");
        double catetoA = sc.nextDouble();
        System.out.print("digite o valor do cateto B");
        double catetoB = sc.nextDouble();
        

        double hip = Math.sqrt( Math.pow(catetoA,2) + Math.pow(catetoB,2));

        System.out.println("hipotenusa: " + hip);

        double cos =  catetoA / hip;
        System.out.println("cos: " + cos);
        double angulo = Math.acos(cos);

        System.out.println("Angulo: " + Math.toDegrees(angulo));



        sc.close();




    }

}
