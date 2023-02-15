package Aula5.P.bib54;

import java.util.ArrayList;

public class mainbib{
    public static void main(String[] args) {

        Livro catalogo[] = new Livro[10];
        catalogo[0] = new Livro("Java 8", " CONDICIONAL");
        catalogo[1] = new Livro("POO em Java 8");
        catalogo[2] = new Livro("Java para totós", " NORMAL");

        System.out.println("ID = " + catalogo[1].getId(0) + ", "+ catalogo[1].getTitulo());

        catalogo[1].setTipoEmprestimo("NORMAL");
        catalogo[2].setTipoEmprestimo("CONDICIONAL");

        

        for(int x = 0; x < catalogo.length ;x++){

            if(catalogo[x] != null ){

                catalogo[x].getId(x);
                System.out.println(catalogo[x]);
                
            }
            
        }


        ArrayList<Utilizador> alunos = new ArrayList<>(); 
        alunos.add(new Utilizador("Catarina Marques", 80232, "MIEGI"));
        alunos.add(new Utilizador("Joao Silva", 90123, "LEI"));
        
        alunos.get(1).setnMec(80123);

        for (Utilizador u : alunos) { // usando foreach
            System.out.println(u);
            }

        



        
    }
}
