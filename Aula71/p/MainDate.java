package Aula71.p;

import java.util.Scanner;

public class MainDate {


    
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o  ano");
        int y = sc.nextInt();
        System.out.println("digite o  mes");
        int m = sc.nextInt();
        System.out.println("digite o  dia");
        int  d = sc.nextInt();

        DateYMD date = new DateYMD(d, m, y);


       

    



        while (date.valid() == false){
            System.out.println("Insira uma data valida"); 

            System.out.println("digite o  ano");
            y = sc.nextInt();
            System.out.println("digite o  mes");
            m = sc.nextInt();
            System.out.println("digite o  dia");
            d = sc.nextInt();
            date.set(d, m, y);
        }

        date.set(d, m, y);
        DateND datecomp = new DateND();
        System.out.println("desta data até o dia 01/01/2000 se passaram " + datecomp.comparaçao(date) + " dias");

        

      
        switch(menu()){
            
            case 1:
            System.out.println("digite um novo ano");
            y = sc.nextInt();
            System.out.println("digite um novo mes");
            m = sc.nextInt();
            System.out.println("digite um novo dia");
            d = sc.nextInt();

            date.set(d, m, y);

            


            while (date.valid() == false){
                System.out.println("Insira uma data valida"); 

                System.out.println("digite o  ano");
                y = sc.nextInt();
                System.out.println("digite o  mes");
                m = sc.nextInt();
                System.out.println("digite o  dia");
                d = sc.nextInt();
            }
            
            date.set(d, m, y);

            
            
            System.out.println("A nova data é: " + date);
            menu();
            break;
            

            case 2:
            System.out.println("A  data é: " + date);
            break;

            case 3:

            if(date.valid()){
                date.increment();
                System.out.println("A data após o incremento é: " + date);
            break;
            }
       
            case 4:

            if(date.valid()){
                date.decrement();
                System.out.println("A data após o decremento é: " + date);
            break;

            }
        
            

            case 0:
            break;
        

        
     

    }
    

    
    sc.close();
    }



public static int menu(){
    Scanner sc = new Scanner(System.in);

    

    System.out.println("Date operations:");
        System.out.println("1 - create new DateYMD \n2 - show current DateYMD \n3 - increment DateYMD \n4 - decrement DateYMD \n0 - exit");
        System.out.println("Choose option");
        int option = sc.nextInt();
    

    return option;

}


    
}
