







    public class Taxi extends AutomovelLigeiro{
        int licença;

        Taxi(String matricula, String marca, String modelo,int potencia, int numeroQuadro,int capacidade, int licença) {
            super(matricula, marca, modelo, potencia, numeroQuadro, capacidade);
            this.licença = licença;

            
            
        }



        

        

        public String toString(){
            return "Matricula: " + Matricula + "\n" + "Marca: " + Marca + "\n" + "Modelo: " + Modelo + "\n" + "Potencia: " + Potencia + "\n" + "N° Quadro:: " + numeroQuadro + "Capacidade: " + capacidade + "\n" + "Licença: " + licença + "\n"; 
        }

    }

