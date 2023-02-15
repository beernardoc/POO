package Aula6;

import Aula5.P.Date51.Date;

public class mainpessoa {
    public static void main(String[] args) {

        Pessoa teste1 = new Pessoa("bernardo", 123, new Date(18,2,2000));
        Pessoa teste2 = new Pessoa("ana", 124, new Date(18,2,2000));

        
        System.out.println(teste1);
        System.out.println(teste2);

        teste1.setname("joao");
        teste2.setname("luana");


        System.out.println(teste1);
        System.out.println(teste2);


     

        Aluno al = new Aluno("Andreia Melo", 9855678, new Date(18, 7, 1990), 100, new Date(1, 9, 2018));

        
        Bolseiro bls = new Bolseiro("Igor Santos", 8976543, new Date(11, 5, 1985), 101, new Date(26, 04, 2022), 900);
        bls.setBolsa(1050);
        
    System.out.println("Aluno: " + al.getName());
    System.out.println(al);
   
   System.out.println("Bolseiro: " + bls.getName() + ", NMec: " + bls.getNMec() + ", Bolsa: " + bls.getBolsa());
   System.out.println(bls);
    }
   } 


   // TIRAR DUVIDA SOBRE COMO COLOCAR O NUMERO MEC SEQUENCIAL