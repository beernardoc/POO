package Aula4;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args){
       
       Scanner sc = new Scanner(System.in);
        String palavra = new String();  
        System.out.println("Digite uma frase");
        palavra = sc.nextLine();


        int QuantidadeNumeros = QuantidadeNumeros(palavra);
        System.out.println("A quantidade de caracteres numericas é: " + QuantidadeNumeros);

        int QuantidadeEspaços = QuantidadeEspaços(palavra);
        System.out.println("A quantidade de espaços é: " + QuantidadeEspaços);


        boolean minusculas = minusculas(palavra);
        System.out.println("é formada só por letrar minusculas?: " + minusculas);


        // continuar daqui 4.2.4









sc.close();
    }

    public static int QuantidadeNumeros(String palavra){

        
        int cont = 0;
        for(int x = 0; x < palavra.length();x++){
            if (Character.isDigit(palavra.charAt(x))){
                cont++;
            }
        }

        return cont;

    }

    
    public static int QuantidadeEspaços(String palavra){

    
        int cont = 0;
        for(int x = 0; x < palavra.length();x++){
           if(palavra.charAt(x) == ' '){
               cont++;
           }
        }

        return cont;

    }

    public static boolean minusculas(String palavra){
        int cont = 0;
        for(int x = 0; x < palavra.length();x++){
           if(Character.isUpperCase(palavra.charAt(x))){
               cont++;
               
           }
           
        }

        if(cont == 0){
            return true;
        }
        else{
            return false;
        }



        
    
    }

    
}
