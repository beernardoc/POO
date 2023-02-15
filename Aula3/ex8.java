package Aula3;
import java.lang.Math;


public class ex8 {

   
      public static void main(String[] args) {
          int cont = 1;
          int number;
          double dec;
          double notat;
          double notap;
          double pauta;

          System.out.printf("%5s %5s %5s ", "NotaT", "NotaP", "Pauta");
          System.out.println();

          while(cont <=16){

             number = (int)(Math.random()*20);
             dec = (Math.round(Math.random()*10.0)/10.0);
             notat = number + dec;

             number = (int)(Math.random()*20);
             dec = (Math.round(Math.random()*10.0)/10.0);
             notap = number + dec;


             if(notat >= 7.0 && notap >=7.0){
                pauta = Math.round(((0.4*notat + 0.6*notap)*10.0))/10.0;
            }
    
            else{
                pauta = 66;
            }

            System.out.printf("%5s %5s %5s ", notat, notap, pauta);
            System.out.println();

             cont++;

             




          }

      }
  
}
