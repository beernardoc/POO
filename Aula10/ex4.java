package Aula10;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static java.lang.Character.isLetter;

public class ex4 {


    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new FileReader("words.txt"));
        List<String> lista = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();






        while (input.hasNext()) {
            String word = input.next();
            System.out.println(word);  //A

            lista.add(word);


            if(word.length() > 2){
                lista2.add(word);    //B
            }


        }
        System.out.println("\nLista completa: " + lista); //lista completa
        System.out.println("Lista com palavras > 2: " + lista2 +"\n"); //lista com palavras com tamanho > 2



    for(int i = 0; i < lista.size();i++){

        String atual = lista.get(i);


        if(atual.charAt(atual.length()-1) == 's'){
            System.out.println(atual + " (palavra terminada em s)");             //C
        }

        for(int j =0 ; j < atual.length();j++){

            char c = atual.charAt(j);


            if(!Character.isLetter(c)){
                lista.remove(atual);

            }


        }


        }
    System.out.println("\nlista completa sem palavras com elementos especiais: " + lista);








        }





        }

























