    package Aula5;

    public class BookTester {
        public static void main( String[] args) {
            Book books[] = new Book[10];
            books[0] = new Book("Turismo em Aveiro", 1980);
            books[1] = new Book("Javaland", 2019, "1234-756");
            books[2] = new Book("Mau tempo na ria");
            books[3] = books[0];
            
            for (int i = 0; i < 4; i++)
                System.out.println(books[i]);   // Resultado 1 

            System.out.println(books[0].getTitle().toUpperCase());   // Resultado 2
            books[0].setISBN("9876-1234");
            System.out.println(books[0].getISBN());    

            books[2] = null;

            for (int i = 0; i < books.length; i++) // Resultado 3
                System.out.println(i + ": " + (books[i] != null ? books[i].getTitle() : "--- Posição vazia"));  

        }
    }



    class Book {
        private String title;
        private int pubYear;
        private String isbn;
        public Book(String t, int py){title = t; pubYear = py;}
        public Book(String t, int py,String is){title = t; pubYear = py;isbn = is;}
        public Book(String t){ title = t;}

    

        @Override
        public String toString() {

            return "Livro: " + this.title + "\n" + "Ano de publicação: " + this.pubYear + "\n" + "o ISBN é: " + this.isbn;

        }

        public String getTitle(){
            return title;
        }
        public String getISBN(){
            return isbn;
        }

        public void setISBN(String j){
            this.isbn = j;
        }

    }

