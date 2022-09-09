package Aula10;


import java.util.*;
import java.util.ArrayList;

public class ex2 {

    public static void main(String[] args) {

        Map<String, ArrayList<String>> conjunto = new LinkedHashMap<String, ArrayList<String>>();

        conjunto.put("Branco", new ArrayList<>(Arrays.asList("que tem cor de giz","que tem cor de neve")));
        conjunto.put("Verde", new ArrayList<>(Arrays.asList("Que tem cor de folha")));
        conjunto.put("Azul", new ArrayList<>(Arrays.asList("que tem cor de ceu")));
        conjunto.put("Preto", new ArrayList<>(Arrays.asList("que tem cor de morte")));
        conjunto.put("Laranja", new ArrayList<>(Arrays.asList("que tem cor de laranja")));



        System.out.println("Map original: ");
        System.out.println(conjunto);

        conjunto.remove("Preto");
        System.out.println("Map após remoção: ");
        System.out.println(conjunto);




        System.out.println("Map chaves: ");
        System.out.println(conjunto.keySet());
        System.out.println("Map valores: ");
        System.out.println(conjunto.values());

        String pesquisaaleatoria = pesquisaAleatoria(conjunto, "Branco");

        System.out.println("Valor aleatorio da chave Branco: ");
        System.out.println(pesquisaaleatoria);













    }


    public static String pesquisaAleatoria(Map<String, ArrayList<String>> a, String key){

        ArrayList<String> teste = a.get(key);

        int max = teste.size();


        Random numero = new Random();
        int aleatorio = numero.nextInt(max);
        return teste.get(aleatorio);


















    }


    private static class string {
    }
}
