package Aula5.P.Calendar52;


import java.util.Scanner;

public class mainCalendar {
    public  static void main(String[] args){

        int year = 0;
        int first = 0;
        int m = 1;

        Calendar calendario = new Calendar(year, first);
        

        

        Scanner sc1 = new Scanner(System.in);

        

        int op = 1;

        while(op != 0){

            op = menu();




        switch(op){

            

            

            case 1:

            calendario.set(year, first);
            
            System.out.println("Digite o ano:");
            year = sc1.nextInt();
            System.out.println("Digite o dia da semana que o ano começa:");
            first = sc1.nextInt();
            calendario.set(year, first);
           
           
            
            


            
            

            break;

            case 2:

            if(year == 0){
                System.out.println("Digite o ano:");
                year = sc1.nextInt();
                System.out.println("Digite o dia da semana que o ano começa:");
                first = sc1.nextInt();
                calendario.set(year, first);
            }

            System.out.println("Digite o mes:");
            m = sc1.nextInt();
            
            System.out.println(calendario.printMonth(m));
            

            break;

            case 3:

            if(year == 0 && m == 1){
                System.out.println("Digite o ano:");
                year = sc1.nextInt();
                System.out.println("Digite o dia da semana que o ano começa:");
                first = sc1.nextInt();
                calendario.set(year, first);
            }


            System.out.println(calendario);

            
           
            


            
        }


    }

    sc1.close();

System.out.println("VOLTE SEMPRE :)");



       
    }

    public static int menu(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Calendar operations:");
        System.out.println("1 - create new calendar \n2 - print calendar month \n3 - print calendar \n0 – exit");

        int op = sc.nextInt();
     
        return op;
       


        

       
        







    }



}
