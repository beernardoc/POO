package Aula5.P.Formas53;

import java.util.Scanner;

public class MainFormasGeo {

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
                
                
    
                Circulo circulo = new Circulo(r);
    
                double areaC = circulo.areaCirculo(r);
                double perimetroC = circulo.perimetroCirculo(r);
                System.out.println(circulo);
                System.out.println("Area: " + areaC);
                System.out.println("Circunferencia: " + perimetroC + "\n");
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
    
                    double areaT = triangulo.areaTriangulo(l1,l2,l3);
                    double perimetroT = triangulo.perimetroTriangulo(l1, l2, l3);
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
    
                    double areaR = retangulo.areaRetangulo(comprimento, altura);
                    double perimetroR = retangulo.perimetroRetangulo(comprimento, altura);
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
