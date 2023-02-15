package Aula7;



    public class exemplo {


        class publicação{
            protected String periodico;

            publicação(String periodico){
                this.periodico = periodico;
            }
        }


        class livro{

            protected String autor;


            livro(String autor){
                this.autor = autor;
            }



        }

        class livroeditado extends livro{

            protected String editora;


            livroeditado(String autor,String editora){
                super(autor);
                this.editora = editora;
            }


        }


        class artigo{

            protected String autor;

            artigo(String autor){
                this.autor = autor;
            }

            


        }

        class jornal extends publicação{

            protected artigo a;
            protected String editora;


            jornal(String periodico,artigo a,String editora){
                super(periodico);
                this.a = a;
                this.editora = editora;
                
            }



        }

        


        class revista extends publicação{

            protected artigo b;
            protected String editora;

            revista(String periodico,artigo b, String editora){
                super(periodico);
                this.b = b;
                this.editora = editora;

            }
           






        }



       
 
 }


 
 
    

