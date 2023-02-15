package Aula3;

import java.util.Scanner;

public class ex5 {


    public static void main(String[] args){

       
 
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o montante");
        float mont = sc.nextFloat();

        

        while(mont%1000 != 0 || mont < 0 ){
            System.out.println("Digite um montante positovo e multiplo de 1000");
            mont = sc.nextFloat();
        }
        
        System.out.println("Digite a taxa");
        float tax = sc.nextFloat();

        while(tax < 0 || tax > 5){
            System.out.println("Digite uma taxa entre 0% e 5%");
            tax = sc.nextFloat();
        }


        juros(mont,tax);
  
sc.close();
       

}


public static void juros(float mont, float tax){
    int cont = 1;

    while(cont <= 12){
        float novomont = mont*(1+(tax/100));
        mont = novomont;
        


        System.out.println("valor no " + cont + "° mês: " + novomont);
        cont++;
    }
}
}
