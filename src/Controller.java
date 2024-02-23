import java.util.ArrayList;

public class Controller {
    MovieCollection movieCollection;

    public Controller() {
        movieCollection = new MovieCollection();
    }

    // method
    public void addMovieController(String title, String director, boolean isInColor, int lengthInMinutes, String genre, int yearsCreated) {
        movieCollection.addMovie(title, director, isInColor, lengthInMinutes, genre, yearsCreated);
    }

    public ArrayList<Movie> getMovieCollection(){
        return movieCollection.movieArray;
    }

    // add method that returns string from moviecollection
    public String returnMovieString() {
        return movieCollection.toString();
    }

    //
    public String returnSearchMovie(String word) {
        return movieCollection.searchMovie(word);
    }
}
