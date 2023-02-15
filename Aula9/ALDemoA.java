package Aula9;


import java.util.ArrayList;

import java.util.Collections;


import java.util.Scanner;





public class ALDemoA {
    
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
       
        //a

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        int verificar = sc.nextInt();

        if(c1.contains(verificar)){

            System.out.println("O objeto c1 contem o numero " + verificar + " na posição " + c1.indexOf(verificar));
            c1.add(verificar); 
            System.out.println("Numero " + verificar + " adicionado ");
        }
        else{
            System.out.println("O objeto c1 não contem o numero " + verificar );
            c1.add(verificar);
            System.out.println("Numero " + verificar + " adicionado ");
            
        }
       

        System.out.println("A ultima ocorrencia do valor " + verificar + " é na posição " + c1.lastIndexOf(verificar));
        System.out.println(c1);

        System.out.println("Digite outro elemento a ser adicionado ao objeto c2");
        String newNumber = sc.next();
        System.out.println("Digite a posição");
        int newPosition = sc.nextInt();

        if(newPosition >= 0 && newPosition < c2.size()){
            c2.set(newPosition, newNumber);
            System.out.println(c2);

        }
        else{
            System.out.println("posição fora do tamanho do objeto");
        }

  


sc.close();
        



    }
    }