package Aula12;




import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;



public class mainMovie {

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("Aula12/movies.txt"));
        List<Movie> filmes = new ArrayList<>();
        String[] atual;




        for(String ln : lines){

          atual = ln.split("\t");

          Movie filme = new Movie(atual[0],Double.parseDouble(atual[1]),atual[2],atual[3],atual[4] );

          filmes.add(filme);

        }

        filmes.sort(Comparator.comparing(Movie::getName));
        System.out.println("Lista de filmes ordenados apenas pelo nome:");
        filmes.forEach(System.out::println);


        filmes.sort(Comparator.comparing(Movie::getScore ));
        System.out.println("\nLista de filmes ordenados pelo Score:");
        filmes.forEach(System.out::println);

        filmes.sort(Comparator.comparing(Movie::getRunningTime));
        System.out.println("\nLista de filmes ordenados pelo RunningTime:");
        filmes.forEach(System.out::println);


        System.out.println("\nLista de generos:");
        HashSet<String> generos = new HashSet<>();
        filmes.forEach(p -> generos.add(p.getGenre()));
        generos.forEach(System.out::println);


        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("Aula12/myselection.txt"));

        for(Movie filme : filmes){

            if(filme.getScore() > 60 && Objects.equals(filme.getGenre(), "comedy")){

                buffWrite.write(filme.getName());
                buffWrite.newLine();

            }


        }

        buffWrite.close();



    }







}
