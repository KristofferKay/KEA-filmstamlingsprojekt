public class Movie {

    // variables for Movie class
    private String title;
    private String director;
    private boolean isInColor;
    private int lengthInMinutes;
    private String genre;
    private int yearsCreated;

    // constructor, where we take paramters and adds them as arguments
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


    // SETTERS
    public void setTitle(String title) {
        this.title = title;
    }


    public void setDirector(String director) {
        this.director = director;
    }

    public void setYear(int yearsCreated) {
        this.yearsCreated = yearsCreated;
    }

    public void setColor(boolean isInColor) {
        isInColor = isInColor;
    }

    public void setLengthInMinutes(int lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    //to string method, that ensures our input is converted to a string in output

    // override, overrides any previus function of the method
    @Override
    public String toString(){
        String result = "";
        result += "\nFilm title: " + title + " " + "\nFilm instruktør: " + director + " " + "\nÅrstal: " + yearsCreated;

        if (isInColor) {
            result += "\nFilmen er i farve";
        } else {
            result += "\nFilmen er ikke i farve";
        }
        result +=  " " + "\nFilm længde: " + lengthInMinutes + " " + "\nFilm Genre: " + genre + "\n"; // TODO clean up the strings ""
        return result;
    }
}
