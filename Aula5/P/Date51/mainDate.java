package Aula5.P.Date51;

import java.util.Scanner;

public class mainDate {

    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o  ano");
        int y = sc.nextInt();
        System.out.println("digite o  mes");
        int m = sc.nextInt();
        System.out.println("digite o  dia");
        int  d = sc.nextInt();



        while (Date.valid(d,m,y) == false){
            System.out.println("Insira uma data valida"); 

            System.out.println("digite o  ano");
            y = sc.nextInt();
            System.out.println("digite o  mes");
            m = sc.nextInt();
            System.out.println("digite o  dia");
            d = sc.nextInt();
        }

        Date data = new Date(d, m, y);
        



        System.out.println("Date operations:");
        System.out.println("1 - create new date \n2 - show current date \n3 - increment date \n4 - decrement date \n0 - exit");
        System.out.println("Choose option");

        
        int teste = sc.nextInt();

      
        switch(teste){
            
            case 1:
            System.out.println("digite um novo ano");
            y = sc.nextInt();
            System.out.println("digite um novo mes");
            m = sc.nextInt();
            System.out.println("digite um novo dia");
            d = sc.nextInt();

            


            while (Date.valid(d,m,y) == false){
                System.out.println("Insira uma data valida"); 

                System.out.println("digite o  ano");
                y = sc.nextInt();
                System.out.println("digite o  mes");
                m = sc.nextInt();
                System.out.println("digite o  dia");
                d = sc.nextInt();
            }
            

            
            
            System.out.println("A nova data é: " + data);
            break;
            

            case 2:
            System.out.println("A  data é: " + data);
            break;

            case 3:
            Date incrementoDate = new Date(d,m,y);
            incrementoDate.increment(d,m,y);
            System.out.println("A data após o incremento é: " + incrementoDate);
            break;
            

            case 4:
            Date decrementoDate = new Date(d,m,y);
            decrementoDate.decrement(d,m,y);
            System.out.println("A data após o decremento é: " + decrementoDate);
            break;

            case 0:
            break;
     

    }
    
    sc.close();
}





}
