import java.util.ArrayList;

public class MovieCollection {
    int count = 0;
    ArrayList<Movie> movieArray = new ArrayList<>();

    // method to assign parmeters to addMovie
    public void addMovie(String movie, String director, boolean isInColor, int lengthInMinutes, String genre, int yearsCreated) {
        Movie movie1 = new Movie(movie, director, isInColor, lengthInMinutes, genre, yearsCreated);
        movieArray.add(count, movie1);
        count++;
    }

    // toString for movie collection
    @Override
    public String toString(){
        String result = "";
        for (Movie m : movieArray) {
            result += m.toString();
        }
        return result;
        }
}

