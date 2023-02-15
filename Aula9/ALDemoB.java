package Aula9;
import Aula6.Pessoa;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import java.util.Set;



import Aula5.P.Date51.Date;


public class ALDemoB {
    
    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();
        for(int  i= 10; i<= 100; i+=10) 
            c1.add(i);
        System.out.println("Size: "+ c1.size());
        for(int i= 0; i< c1.size(); i++) 
        System.out.println("Elemento: "+ c1.get(i));
        ArrayList<String> c2= new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio"); 
        c2.remove(0);
        System.out.println(c2);
       
   


        //b

        Set<Pessoa> c3 = new HashSet<>();
       
        
        c3.add(new Pessoa("Bernardo", 1, new Date(06, 10, 2000)));
        c3.add(new Pessoa("Gaby", 2, new Date(07, 10, 2000)));
        c3.add(new Pessoa("Mario", 3, new Date(8, 10, 2000)));
        c3.add(new Pessoa("Ric", 4, new Date(9, 10, 2000)));
        c3.add(new Pessoa("Artur", 5, new Date(10, 10, 2000)));



        Iterator<Pessoa> it =  c3.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        

        
        






        


        
        

        



        



    }
    }