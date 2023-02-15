import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("entre com a quantidade de água em KG");
        double quantidade = sc.nextDouble();
        System.out.print("entre com a temperatura inicial");
        double tempinicial = sc.nextDouble();
        System.out.print("entre com a temperatura final");
        double tempfinal = sc.nextDouble();
        double Q = quantidade * (tempfinal - tempinicial) * 4184;
        System.out.println("Energia necessaria: " + Q);
        sc.close();
        }
        
}