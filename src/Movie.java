public class Movie {

    // arguments for Movie class
    private String movie;
    private String director;
    private boolean isInColor;
    private int lengthInMinutes;
    private String genre;
    private int yearsCreated;

    // constructor
    public Movie (String movie, String director, boolean isInColor, int lengthInMinutes, String genre, int yearsCreated) {
        this.movie = movie;
        this.director = director;
        this.isInColor = isInColor;
        this.lengthInMinutes = lengthInMinutes;
        this.genre = genre;
        this.yearsCreated = yearsCreated;
    }

    //get movie
    public String getMovie() {
        return movie;
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

    public int getYearsCreated() {
        return yearsCreated;
    }


}