import java.util.ArrayList;

public class MovieCollection {
    int count = 0;
    ArrayList<Movie> movieArray = new ArrayList<>();

    // method to assign parameters to addMovie
    public void addMovie(String title, String director, boolean isInColor, int lengthInMinutes, String genre, int yearsCreated) {
        Movie movie1 = new Movie(title, director, isInColor, lengthInMinutes, genre, yearsCreated);
        movieArray.add(movie1);
    }

    // toString for movie collection, returns all movies in the array
    public String toString() {
        String result = "";
        for (Movie m : movieArray) {
            result += m.toString();
        }
        return result;
    }

    // search method to find a movie in the array based on title
    public String searchMovie(String word) {
        for (Movie sm : movieArray) {
            if (sm.getTitle().toLowerCase().contains(word.toLowerCase())) {
                return sm.toString();
            }
        }
            return "Filmen " + " kunne ikke findes i din filmsamling, prøv igen";
    }
}






