package Aula4;

import java.util.Scanner;



public class ex1 {
    static String NovaFrase;
    static String palavra = new String();
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args){
        
        System.out.println("digite uma palavra, frase ou parágrafo");
        palavra = sc.nextLine();

    
        

        

        String frase = FraseMinusc(palavra);
        System.out.println("a frase em minusculas é: " + frase);
        String UltimoChar = UltimoChar(palavra);
        System.out.println("o ultimo caracter da palavra é: " + UltimoChar);
        String TresPrimeiros = TresPrimeiros(palavra);
        System.out.println("os tres primeiros caracteres são: " + TresPrimeiros);
        Boolean Igualdade = Igualdade(palavra);
        System.out.println("as frases: " + palavra + " e " + NovaFrase + " sao iguais?: " + Igualdade);
        String FraseMaiuscula = Maiuscula(palavra);
        System.out.println("a frase em maiuscula é: " + FraseMaiuscula);



    }

    public static String FraseMinusc(String palavra){

        return palavra.toLowerCase();
    }

    public static String UltimoChar(String palavra){

        return palavra.substring(palavra.length()-1);

    }

    public static String TresPrimeiros(String palavra){

        return palavra.substring(0,3);

    }
    public static Boolean Igualdade(String palavra){
        System.out.println("digite uma nova palavra, frase ou parágrafo");
        NovaFrase = sc.nextLine();

        int resultado = NovaFrase.compareTo(palavra);

        if(resultado == 0){
            return true;
        }
        else{
            return false;
        }
        
    
    }
    public static String Maiuscula(String palavra){
        return palavra.toUpperCase();

    }
    











    
       
 
       
       

}








    

