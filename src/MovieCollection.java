import java.util.ArrayList;

public class MovieCollection {
    int count = 0;
    ArrayList<Movie> movieArray = new ArrayList<>();
    // arguments
    // constructor.
//    public MovieCollection() {
//        movieArray = new ArrayList<>();
//    }

    // method
//    public addMovieToArray() {
//        movieArray.add(movie);
//        movieArray.add();
//        movieArray.add(isInColor);
//        movieArray.add()
//    }
    public void addMovie(String movie, String director, boolean isInColor, int lengthInMinutes, String genre, int yearsCreated) {
        Movie movie1 = new Movie(movie, director, isInColor, lengthInMinutes, genre, yearsCreated);
        movieArray.add(count, movie1);
        count++;
    }
}

