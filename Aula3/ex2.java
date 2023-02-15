package Aula3;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor");
        float valor = sc.nextFloat();

        sc.close();

        while(valor != -1){
            System.out.println(valor);
            valor--;
        }




        
        }

    
    }

