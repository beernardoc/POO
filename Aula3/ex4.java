package Aula3;

import java.util.Scanner;

public class ex4 {
    
    

    public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        float x1 = sc.nextFloat();
        System.out.println("Digite outro numero");
        float x2 = sc.nextFloat();

        float soma = x1 + x2;
        float quant = 2;
        float media = (x1 + x2)/quant;
        float maior = x1;
        float menor = x2;
        
        
        float cont = 0;


        if(x2 == x1){

            System.out.println("o maior é: " + maior);
            System.out.println("o menor é: " + menor);
            System.out.println("a media é: " + media);
            System.out.println("a soma é: " + soma);
            System.out.println("foram digitados " + quant + " numeros");

        }
        else{
            while(cont!=x1 ){
                 System.out.println("Digite outro numero");
                 float proximo = sc.nextFloat();

                 soma = soma + proximo;
                 quant++;
                 media = soma/quant;

                 if(proximo > maior){
                    maior = proximo;
                    }
                if(proximo < menor){
                    menor = proximo;
                    }
                cont = proximo;

            }


            System.out.println("o maior é: " + maior);
            System.out.println("o menor é: " + menor);
            System.out.println("a media é: " + media);
            System.out.println("a soma é: " + soma);
            System.out.println("foram digitados " + quant + " numeros");
        }
        
sc.close();
       

}
}

