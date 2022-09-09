package Aula10;

import java.util.*;

public class ex3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a palavra");
        String palavra = sc.next();

        lerPalavra(palavra);






    }



    public static void lerPalavra(String entrada){

        Map<Character,ArrayList<Integer>> dic = new HashMap<>();





        for (int i=0; i<entrada.length(); i++) {

            char c = entrada.charAt(i);


            if(!dic.containsKey(c)){
                dic.put(c,new ArrayList<>(Arrays.asList(i)));
            }
            else{
                dic.get(c).add(i);
            }






        }
    System.out.println(dic);




    }






}
