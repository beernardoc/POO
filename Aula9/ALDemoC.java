package Aula9;


import java.util.ArrayList;

import java.util.Collections;

import java.util.Set;
import java.util.TreeSet;


import Aula5.P.Date51.Date;


public class ALDemoC {
    
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

        Set<String> ts1 = new TreeSet<>();
 
        // Elements are added using add() method
        ts1.add("A");
        ts1.add("B");
        ts1.add("C");
 
        // Duplicates will not get insert
        ts1.add("C");
 
        // Elements get stored in default natural
        // Sorting Order(Ascending)
        System.out.println(ts1);


        Date a = new Date(10,5,1999);
        Date b = new Date(10,5,2000);



        
        Set<Date> c4 = new TreeSet<>();


        c4.add(a);
        c4.add(b);

        
        System.out.println(c4);

        










    }
       
    

        

        
        

        



    }
    