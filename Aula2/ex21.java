

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite os kms");
        double km = sc.nextDouble();
        double milhas = km / 1.609;
        System.out.println(milhas);
        sc.close();
    }
}
