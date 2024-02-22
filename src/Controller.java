public class Controller {
    MovieCollection movieCollection;

    public Controller() {
        movieCollection = new MovieCollection();
    }

    // method
    public void addMovieController(String movie, String director, boolean isInColor, int lengthInMinutes, String genre, int yearsCreated) {
        movieCollection.addMovie(movie, director, isInColor, lengthInMinutes, genre, yearsCreated);
    }

    // add method that returns string from moviecollection
    public String returnMovieString() {
        return movieCollection.toString();
    }
}
