


    
    public class AutomovelLigeiro extends VeiculosMotorizados implements KmPercorridoInterface{
        int numeroQuadro;
        int capacidade;

        AutomovelLigeiro(String matricula, String marca,String modelo,double potencia,int numeroQuadro, int capacidade){
            Matricula = matricula;
            Marca = marca;
            Modelo = modelo;
            Potencia = potencia;
            this.numeroQuadro = numeroQuadro;
            this.capacidade = capacidade;



        }

        public String toString(){
            return "Matricula: " + Matricula + "\n" + "Marca: " + Marca + "\n" + "Modelo: " + Modelo + "\n" + "Potencia: " + Potencia + "\n" + "N° Quadro:: " + numeroQuadro +  "\n" +"Capacidade: " + capacidade + "\n"; 
        }


    }
    

