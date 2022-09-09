package Aula10;

import Aula6.Pessoa;

import java.util.*;

public class ex1  {

    public static void main(String[] args) {

        Map<String, String> conjunto = new HashMap<>();


        conjunto.put("Branco", "Que tem cor de neve");
        conjunto.put("Verde", "Que tem cor de folha");
        conjunto.put("Azul", "Que tem cor de ceu");
        conjunto.put("Preto", "Que tem cor de morte");
        conjunto.put("Laranja", "Que tem cor de laranja");

        System.out.println("Map original: ");
        System.out.println(conjunto);

        conjunto.remove("Preto");
        System.out.println("Map após remoção: ");
        System.out.println(conjunto);

        conjunto.replace("Branco", "que tem cor de giz");

        System.out.println("Map após alteração: ");
        System.out.println(conjunto);



        System.out.println("Map chaves: ");
        System.out.println(conjunto.keySet());
        System.out.println("Map valores: ");
        System.out.println(conjunto.values());







    }

    }


















