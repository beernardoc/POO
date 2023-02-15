package Aula8.ex2;

public class PratoDieta extends Prato{
    
    double maxCal;

    PratoDieta(String nome, double maxCal){
        super(nome);
        this.maxCal = maxCal;
    }

    
    public boolean addIngrediente(Alimento x) {

        if(composição.contains(x) || x.getCalorias() > this.maxCal){ 
            
            return false;
        }
        else{
            
            composição.add(x);
            this.maxCal = this.maxCal - x.getCalorias();
            return true;
        }
    }
    public String toString(){

        return "Prato " + nome + ", composto por " + composição.size() + " ingredientes - Prato Dieta (" + maxCal + ") Calorias"   ;
    }


}
