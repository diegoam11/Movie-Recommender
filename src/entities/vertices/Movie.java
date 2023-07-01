package entities.vertices;

public class Movie {

    private String title;
    private String genre;
    private int year;
    private String director;



    public Movie(String title, String genre, int year, String director ) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.director = director;
    }

    public String getTitle() {
        return this.title;
    }
    public String getGenre() {
        return this.genre;
    }
    public int getYear() {
        return this.year;
    }
    public String getDirector() {
        return this.director;
    }

    public String getString(){
        return "-> " + this.title + ": " + this.genre + " | " + Integer.toString(this.year) + " | " + this.director;
    }
}