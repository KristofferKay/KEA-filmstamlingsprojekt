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

    // search method with String as return type
    public String searchMovie(String word) {
        //
        ArrayList<String> searchMovieArray = new ArrayList<>();

        // if statement
        if (word.length() == 1) {
            // variable that takes first char from our Word(input) adds it to lowercase
            char singleChar = word.toLowerCase().charAt(0);

            // for loop, to loop over array. We make a objet based on Movie class and assigns it variable name sm.
            for (Movie sm : movieArray) {
                // if statement to get title, and use varialbe singleChar to find the movies
                if (sm.getTitle().toLowerCase().startsWith(String.valueOf(singleChar))) {
                    // add any resualt to the SearchMovieArray in a string datatype
                    searchMovieArray.add(sm.toString());
                }
            }
            // if nothing is found with first letter, then we are looking for the whole Word
        } else {
            // for loop, to loop over array. We make a objet based on Movie class and assigns it variable name sm.
            for (Movie sm : movieArray) {
                // if statement to get title and the whole word.
                if (sm.getTitle().toLowerCase().startsWith(word.toLowerCase())) {
                    searchMovieArray.add(sm.toString());
                }
            }
        }

        if (searchMovieArray.isEmpty()) {
            return "Filmen findes ikke i din samling, prøv igen.";
        } else {
            return searchMovieArray.toString();
        }
    }

}






