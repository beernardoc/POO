package Aula6;



import Aula5.P.Date51.Date;

public class Pessoa {
    protected String nome;
    protected int cc;
    protected Date dataNasc;


    


    public Pessoa(String nome, int cc, Date d){

        this.nome = nome;
        this.cc = cc;
        this.dataNasc = d;

    }

    public void setname(String name){
        this.nome = name;
    }

    public String getName(){
        return nome;
    }

    public String toString(){
        return nome + "; CC: " + cc + "; Data de Nascimento: " + dataNasc;
    }

   

}

 class Aluno extends Pessoa {
    

    protected int NMec;
    protected Date dataInsc;
    protected int cont = 100;
    

    public Aluno(String nome, int cc, Date d, int NMec, Date dataInsc){
        super(nome, cc, d);
        this.NMec = cont++;
        this.dataInsc = dataInsc;
    }

    public int getNMec(){
        return NMec;
    }
    public String toString(){
        return nome + "; CC: " + cc + "; Data de Nascimento: " + dataNasc + "; Numero mecanografico: " + NMec + "; Data Inscrição: " + dataInsc; 
    }
   

   }

 class Bolseiro extends Aluno{

    private int montante;


    public Bolseiro(String nome, int cc, Date d, int NMec, Date dataInsc, int montante){
        super(nome, cc, d, NMec, dataInsc);
        this.montante = montante;
        

    }

    public int getBolsa(){
        return montante;


    }

    public void setBolsa(int Montante){
        this.montante = Montante;
    }



    public String toString(){
        return nome + "; CC: " + cc + "; Data de Nascimento: " + dataNasc + "; Numero mecanografico: " + NMec + "; Data Inscrição: " + dataInsc + "; Montante: " + montante;
    }

}
