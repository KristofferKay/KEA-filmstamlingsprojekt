import java.util.ArrayList;
import java.util.Iterator;

public class MovieCollection {

    // variables
    int count = 0;

    // we create a new array obj called MovieArray, with datattype Movie, based on movie class
    private ArrayList<Movie> movieArray = new ArrayList<>();


    //get method for movie array
    public ArrayList<Movie> getMovieArray() {
        return movieArray;
    }

    // method to assign parameters to addMovie
    public void addMovie(String title, String director, boolean isInColor, int lengthInMinutes, String genre, int yearsCreated) {
        Movie movie1 = new Movie(title, director, isInColor, lengthInMinutes, genre, yearsCreated);
        movieArray.add(movie1);
    }

    // toString for movie collection, returns all movies in the array as a string, this ensures concistency
    public String toString() {
        String result = "";
        for (Movie m : movieArray) {
            result += m.toString();
        }
        // retursn result, to be used in Main to output to user
        return result;
    }

    // search method with String as return type. Parameter word is from Main
    public String searchMovie(String word) {
        // we make a secondary array with datatype string called searchMovieArray
        ArrayList<String> searchMovieArray = new ArrayList<>();

        // if statement where we check if the length "word" is equal to 1. Word is a variable that stores the user input from main.
        if (word.length() == 1) {
            // variable looks at 1st char from our Word(input) adds it to lowercase
            char singleChar = word.toLowerCase().charAt(0);

            // for loop, to loop over array. each time we loop over, We make a objet based on Movie class and assigns it variable name sm.
            for (Movie sm : movieArray) {
                // if statement to get title, and use varialbe singleChar to find the movies. String.valueof takes the value of singleChar and converts it to a string value
                if (sm.getTitle().toLowerCase().startsWith(String.valueOf(singleChar))) {
                    // add any resualt to the SearchMovieArray in a string datatype
                    searchMovieArray.add(sm.toString());
                }
            }
            // if nothing is found with first letter, then we are looking in the 2nd array for the whole Word
        } else {
            // for loop, to loop over array. each time we loop over, We make a objet based on Movie class and assigns it variable name sm.
            for (Movie sm : movieArray) {
                // if statement to get title and the whole word.
                if (sm.getTitle().toLowerCase().startsWith(word.toLowerCase())) {
                    // if title is found, we den add the title to searchMovieArray (2nd array) and converts it to a string
                    searchMovieArray.add(sm.toString());
                }
            }
        }
        // if loop to check if 2nd array searchMovieArray is empty
        if (searchMovieArray.isEmpty()) {
            return "Filmen findes ikke i din samling, prøv igen.";
        } else {
            return searchMovieArray.toString(); // TODO: need to find a alternative for toString, as it adds square brackets to output.
        }
    }

    public String deleteMovie(String delMovieTitle) {
        Iterator<Movie> iterator = movieArray.iterator();
        while (iterator.hasNext()) {
            Movie movie = iterator.next();
            if (movie.getTitle().toLowerCase().equals(delMovieTitle.toLowerCase())) {
                iterator.remove();
            }
        } return delMovieTitle;
    }


    //    public void editMovie(int i, String title, String director, int year, boolean color, int lengthInMinutes, String genre) {
//        Movie m = movieArray.get(i);
//        m.setTitle(title);
//        m.setDirector(director);
//        m.setYear(year);
//        m.setColor(color);
//        m.setLengthInMinutes(lengthInMinutes);
//        m.setGenre(genre);
//    }
}








