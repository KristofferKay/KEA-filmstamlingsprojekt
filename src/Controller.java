import java.util.ArrayList;

public class Controller {
    MovieCollection movieCollection;

    // constructor to ensure, that we create a new obj called movieCollection, everytime we have created a obj from Controller class.
    public Controller() {
        movieCollection = new MovieCollection();
    }

    // method that add our arguments from Main to our movieCollection obj. We ensures our parameters are stated as in our Movie class
    public void addMovieController(String title, String director, boolean isInColor, int lengthInMinutes, String genre, int yearsCreated) {
        movieCollection.addMovie(title, director, isInColor, lengthInMinutes, genre, yearsCreated);
    }


    // add method that returns string from moviecollection, to ensure output consistency
    public String returnMovieString() {
        return movieCollection.toString();
    }

    // we add string word as a parameter and retun searchMovie from movie collection with arguement word, so we ensures our word variable from main, goes to the SearchMovie method in Movie collection class.
    public String returnSearchMovie(String word) {
        return movieCollection.searchMovie(word);
    }
}