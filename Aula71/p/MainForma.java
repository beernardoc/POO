package Aula71.p;
import java.util.Scanner;


public class MainForma {

    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       

        int fim = 1;

      

        while (fim != 0){
            fim = menu();


            switch(fim){
                case 0:
                fim = 0;
                System.out.println("ATÉ LOGO :)");
                    break;
    
                case 1:
                System.out.println("digite o raio");
                float r = sc.nextFloat();
                System.out.println("digite a cor");
                String c = sc.next();
                
                
    
                Circulo circulo = new Circulo(r, c);
    
                double areaC = circulo.area();
                double perimetroC = circulo.perimetro();
                String color = circulo.color;
                System.out.println(circulo);
                System.out.println("Area: " + areaC);
                System.out.println("Circunferencia: " + perimetroC);
                System.out.println("Cor: " + color + "\n");
                fim = 1;
                break;
    
                case 2:
                    System.out.println("digite o lado 1");
                    float l1 = sc.nextFloat();
                    System.out.println("digite o lado 2");
                    float l2 = sc.nextFloat();
                    System.out.println("digite o lado 3");
                    float l3 = sc.nextFloat();
                    
                
    
                    Triangulo triangulo = new Triangulo(l1,l2,l3);
    
                    double areaT = triangulo.area();
                    double perimetroT = triangulo.perimetro();
                    System.out.println(triangulo);
                    System.out.println("Area: " + areaT);
                    System.out.println("perimetro: " + perimetroT+ "\n");
                    fim = 2;
                    break;
    
                case 3:
                    System.out.println("digite o comprimento");
                    float comprimento = sc.nextFloat();
                    System.out.println("digite a altura");
                    float altura = sc.nextFloat();
    
                    Retangulo retangulo = new Retangulo(comprimento, altura);
    
                    double areaR = retangulo.area();
                    double perimetroR = retangulo.perimetro();
                    System.out.println(retangulo);
                    System.out.println("Area: " + areaR);
                    System.out.println("perimetro: " + perimetroR+ "\n");
                    fim = 3;
                    break;
    
    
                
            }

            
    

        }



sc.close();

    }





    public static int menu(){
        Scanner sc = new Scanner(System.in);

        

        System.out.println("Date operations:");
        System.out.println("1 - create new circle \n2 - create new triangle \n3 - create new rectangle \n0 - EXIT");
        System.out.println("Choose option");

        int option = sc.nextInt();
        

        return option;

    }

    
}

    

