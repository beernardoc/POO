package Aula71.p;



 public abstract class Forma{

    public abstract double perimetro();
    public abstract double area();
    protected String color;


    

}





class Circulo extends Forma {


    float Raio;

   

    void setcolor(String color){
        this.color = color;
        
    }

    void setraio(float raio){
        Raio = raio;
    }

  
    public Circulo(float raio, String color){ // constructor
        this.Raio = raio;
        this.color = color;
    }


    public static boolean validCirculo(float raio){
        if(raio >= 0){return true;}
        return false;

    }

    public double area(){
        double area = 0;

        if(Circulo.validCirculo(Raio)){
            area = Math.PI*(Math.pow(Raio, 2));
            return area;
        }
        return 0; 


    }



    public double perimetro(){
        
        if(Circulo.validCirculo(Raio)){

            double perimetro = 2*Math.PI*Raio;  
            return perimetro;          
        }
        return 0; //erro

    }

    public String toString(){

        return "Raio: " + Raio;


    }


}

class Triangulo extends Forma{
    float Lado1;
    float Lado2;
    float Lado3;

    Triangulo(String color){
        this.color = color;
}

    void setcolor(String color){
    this.color = color;
    
}


    public Triangulo(float lado1,float lado2, float lado3){ // constructor
        this.Lado1 = lado1;
        this.Lado2 = lado2;
        this.Lado3 = lado3;
    }


    public static boolean validTriangulo(float lado1,float lado2, float lado3){
        if(lado1 > lado2 + lado3 || lado2 > lado1 + lado3 || lado3 > lado2 + lado1 ){
            return false;
        }
        return true;

    }


    public double area(){

        if(Triangulo.validTriangulo(Lado1,Lado2,Lado3)){
            float p = (Lado1 + Lado2 + Lado3)/2;
            double area = Math.sqrt(p*(p - Lado1)*(p - Lado2)*(p - Lado3));
            return area;
        }
        return 0; //erro


    }


    public double perimetro(){
        
        if(Triangulo.validTriangulo(Lado1,Lado2,Lado3)){

            double perimetro = Lado1 + Lado2 + Lado3 ;
            return perimetro;          
        }
        return 0; //erro

    }


    public String toString(){

        return "Lado1: " + Lado1+ " ; " + "Lado2: " + Lado2 + " ; " + "Lado3: " + Lado3;


    }


}
    


class Retangulo extends Forma{

    float Comprimento;
    float Altura;

    Retangulo(String color){
        this.color = color;
}

void setcolor(String color){
    this.color = color;
    
}



    public Retangulo(float comprimento, float altura){
        this.Comprimento = comprimento;
        this.Altura = altura;

    }

    public static boolean validRetangulo(float comprimento,float altura){
        if(comprimento < 0 || altura < 0){return false;}
        return true;

    }

    public double area(){

        if(Retangulo.validRetangulo(Comprimento, Altura)){
            double area = Comprimento * Altura;
            return area;
        }
        return 0; //erro

    }

    public double perimetro(){
        
        if(Retangulo.validRetangulo(Comprimento,Altura)){

            double perimetro = (Comprimento*2) + (Altura*2);
            return perimetro;          
        }
        return 0; //erro

    }


    public String toString(){

        return "comprimento: " + Comprimento+ " ; " + "altura: " + Altura;


    }



}
