package Aula6;

public class conjuntos extends Object implements Cloneable   {
      int[] vetor;
    


    public conjuntos(){
        this.vetor = new int[0];
    }


    public boolean contains(int valor){
        
        for(int i = 0; i < this.vetor.length;i++){
            if(valor == this.vetor[i]){ 
                return true; //presente no vetor
            }
        }
        return false; // não está presente 
    }


    public void insert(int n){

        if(contains(n) == false){
           int[] newvetor = new int[this.vetor.length + 1];

           for(int x =0; x <= this.vetor.length -1; x++){
               newvetor[x] = this.vetor[x];


            }
            newvetor[this.vetor.length] = n;

            this.vetor = newvetor;
            
           
        }

    }
    public void remove(int n){
        int cont = 0;
        if(contains(n) == true){

            int[] newvetor = new int[this.vetor.length - 1];

            for(cont = 0; cont < this.vetor.length; cont++){
                if(this.vetor[cont] == n){
                    for(int y = 0; y < cont; y++){
                        newvetor[y] = this.vetor[y];

                    }
                    for(int j = cont; j < this.vetor.length - 1; j++){
                        newvetor[j] = this.vetor[j+1];
                    }
                    break;
                }
            }

            this.vetor = newvetor;
  

        }
        
        
       

    }


    public int size(){

        return vetor.length;

    }

    public void empty(){
        int[] newvetor = new int[0];

        this.vetor = newvetor;
    }
    

    public conjuntos unir(conjuntos a) throws CloneNotSupportedException{

        conjuntos b = new conjuntos();
        b = (conjuntos) a.clone();

        
        for(int x = 0; x < this.vetor.length; x++){
            b.insert(this.vetor[x]);

        }

        return b;


     

  

    }
    public conjuntos interset(conjuntos a) throws CloneNotSupportedException{

        conjuntos b = new conjuntos();



        for(int x = 0; x < this.vetor.length; x++){

            if(a.contains(this.vetor[x])){
                b.insert(this.vetor[x]);
            }

        }
        return b;


  

    }

    public conjuntos subtrair(conjuntos a){
        conjuntos b = new conjuntos();
        for(int x = 0; x < this.vetor.length; x++){

            if(a.contains(this.vetor[x]) == false){
                b.insert(this.vetor[x]);
            }

        }
        return b;

    }


    public String toString(){
        String a = "";

        for(int x = 0; x < vetor.length; x++){
            a = a+vetor[x] + " ";

        }

        return a;
    }


    
}


