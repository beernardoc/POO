




    public class PesadoDeMercadoria extends VeiculosMotorizados implements KmPercorridoInterface{
        int numeroQuadro;
        double peso;
        double cargaMax;


        PesadoDeMercadoria(String matricula, String marca,String modelo,double potencia,int numeroQuadro, double peso,double cargaMax){
            Matricula = matricula;
            Marca = marca;
            Modelo = modelo;
            Potencia = potencia;
            this.numeroQuadro = numeroQuadro;
            this.peso = peso;
            this.cargaMax = cargaMax;
           

        }
        public String toString(){
            return "Matricula: " + Matricula + "\n" + "Marca: " + Marca + "\n" + "Modelo: " + Modelo + "\n" + "Potencia: " + Potencia + "\n" + "N° Quadro:: " + numeroQuadro + "\n" + "Peso: " + peso + "\n" + "CargaMax: " + cargaMax + "\n"; 
        }
    }


