package Aula5.P.Formas53;

class Circulo {

    float Raio;

    public Circulo(float raio){ // constructor
        this.Raio = raio;
    }


    public static boolean validCirculo(float raio){
        if(raio >= 0){return true;}
        return false;

    }

    public double areaCirculo(float raio){
        double area = 0;

        if(Circulo.validCirculo(raio)){
            area = Math.PI*(Math.pow(raio, 2));
            return area;
        }
        return 0; //erro


    }



    public double perimetroCirculo(float raio){
        
        if(Circulo.validCirculo(raio)){

            double perimetro = 2*Math.PI*raio;  
            return perimetro;          
        }
        return 0; //erro

    }

    public String toString(){

        return "Raio: " + Raio;


    }


}

class Triangulo{
    float Lado1;
    float Lado2;
    float Lado3;

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


    public double areaTriangulo(float lado1,float lado2, float lado3){

        if(Triangulo.validTriangulo(lado1,lado2,lado3)){
            float p = (lado1 + lado2 + lado3)/2;
            double area = Math.sqrt(p*(p - lado1)*(p - lado2)*(p - lado3));
            return area;
        }
        return 0; //erro


    }


    public double perimetroTriangulo(float lado1,float lado2, float lado3){
        
        if(Triangulo.validTriangulo(lado1,lado2,lado3)){

            double perimetro = lado1 + lado2 + lado3 ;
            return perimetro;          
        }
        return 0; //erro

    }


    public String toString(){

        return "Lado1: " + Lado1+ " ; " + "Lado2: " + Lado2 + " ; " + "Lado3: " + Lado3;


    }


}
    


class Retangulo{

    float Comprimento;
    float Altura;



    public Retangulo(float comprimento, float altura){
        this.Comprimento = comprimento;
        this.Altura = altura;

    }

    public static boolean validRetangulo(float comprimento,float altura){
        if(comprimento < 0 || altura < 0){return false;}
        return true;

    }

    public double areaRetangulo(float comprimento,float altura){

        if(Retangulo.validRetangulo(comprimento, altura)){
            double area = comprimento * altura;
            return area;
        }
        return 0; //erro

    }

    public double perimetroRetangulo(float comprimento,float altura){
        
        if(Retangulo.validRetangulo(comprimento,altura)){

            double perimetro = (comprimento*2) + (altura*2);
            return perimetro;          
        }
        return 0; //erro

    }


    public String toString(){

        return "comprimento: " + Comprimento+ " ; " + "altura: " + Altura;


    }



}




    




   

