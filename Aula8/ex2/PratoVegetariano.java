package Aula8.ex2;

public class PratoVegetariano extends Prato {



    PratoVegetariano(String nome){
        super(nome);

    }

    public boolean addIngrediente(Alimento x) {
        

        if(composição.contains(x) || x.getTipo() == "Peixe Congelado" || x.getTipo() == "Peixe Fresco" || x.getTipo() == "Vaca" || x.getTipo() == "Frango" || x.getTipo() == "Peru" || x.getTipo() == "Porco"){

            return false;
        }
        else{
            composição.add(x);
            return true;
        }
    }

    public String toString(){

        return "Prato " + nome + ", composto por " + composição.size() + " ingredientes - Prato Vegetariano"   ;
    }

    
}
