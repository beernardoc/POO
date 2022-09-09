package Aula11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class ex1 {

    public static void main(String[] args){

        String atual = null;


        HashMap<String, Integer> lista = new HashMap<>();
        Map<String,HashMap<String,Integer>> fim = new HashMap<String,HashMap<String,Integer>>();
        int cont = 0;




        try{
            Scanner input = new Scanner(new FileReader("Aula11/major.txt"));

            while ((input.hasNext()) &&  cont != 1){

                atual = input.next();   //para selecionar a primeira palavra e a logica funcionar
                cont++;



            }


            while(input.hasNext()){


                String word = input.next();


                word = validar(word);

                if(word.length() >= 3){
                    HashMap<String,Integer> teste = new HashMap<>();

                    if(!fim.containsKey(atual)){

                        teste.put(word,1);
                        fim.put(atual,teste);


                    }
                    else{



                        if(!fim.get(atual).containsKey(word)){

                            fim.get(atual).put(word,1);
                        }
                        else{
                            fim.get(atual).replace(word,fim.get(atual).get(word).intValue()+ 1);


                        }


                    }

                    atual = word;
                }


            }
            input.close();


        } catch (FileNotFoundException e) {
            System.out.println("Ficheironãoexistente!");
        }
        System.out.println(fim);


    }

    public static String validar(String word){

        for(int i = 0; i < word.length();i++){
            char c = word.charAt(i);

            if(!Character.isLetter(c) && !Character.isDigit(c)){

                return word.substring(0,i).toLowerCase();

            }

        }
        return word.toLowerCase();





    }


}


