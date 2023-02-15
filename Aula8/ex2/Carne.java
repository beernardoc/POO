package Aula8.ex2;

public class Carne extends Alimento implements VariedadeCarne {
    

    Carne(String tipo,double proteinas, double calorias, double peso){
        Tipo = tipo;
        Proteinas = proteinas;
        Calorias = calorias;
        Peso = peso;

    }

    


    public String toString(){

        return Tipo + ", " + "Proteinas " + Proteinas + ", " + "Calorias " + Calorias + ", " + "Peso " + Peso;
    }

  
   

     

    


    




        
}

    

    

