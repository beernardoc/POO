package Aula12;

public class Movie {

    private final String name;
    private final Double score;
    private final String rating;
    private final String genre;
    private final String runningTime;


    public Movie(String name, Double score,String rating, String genre, String runningTime){

        this.name = name;
        this.score = score;
        this.rating = rating;
        this.genre = genre;
        this.runningTime = runningTime;

    }

    public String toString(){
        return name + " " + score + " " + rating + " " + genre + " " + runningTime;
    }

    public Double getScore(){return this.score;}

    public String getName(){return this.name;}

    public String getRunningTime(){return this.runningTime;}

    public String getGenre(){return this.genre;}




}
