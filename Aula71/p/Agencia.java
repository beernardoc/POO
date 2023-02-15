package Aula71.p;




public class Agencia {

    private String name;
    private String adress;

    public void setName(String name){
        this.name = name;
    }
    public void setAdress(String adress){
        this.adress = adress;
    }

    Alojamento alojamentos;
    Cars carros;

    

    public void setAlojamento(){

        alojamentos = new Alojamento();

    }

    public void setCar(){
        carros = new Cars();
    }

    public String toString(){
        return "Nome: " + name + "\n" + "Endereço: " + adress + "\n";
        
    }



    
}


class Alojamento {
    protected int codigo = 0;
    protected String name;
    protected String local;
    protected double preço;
    protected boolean disponibilidade = true;
    protected double avaliacao = 0;
    public int quantidade = 0;  
    
    public String nomeHospede;
    public int tempo;

    Alojamento(){
        quantidade++;
    }

      
    


    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setLocal(String local){
        this.local = local;
    }
    public void setPreco(double preco){
        this.preço = preco;
    }
    public void setDisp(Boolean disp){
        this.disponibilidade = disp;
    }


    public void checkIn(int codigo,String nomedoHospede, int tempo){

        
        

        if(this.disponibilidade == true){
            this.disponibilidade = false;
            this.name = nomedoHospede;
            this.tempo = tempo;
            System.out.println("check-in feito: " + name + " por " + tempo + " dias " + "no alojamento: " + codigo);
        }
        else{
            System.out.println("esta acomodação não está disponivel\n");
        }

    }

    public void checkout(int codigo){

        if(this.disponibilidade == false && this.codigo == codigo){
            this.disponibilidade = true;
            System.out.println("chekout feito por: " + name + " após " + tempo + " dias");
            this.name = "";
            this.tempo = 0;
        }
        else{
            System.out.println("esta acomodação não está ocupada");
        }

    }


   
    


}

class Apartamento extends Alojamento {

    private int numeroQuartos;

    public void setNQuartos(int numeroQuartos){
        
        this.numeroQuartos = numeroQuartos;
    }

    public String toString(){
        return "\n" + "Codigo: " + codigo +"\n" + "Nome: " + name + "\n" + "Endereço: " + local + "\n" + "Preço: " + preço + "\n" + 
        "Quantidade de quartos: " + numeroQuartos + "\n" + "Disponibilidade: " + disponibilidade + "\n" + "Avaliação: " + avaliacao + "\n";
        
    }



}

class Quarto extends Alojamento{
    
    private  String tipo;

    public void setTipo(String tipo){

        this.tipo = tipo;
    }

    public String toString(){
        return "\n" + "Codigo: " + codigo +"\n" + "Nome: " + name + "\n" + "Endereço: " + local + "\n" + "Preço: " + preço + "\n" + 
        "Tipo: " + tipo + "\n" + "Disponibilidade: " + disponibilidade + "\n" + "Avaliação: " + avaliacao + "\n";
        
    }


    
}


class Cars  {

    private boolean disponibilidade;
    private String classe;
    private String motor;
    public  int quantidade = 0;
    private String nameAluguer;
    private int tempoAluguer;

    Cars(){
        quantidade++;
    }

    public void setClasse(String classe){

        this.classe = classe;
    }

    public void setMotor(String motor){

        this.motor = motor;
    }

    public void aluguer(String name, int tempo){

        if(this.disponibilidade == true){
            this.disponibilidade = false;
            this.nameAluguer = name;
            this.tempoAluguer = tempo;
            System.out.println("carro alugado por: " + nameAluguer + " por " + tempoAluguer + " dias");
        }
        else{
            System.out.println("este carro não está disponivel");
        }



    }

    public void devolucao(){
        if(this.disponibilidade == false){
            this.disponibilidade = true;
            System.out.println("carro devolvido por: " + nameAluguer + " após " + tempoAluguer + " dias");
            this.nameAluguer = "";
            this.tempoAluguer = 0;
        }
        else{
            System.out.println("este carro não está alugado");
        }

    }

    public String toString(){
        return "classe: " + classe + "\n" + "Motor: " + motor + "\n";
    }


}


