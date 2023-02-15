package Aula5.P.bib54;



public class Livro{
    private int id = 100;
    private String titulo;
    private String tipoEmprestimo;


    





    public Livro(String titulo, String tipoEmprestimo){
        
        this.titulo = titulo;
        this.tipoEmprestimo = tipoEmprestimo;
    }
    public Livro(String titulo){
        
        this.titulo = titulo;
        
    }
     
    public int getId(int x){
        this.id = this.id + x;
        return this.id;

    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTipoEmprestimo(String tipo){
        this.tipoEmprestimo = tipo;

    }


    public String toString(){
        return  "ID = " + id + "; " + titulo + "; " + tipoEmprestimo;
        
    }
    




    
}