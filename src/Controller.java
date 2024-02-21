public class Controller {
    MovieCollection movieCollection;
    Movie movieOverview;

    public Controller() {
        movieCollection = new MovieCollection();
    }

    public void addMovie(String movie, String director, boolean isInColor, int lengthInMinutes, String genre, int yearsCreated) {
        movieCollection.addMovie(movie, director, isInColor, lengthInMinutes, genre, yearsCreated);
    }

}
