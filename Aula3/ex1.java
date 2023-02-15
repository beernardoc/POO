package Aula3;






import java.util.Scanner;



public class ex1 {
    
    



    public static double nota(){
      double notafinal = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("digite a nota da componente pratica");
        double notap = Math.round(sc.nextDouble()*10.0)/10.00;
        System.out.println("digite a nota da componente teorica");
        double notat = Math.round(sc.nextDouble()*10.0)/10.00;

        while((notat < 0.0 || notat >20.0) || (notap < 0.0 || notap >20.0)){
            System.out.println("digite a nota da componente pratica entre 0 e 20");
             notap = Math.round(sc.nextDouble()*10.0)/10.00;
            System.out.println("digite a nota da componente teorica entre 0 e 20");
             notat = Math.round(sc.nextDouble()*10.0)/10.00;
        }


        if(notat >= 7.0 && notap >=7.0){
            notafinal = Math.round(((0.4*notat + 0.6*notap)*10.0))/10.0;
        }

        else{
            notafinal = 66;
        }


        sc.close();

        return notafinal;

    }

    public static void main(String[] args) {
        double resultado = nota();
        
        System.out.println(resultado);

       
    }

   




    
}
