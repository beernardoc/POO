package Aula3;
import java.lang.Math;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args){

        int number = (int)(Math.random() * 100);
        int cont = 1;

        System.out.println("digite um numero");
        Scanner sc = new Scanner(System.in);
        int tentativa = sc.nextInt();

        while( tentativa != number){
            if(tentativa > number){
                System.out.println("tentativa muito alta");
                System.out.println("digite um numero menor que o anterior");
            }
            else{
                System.out.println("tentativa muito baixa");
                System.out.println("digite um numero maior que o anterior");

            }

            
            sc = new Scanner(System.in);
            tentativa = sc.nextInt();
            cont++;
        }

        System.out.println("PARABENS!! voce acertou o numero: " + tentativa +" em: " + cont + " tentativas");
        System.out.println(number);
        sc.close();




       
        }
        

    
}
