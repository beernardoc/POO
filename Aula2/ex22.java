import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite a temperatura em °C");
        double temp = sc.nextDouble();
        double fahren = (temp * 1.8) + 32;
        System.out.println("emperatura (F): " + fahren);
        sc.close();
    }
}