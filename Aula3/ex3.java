package Aula3;

import java.util.Scanner;

public class ex3 {
    
    public static Boolean primo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero");
        float valor = sc.nextFloat();

        while(valor < 0){
            System.out.println("digite um numero positivo");
            valor = sc.nextFloat();
        }
        sc.close();

        int cont = 0;
        float resto = 0;

        for(float i = 1; i != valor+1;i++){
             resto = valor%i;
             if(resto == 0){
                 cont = cont+1;
             }
             resto = 0;

        }
        
        if(cont == 2){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args){
        Boolean resultado = primo();
        if(resultado){
            System.out.println("O numero é primo");
        }
        else{
            System.out.println("O numero não é primo");
        }

        }

    
    }


