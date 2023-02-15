import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite os segundos");
        int seg = sc.nextInt();

        int horas = seg/3600;

        int minutos = (seg/60)%60;
        int segundos = seg%60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        sc.close();
    }
}
