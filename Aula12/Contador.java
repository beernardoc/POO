package Aula12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Contador {




        public static void main(String[] args){


            String atual = null;
            Set<String> set = new HashSet<>();







            try{
                Scanner input = new Scanner(new FileReader("Aula12/words.txt"));

                while ((input.hasNext())){
                    String word = input.next();

                    set.add(word);



                }





            } catch (FileNotFoundException e) {
                System.out.println("Ficheironãoexistente!");
            }

            System.out.println(set.size());



        }




    }








