


    public abstract class VeiculosMotorizados {

        public static String Matricula;
        public static String Marca;
        public static String Modelo;
        public static double Potencia;
        int trajeto = 0;
        int total = 0;

        public void trajeto(int quilometros){

            this.trajeto = quilometros;
            total = total + this.trajeto;
            

        }
        public int ultimoTrajeto(){

            return(trajeto);


        }
        public int distanciaTotal(){

            
            return(total);

        }


      
        
    }


    

