package Aula8.ex2;

import java.util.ArrayList;
import java.util.List;

public class Prato {

        String nome;
        protected List<Alimento> composição = new ArrayList<>(); 
        

        Prato(String nome){
            this.nome = nome;
        }

        public boolean addIngrediente(Alimento x){

            if(composição.contains(x)){
                return false;
            }
            else{
                composição.add(x);
                return true;
            }

        }  

        public String toString(){

            return "Prato " + nome + ", composto por " + composição.size() + " ingredientes"   ;
        }
        // acrescentar o metodo pratos[i].addIngrediente(aux)

        

    
}
