public class Movie {

    // arguments for Movie class
    private String title;
    private String director;
    private boolean isInColor;
    private int lengthInMinutes;
    private String genre;
    private int yearsCreated;

    // constructor
    public Movie (String title, String director, boolean isInColor, int lengthInMinutes, String genre, int yearsCreated) {
        this.title = title;
        this.director = director;
        this.isInColor = isInColor;
        this.lengthInMinutes = lengthInMinutes;
        this.genre = genre;
        this.yearsCreated = yearsCreated;
    }

    //get movie
    public String getTitle() {
        return title;
    }
    // get director
    public String getDirector() {
        return director;
    }

    //get isInColor
    public boolean isInColor(){
        return isInColor;
    }

    //get lengthInMinutes
    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    // get genre
    public String getGenre() {
        return genre;
    }

    // get for yearscreated
    public int getYearsCreated() {
        return yearsCreated;
    }
    // toString method
    @Override
    public String toString(){
        String result = "";
        result += "\nFilm title: " + title + " " + "\nFilm instruktør: " + director + " " + "\nÅrstal: " + yearsCreated;

        if (isInColor) {
            result += "\nFilmen er i farve";
        } else {
            result += "\nFilmen er ikke i farve";
        }
        result +=  " " + "\nFilm længde: " + lengthInMinutes + " " + "\nFilm Genre: " + genre;
        return result;
    }

//    public String searchMovie() {
//        String resultTitle = "";
//        resultTitle += title;
//        return resultTitle;
//    }
}
