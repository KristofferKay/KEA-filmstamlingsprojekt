public class MovieCollection {

    // arguments
    private Movie[] movieobj;
    int count = 0;


    // method for adding new movie
    public MovieCollection() {
        this.movieobj = new Movie[5];
    }

    public void addToMovieCollection (String movie, String director, boolean isInColor, int lengthInMinutes, String genre, int yearsCreated) {
        movieobj[count++] = new Movie(movie, director, isInColor, lengthInMinutes, genre, yearsCreated);
    }

}
